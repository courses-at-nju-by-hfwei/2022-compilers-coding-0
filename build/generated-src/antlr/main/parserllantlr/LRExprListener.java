// Generated from java-escape by ANTLR 4.11.1

    package parserllantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LRExprParser}.
 */
public interface LRExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LRExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LRExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LRExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LRExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LRExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LRExprParser.ExprContext ctx);
}