package symtable;

public interface Scope {
  public String getName();

  public void setName(String name);

  public Scope getEnclosingScope();

  public void define(Symbol symbol);

  public Symbol resolve(String name);
}