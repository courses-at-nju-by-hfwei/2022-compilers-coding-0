// Generated from java-escape by ANTLR 4.11.1

package simpleexpr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExprParser}.
 */
public interface SimpleExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(SimpleExprParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(SimpleExprParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(SimpleExprParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(SimpleExprParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SimpleExprParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link SimpleExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SimpleExprParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SimpleExprParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SimpleExprParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(SimpleExprParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(SimpleExprParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(SimpleExprParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(SimpleExprParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SimpleExprParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SimpleExprParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SimpleExprParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link SimpleExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SimpleExprParser.AddSubExprContext ctx);
}