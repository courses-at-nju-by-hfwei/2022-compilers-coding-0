package symtable;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class SymbolTableListener extends CymbolBaseListener {
  private final ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
  private GlobalScope globalScope = null;
  private Scope currentScope = null;

  @Override
  public void enterProg(CymbolParser.ProgContext ctx) {
    globalScope = new GlobalScope(null);
    currentScope = globalScope;
    scopes.put(ctx, globalScope);
  }

  @Override
  public void exitProg(CymbolParser.ProgContext ctx) {
//    System.out.println(scopes.get(ctx));
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
}