package symtable;

public class Symbol {
  private String name;
  private Type type;

  public Symbol(String name, Type type) {
    this.name = name;
    this.type = type;
  }
}
