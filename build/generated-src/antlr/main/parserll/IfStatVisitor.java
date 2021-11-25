// Generated from parserll/IfStat.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IfStatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IfStatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IfStatParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(IfStatParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IfStatParser.ExprContext ctx);
}