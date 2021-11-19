// Generated from dragon/Dragon.g4 by ANTLR 4.9.2

    package dragon;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DragonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DragonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DragonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DragonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DragonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(DragonParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DragonParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DragonParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(DragonParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DragonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DragonParser.StatementContext ctx);
}