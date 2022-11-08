// Generated from java-escape by ANTLR 4.11.1

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprPredParser}.
 */
public interface ExprPredListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprPredParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprPredParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprPredParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprPredParser.ExprContext ctx);
}