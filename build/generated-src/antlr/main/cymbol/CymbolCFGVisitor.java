// Generated from java-escape by ANTLR 4.11.1

package cymbolcfg;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CymbolCFGParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CymbolCFGVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CymbolCFGParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CymbolCFGParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCFGParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CymbolCFGParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCFGParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CymbolCFGParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCFGParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(CymbolCFGParser.FuncDeclContext ctx);
}