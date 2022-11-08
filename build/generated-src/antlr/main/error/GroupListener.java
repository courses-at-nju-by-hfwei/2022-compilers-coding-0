// Generated from java-escape by ANTLR 4.11.1

package group;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroupParser}.
 */
public interface GroupListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GroupParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GroupParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GroupParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GroupParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GroupParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GroupParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GroupParser.AtomContext ctx);
}