// Generated from parserll/IfStatFactor.g4 by ANTLR 4.9.2

    package parserll;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfStatFactorParser}.
 */
public interface IfStatFactorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfStatFactorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(IfStatFactorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatFactorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(IfStatFactorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatFactorParser#stat_prime}.
	 * @param ctx the parse tree
	 */
	void enterStat_prime(IfStatFactorParser.Stat_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatFactorParser#stat_prime}.
	 * @param ctx the parse tree
	 */
	void exitStat_prime(IfStatFactorParser.Stat_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfStatFactorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IfStatFactorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfStatFactorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IfStatFactorParser.ExprContext ctx);
}