// Generated from Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PilParser}.
 */
public interface PilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PilParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(PilParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(PilParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PilParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PilParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PilParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PilParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PilParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PilParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PilParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PilParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionIfElse}
	 * labeled alternative in {@link PilParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionIfElse(PilParser.ConditionIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionIfElse}
	 * labeled alternative in {@link PilParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionIfElse(PilParser.ConditionIfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PilParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PilParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(PilParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(PilParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(PilParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(PilParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(PilParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(PilParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprText(PilParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprText(PilParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealConversion(PilParser.RealConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealConversion(PilParser.RealConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTextConversion(PilParser.TextConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTextConversion(PilParser.TextConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOR}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOR(PilParser.ExprORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOR}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOR(PilParser.ExprORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConversion(PilParser.IntegerConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConversion(PilParser.IntegerConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultiple}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiple(PilParser.ExprMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultiple}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiple(PilParser.ExprMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(PilParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(PilParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParent}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(PilParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParent}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(PilParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(PilParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(PilParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(PilParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(PilParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(PilParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(PilParser.ExprRealContext ctx);
}