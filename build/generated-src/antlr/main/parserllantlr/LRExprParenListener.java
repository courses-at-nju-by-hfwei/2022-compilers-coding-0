// Generated from parserllantlr/LRExprParen.g4 by ANTLR 4.9.2

    package parserllantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LRExprParenParser}.
 */
public interface LRExprParenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LRExprParenParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LRExprParenParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprParenParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LRExprParenParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LRExprParenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LRExprParenParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprParenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LRExprParenParser.ExprContext ctx);
}