package cymbol.listeners;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class FunctionCallListener extends CymbolBaseListener {
  Graph graph = new Graph();
  String currentFunctionName = null;

  @Override
  public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
    currentFunctionName = ctx.ID().getText();
    graph.nodes.add(currentFunctionName);
  }

//  @Override
//  public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
//    currentFunctionName = ctx.ID().getText();
//    graph.nodes.add(currentFunctionName);
//  }

//  @Override
//  public void enterCall(CymbolParser.CallContext ctx) {
//    super.enterCall(ctx);
//  }

  @Override
  public void exitCall(CymbolParser.CallContext ctx) {
    String funcName = ctx.ID().getText();
    graph.edge(currentFunctionName, funcName);
  }
}
