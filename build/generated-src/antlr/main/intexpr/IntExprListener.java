// Generated from java-escape by ANTLR 4.11.1

    package intexpr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntExprParser}.
 */
public interface IntExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IntExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IntExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IntExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IntExprParser.ExprContext ctx);
}