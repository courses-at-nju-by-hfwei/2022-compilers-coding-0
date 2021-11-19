// Generated from statement/IfStatFactor.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IfStatFactorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IfStatFactorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IfStatFactorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(IfStatFactorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatFactorParser#stat_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_prime(IfStatFactorParser.Stat_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IfStatFactorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IfStatFactorParser.ExprContext ctx);
}