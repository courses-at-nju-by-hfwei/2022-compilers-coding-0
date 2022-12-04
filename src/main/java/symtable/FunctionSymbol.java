package symtable;

public class FunctionSymbol extends BaseScope {
  private String name;

  public FunctionSymbol(String name, Scope enclosingScope) {
    super(name, enclosingScope);
  }
}
