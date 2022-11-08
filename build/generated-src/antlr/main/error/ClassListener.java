// Generated from java-escape by ANTLR 4.11.1

package classdef;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClassParser}.
 */
public interface ClassListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClassParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ClassParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ClassParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(ClassParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(ClassParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(ClassParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(ClassParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ClassParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ClassParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClassParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ClassParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClassParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ClassParser.ExprContext ctx);
}