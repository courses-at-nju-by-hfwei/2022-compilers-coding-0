// Generated from parserll/IfStat.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfStatParser}.
 */
public interface IfStatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(IfStatParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(IfStatParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IfStatParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IfStatParser.ExprContext ctx);
}