// Generated from Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PilParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PilParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PilParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PilParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PilParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PilParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionIfElse}
	 * labeled alternative in {@link PilParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionIfElse(PilParser.ConditionIfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(PilParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(PilParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(PilParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(PilParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText(PilParser.ExprTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealConversion(PilParser.RealConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextConversion(PilParser.TextConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOR}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOR(PilParser.ExprORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConversion(PilParser.IntegerConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultiple}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiple(PilParser.ExprMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(PilParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParent}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(PilParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(PilParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(PilParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReal(PilParser.ExprRealContext ctx);
}