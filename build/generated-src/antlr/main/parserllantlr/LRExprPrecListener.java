// Generated from parserllantlr/LRExprPrec.g4 by ANTLR 4.9.2

    package parserllantlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LRExprPrecParser}.
 */
public interface LRExprPrecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LRExprPrecParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LRExprPrecParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprPrecParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LRExprPrecParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LRExprPrecParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LRExprPrecParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LRExprPrecParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LRExprPrecParser.ExprContext ctx);
}