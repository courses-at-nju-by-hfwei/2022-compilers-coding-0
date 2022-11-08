// Generated from java-escape by ANTLR 4.11.1

package classdef;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClassVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClassParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ClassParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(ClassParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(ClassParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ClassParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClassParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ClassParser.ExprContext ctx);
}