package symtable;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class DefPhase extends CymbolBaseListener {
  private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
  private Scope currentScope = null;

  @Override
  public void enterProg(CymbolParser.ProgContext ctx) {
    GlobalScope globalScope = new GlobalScope(null);
    scopes.put(ctx, globalScope);
    currentScope = globalScope;
  }

  @Override
  public void exitProg(CymbolParser.ProgContext ctx) {
    System.out.println(scopes.get(ctx));
  }
}