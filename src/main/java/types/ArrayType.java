package types;

import symtable.Type;

public class ArrayType implements Type {
  int dimension;
  Type subType;

  public ArrayType(int dimension, Type subType) {
    this.dimension = dimension;
    this.subType = subType;
  }

  @Override
  public String toString() {
    StringBuilder typeStr = new StringBuilder();
    if (dimension == 0) {
      return typeStr.append(subType).toString();
    }
    return typeStr.append("array(")
        .append(dimension)
        .append(",")
        .append(subType)
        .toString();
  }
}