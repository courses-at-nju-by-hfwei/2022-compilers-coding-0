// Generated from parserantlr/expr/ExprRR.g4 by ANTLR 4.9.2

    package parserantlr.expr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprRRParser}.
 */
public interface ExprRRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprRRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprRRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprRRParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRRParser#expr_prime}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prime(ExprRRParser.Expr_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRRParser#expr_prime}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prime(ExprRRParser.Expr_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRRParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprRRParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRRParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprRRParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRRParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void enterTerm_prime(ExprRRParser.Term_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRRParser#term_prime}.
	 * @param ctx the parse tree
	 */
	void exitTerm_prime(ExprRRParser.Term_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprRRParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExprRRParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprRRParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExprRRParser.FactorContext ctx);
}