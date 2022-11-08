// Generated from java-escape by ANTLR 4.11.1

    package dragon;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DragonParser}.
 */
public interface DragonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DragonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DragonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DragonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DragonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DragonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(DragonParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(DragonParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DragonParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DragonParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DragonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DragonParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DragonParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DragonParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DragonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DragonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DragonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DragonParser.StatementContext ctx);
}