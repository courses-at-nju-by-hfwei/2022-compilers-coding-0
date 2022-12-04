package symtable;

public class BasicTypeSymbol extends Symbol implements Type {
  public BasicTypeSymbol(String name) {
    super(name, null);
  }

  @Override
  public String toString() {
    return name;
  }
}
