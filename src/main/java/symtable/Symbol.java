package symtable;

import com.google.common.base.MoreObjects;

public class Symbol {
  final String name;
  final Type type;

  public Symbol(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("type", type)
        .toString();
  }
}