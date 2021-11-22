// Generated from cymbol/CymbolCFG.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolCFGParser}.
 */
public interface CymbolCFGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolCFGParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CymbolCFGParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCFGParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CymbolCFGParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCFGParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CymbolCFGParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCFGParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CymbolCFGParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCFGParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolCFGParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCFGParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolCFGParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCFGParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(CymbolCFGParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCFGParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(CymbolCFGParser.FuncDeclContext ctx);
}