// Generated from parserllantlr/LRExprPrec.g4 by ANTLR 4.9.2

    package parserllantlr;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link LRExprPrecVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class LRExprPrecBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LRExprPrecVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStat(LRExprPrecParser.StatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(LRExprPrecParser.ExprContext ctx) { return visitChildren(ctx); }
}