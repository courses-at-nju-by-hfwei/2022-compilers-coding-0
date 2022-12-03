package symtable;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaseScope implements Scope {
  private String name;
  private Scope enclosingScope;
  private Map<String, Symbol> symbols = new LinkedHashMap<>();

  public BaseScope(String name, Scope enclosingScope) {
    this.name = name;
    this.enclosingScope = enclosingScope;
  }

  @Override
  public String getScopeName() {
    return this.name;
  }

  @Override
  public Scope getEnclosingScope() {
    return this.enclosingScope;
  }

  @Override
  public void define(Symbol symbol) {

  }

  @Override
  public Symbol resolve(String name) {
    return null;
  }
}
