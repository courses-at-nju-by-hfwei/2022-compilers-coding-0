// Generated from parserantlr/expr/ExprLR.g4 by ANTLR 4.9.2

    package parserantlr.expr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprLRParser}.
 */
public interface ExprLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprLRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprLRParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLRParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprLRParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLRParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprLRParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprLRParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExprLRParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprLRParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExprLRParser.FactorContext ctx);
}