// Generated from parserantlr/expr/ExprLR.g4 by ANTLR 4.9.2

    package parserantlr.expr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprLRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprLRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprLRParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprLRParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprLRParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExprLRParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprLRParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExprLRParser.FactorContext ctx);
}