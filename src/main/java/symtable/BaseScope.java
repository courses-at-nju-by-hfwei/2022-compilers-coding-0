package symtable;

import com.google.common.base.MoreObjects;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaseScope implements Scope {
  private final String name;
  private final Scope enclosingScope;
  private final Map<String, Symbol> symbols = new LinkedHashMap<>();

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
    symbols.put(symbol.getName(), symbol);
    System.out.println("+" + symbol.toString());
  }

  @Override
  public Symbol resolve(String name) {
    Symbol symbol = symbols.get(name);
    if (symbol != null) {
      System.out.println("*" + symbol.toString());
      return symbol;
    }

    if (enclosingScope != null) {
      return enclosingScope.resolve(name);
    }

    System.err.println("Cannot find " + name);
    return null;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("symbols", symbols.values().toString())
        .toString();
  }
}
