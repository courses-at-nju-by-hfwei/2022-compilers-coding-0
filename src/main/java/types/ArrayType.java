package types;

import symtable.Type;

public class ArrayType implements Type {
  int count;
  Type subType;

  public ArrayType(int count, Type subType) {
    this.count = count;
    this.subType = subType;
  }

  @Override
  public String toString() {
    StringBuilder typeStr = new StringBuilder();
    if (count == 0) {
      return typeStr.append(subType).toString();
    }
    return typeStr.append("array(")
        .append(count)
        .append(",")
        .append(subType)
        .toString();
  }
}