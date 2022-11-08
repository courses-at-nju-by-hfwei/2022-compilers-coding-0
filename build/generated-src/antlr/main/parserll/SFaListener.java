// Generated from java-escape by ANTLR 4.11.1

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SFaParser}.
 */
public interface SFaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SFaParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SFaParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SFaParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SFaParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SFaParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(SFaParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link SFaParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(SFaParser.FContext ctx);
}