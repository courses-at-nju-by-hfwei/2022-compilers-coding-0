// Generated from parserll/OptionalInit.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OptionalInitParser}.
 */
public interface OptionalInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Init}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void enterInit(OptionalInitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Init}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void exitInit(OptionalInitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoInit}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void enterNoInit(OptionalInitParser.NoInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoInit}
	 * labeled alternative in {@link OptionalInitParser#optional_init}.
	 * @param ctx the parse tree
	 */
	void exitNoInit(OptionalInitParser.NoInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OptionalInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OptionalInitParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OptionalInitParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OptionalInitParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OptionalInitParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(OptionalInitParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OptionalInitParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(OptionalInitParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OptionalInitParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(OptionalInitParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link OptionalInitParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(OptionalInitParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link OptionalInitParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(OptionalInitParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OptionalInitParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(OptionalInitParser.Func_callContext ctx);
}