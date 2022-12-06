package types;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

import symtable.BasicTypeSymbol;
import symtable.Type;
import symtable.VariableSymbol;

public class TypeCheckingListener extends ArrayBaseListener {
  private final Map<String, VariableSymbol> symbolTable = new HashMap<>();
  private final ParseTreeProperty<Type> arrayTypeProperty = new ParseTreeProperty<>();
  private final ParseTreeProperty<Type> basicTypeProperty = new ParseTreeProperty<>();

  @Override
  public void exitArrDeclStat(ArrayParser.ArrDeclStatContext ctx) {
    System.out.println("ArrayType : " + arrayTypeProperty.get(ctx.arrDecl()));
  }

  @Override
  public void exitVarDecl(ArrayParser.VarDeclContext ctx) {
    String varName = ctx.ID().getText();
    String typeName = ctx.type().getText();
    Type type = new BasicTypeSymbol(typeName);

    symbolTable.put(varName, new VariableSymbol(varName, type));
  }

  @Override
  public void enterArrDecl(ArrayParser.ArrDeclContext ctx) {
    String typeName = ctx.type().getText();
    Type basicType = new BasicTypeSymbol(typeName);
    basicTypeProperty.put(ctx, basicType);
  }

  @Override
  public void exitArrDecl(ArrayParser.ArrDeclContext ctx) {
    String typeName = ctx.type().getText();
    Type type = new BasicTypeSymbol(typeName);

    Type subArrayType = arrayTypeProperty.get(ctx.arrayType());
    Type arrayType = new ArrayType(0, (ArrayType) subArrayType);
    arrayTypeProperty.put(ctx, arrayType);

    String arrayName = ctx.ID().getText();
    symbolTable.put(arrayName, new VariableSymbol(arrayName, arrayType));

  }

  @Override
  public void enterNonEmptyArrayType(ArrayParser.NonEmptyArrayTypeContext ctx) {
    basicTypeProperty.put(ctx, basicTypeProperty.get(ctx.parent));
  }

  @Override
  public void exitNonEmptyArrayType(ArrayParser.NonEmptyArrayTypeContext ctx) {
    int dimension = Integer.parseInt(ctx.INT().getText());
    Type subArrayType = arrayTypeProperty.get(ctx.arrayType());

    Type arrayType = new ArrayType(dimension, (ArrayType) subArrayType);
    this.arrayTypeProperty.put(ctx, arrayType);
  }

  @Override
  public void enterEmptyArrayType(ArrayParser.EmptyArrayTypeContext ctx) {
    basicTypeProperty.put(ctx, basicTypeProperty.get(ctx.parent));
  }

  @Override
  public void exitEmptyArrayType(ArrayParser.EmptyArrayTypeContext ctx) {
    arrayTypeProperty.put(ctx, new ArrayType(0, basicTypeProperty.get(ctx.parent)));
  }

  @Override
  public void exitArrayIndex(ArrayParser.ArrayIndexContext ctx) {
    arrayTypeProperty.put(ctx,
        ((ArrayType) arrayTypeProperty.get(ctx.primary)).subType);
  }

  @Override
  public void exitAssignStat(ArrayParser.AssignStatContext ctx) {
    Type lhs = arrayTypeProperty.get(ctx.lhs);
    Type rhs = arrayTypeProperty.get(ctx.rhs);
    System.out.println(lhs + " : " + rhs);
  }

  @Override
  public void exitId(ArrayParser.IdContext ctx) {
    arrayTypeProperty.put(ctx, symbolTable.get(ctx.ID().getText()).getType());
  }

  @Override
  public void exitInt(ArrayParser.IntContext ctx) {
    arrayTypeProperty.put(ctx, new BasicTypeSymbol("int"));
  }
}