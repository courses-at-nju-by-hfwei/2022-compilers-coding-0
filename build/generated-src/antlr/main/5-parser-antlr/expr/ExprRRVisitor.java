// Generated from 5-parser-antlr/expr/ExprRR.g4 by ANTLR 4.9.2

    package parserantlr.expr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprRRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprRRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprRRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprRRParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRRParser#expr_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_prime(ExprRRParser.Expr_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRRParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExprRRParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRRParser#term_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_prime(ExprRRParser.Term_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprRRParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExprRRParser.FactorContext ctx);
}