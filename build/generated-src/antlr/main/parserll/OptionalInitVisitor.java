// Generated from parserll/OptionalInit.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OptionalInitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OptionalInitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Init}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(OptionalInitParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoInit}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoInit(OptionalInitParser.NoInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OptionalInitParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(OptionalInitParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OptionalInitParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(OptionalInitParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link OptionalInitParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(OptionalInitParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link OptionalInitParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(OptionalInitParser.Func_callContext ctx);
}