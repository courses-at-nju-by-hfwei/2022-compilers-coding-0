package cymbol.calc.visitor;

import static cymbol.CymbolParser.ADD;
import static cymbol.CymbolParser.MUL;

import cymbol.CymbolBaseVisitor;
import cymbol.CymbolParser;

public class CalcVisitor extends CymbolBaseVisitor<Integer> {
  @Override
  public Integer visitNegate(CymbolParser.NegateContext ctx) {
    return -visit(ctx.expr());
  }

  @Override
  public Integer visitMultDiv(CymbolParser.MultDivContext ctx) {
    int lvalue = visit(ctx.lhs);
    int rvalue = visit(ctx.rhs);

    return ctx.op.getType() == MUL ?
        lvalue * rvalue : lvalue / rvalue;
  }

  @Override
  public Integer visitAddSub(CymbolParser.AddSubContext ctx) {
    int lvalue = visit(ctx.lhs);
    int rvalue = visit(ctx.rhs);

    return ctx.op.getType() == ADD ?
        lvalue + rvalue : lvalue - rvalue;
  }

  @Override
  public Integer visitInt(CymbolParser.IntContext ctx) {
    return Integer.valueOf(ctx.INT().getText());
  }

  @Override
  public Integer visitParens(CymbolParser.ParensContext ctx) {
    return visit(ctx.expr());
  }
}