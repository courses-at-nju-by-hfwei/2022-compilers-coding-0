package cymbol.callgraph;

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

  @Override
  public void enterCall(CymbolParser.CallContext ctx) {
    String funcName = ctx.ID().getText();
    graph.edge(currentFunctionName, funcName);
  }
}
