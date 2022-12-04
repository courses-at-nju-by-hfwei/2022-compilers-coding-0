package symtable;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class SymbolTableListener extends CymbolBaseListener {
  private final SymbolTableTreeGraph graph = new SymbolTableTreeGraph();
  private GlobalScope globalScope = null;
  private Scope currentScope = null;
  private int localScopeCounter = 0;

  @Override
  public void enterProg(CymbolParser.ProgContext ctx) {
    globalScope = new GlobalScope(null);
    currentScope = globalScope;
  }

  @Override
  public void exitProg(CymbolParser.ProgContext ctx) {
    graph.addNode(SymbolTableTreeGraph.toDot(currentScope));
  }

  @Override
  public void exitVarDecl(CymbolParser.VarDeclContext ctx) {
    String typeName = ctx.type().getText();
    Type type = (Type) globalScope.resolve(typeName);

    String varName = ctx.ID().getText();
    VariableSymbol varSymbol = new VariableSymbol(varName, type);
    currentScope.define(varSymbol);
  }

  @Override
  public void exitId(CymbolParser.IdContext ctx) {
    String varName = ctx.ID().getText();
    currentScope.resolve(varName);
  }

  @Override
  public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    String retType = ctx.type().getText();
    globalScope.resolve(retType);

    String funcName = ctx.ID().getText();

    FunctionSymbol func = new FunctionSymbol(funcName, currentScope);
    graph.addEdge(funcName, currentScope.getName());

    currentScope.define(func);
    currentScope = func;
  }

  @Override
  public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    graph.addNode(SymbolTableTreeGraph.toDot(currentScope));
    currentScope = currentScope.getEnclosingScope();
  }

  @Override
  public void exitFormalParameter(CymbolParser.FormalParameterContext ctx) {
    String typeName = ctx.type().getText();
    Type type = (Type) globalScope.resolve(typeName);

    String varName = ctx.ID().getText();

    VariableSymbol varSymbol = new VariableSymbol(varName, type);
    currentScope.define(varSymbol);
  }

  @Override
  public void enterBlock(CymbolParser.BlockContext ctx) {
    LocalScope localScope = new LocalScope(currentScope);

    String localScopeName = localScope.getName() + localScopeCounter;
    localScope.setName(localScopeName);
    localScopeCounter++;

    graph.addEdge(localScopeName, currentScope.getName());

    currentScope = localScope;
  }

  @Override
  public void exitBlock(CymbolParser.BlockContext ctx) {
    graph.addNode(SymbolTableTreeGraph.toDot(currentScope));
    currentScope = currentScope.getEnclosingScope();
  }

  public SymbolTableTreeGraph getGraph() {
    return graph;
  }
}