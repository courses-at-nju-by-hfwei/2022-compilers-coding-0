// Generated from parserllantlr/LRExprParen.g4 by ANTLR 4.9.2

    package parserllantlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LRExprParenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LRExprParenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LRExprParenParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LRExprParenParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LRExprParenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LRExprParenParser.ExprContext ctx);
}