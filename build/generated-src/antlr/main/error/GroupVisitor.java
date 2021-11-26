// Generated from error/Group.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroupParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GroupVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GroupParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(GroupParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GroupParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(GroupParser.AtomContext ctx);
}