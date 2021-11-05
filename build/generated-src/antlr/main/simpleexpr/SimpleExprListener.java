// Generated from simpleexpr/SimpleExpr.g4 by ANTLR 4.9.2

    package simpleexpr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExprParser}.
 */
public interface SimpleExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleExprParser.ExprContext ctx);
}