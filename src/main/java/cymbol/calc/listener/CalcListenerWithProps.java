package cymbol.calc.listener;

import static cymbol.CymbolParser.ADD;
import static cymbol.CymbolParser.MUL;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import cymbol.CymbolBaseListener;
import cymbol.CymbolParser;

public class CalcListenerWithProps extends CymbolBaseListener {
  private final ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

  public ParseTreeProperty<Integer> getValues() {
    return values;
  }

  @Override
  public void exitExprStat(CymbolParser.ExprStatContext ctx) {
    System.out.println("Result = " + values.get(ctx.expr()));
  }

  @Override
  public void exitNegate(CymbolParser.NegateContext ctx) {
    values.put(ctx, -values.get(ctx.expr()));
  }

  @Override
  public void exitMultDiv(CymbolParser.MultDivContext ctx) {
    int lvalue = values.get(ctx.lhs);
    int rvalue = values.get(ctx.rhs);

    if (ctx.op.getType() == MUL) {
      values.put(ctx, lvalue * rvalue);
    } else {
      values.put(ctx, lvalue / rvalue);
    }
  }

  @Override
  public void exitAddSub(CymbolParser.AddSubContext ctx) {
    int lvalue = values.get(ctx.lhs);
    int rvalue = values.get(ctx.rhs);

    if (ctx.op.getType() == ADD) {
      values.put(ctx, lvalue + rvalue);
    } else {
      values.put(ctx, lvalue - rvalue);
    }
  }

  @Override
  public void exitInt(CymbolParser.IntContext ctx) {
    values.put(ctx, Integer.valueOf(ctx.INT().getText()));
  }

  @Override
  public void exitParens(CymbolParser.ParensContext ctx) {
    values.put(ctx, values.get(ctx.expr()));
  }
}