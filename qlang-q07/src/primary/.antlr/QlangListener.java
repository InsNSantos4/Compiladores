// Generated from /home/rubens/github-classroom/qlang-q07/src/primary/Qlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QlangParser}.
 */
public interface QlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QlangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(QlangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(QlangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(QlangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(QlangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(QlangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(QlangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QlangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QlangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionCodeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionCodeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionCodeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionCodeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codePIL}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterCodePIL(QlangParser.CodePILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codePIL}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitCodePIL(QlangParser.CodePILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionIDsubtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterQuestionIDsubtype(QlangParser.QuestionIDsubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionIDsubtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitQuestionIDsubtype(QlangParser.QuestionIDsubtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionIDtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterQuestionIDtype(QlangParser.QuestionIDtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionIDtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitQuestionIDtype(QlangParser.QuestionIDtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterNewAssign(QlangParser.NewAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitNewAssign(QlangParser.NewAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code executeAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExecuteAssign(QlangParser.ExecuteAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code executeAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExecuteAssign(QlangParser.ExecuteAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAssign(QlangParser.ExprAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAssign(QlangParser.ExprAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stdInputAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStdInputAssign(QlangParser.StdInputAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stdInputAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStdInputAssign(QlangParser.StdInputAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(QlangParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(QlangParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConversion(QlangParser.IntegerConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConversion(QlangParser.IntegerConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTextConversion(QlangParser.TextConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTextConversion(QlangParser.TextConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTEXT}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTEXT(QlangParser.ExprTEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTEXT}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTEXT(QlangParser.ExprTEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprINTEGER}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprINTEGER(QlangParser.ExprINTEGERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprINTEGER}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprINTEGER(QlangParser.ExprINTEGERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(QlangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(QlangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execID}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecID(QlangParser.ExecIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execID}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecID(QlangParser.ExecIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code execNewVAR}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecNewVAR(QlangParser.ExecNewVARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code execNewVAR}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecNewVAR(QlangParser.ExecNewVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QlangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QlangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(QlangParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(QlangParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usesFile}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 */
	void enterUsesFile(QlangParser.UsesFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usesFile}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 */
	void exitUsesFile(QlangParser.UsesFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code usesCode}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 */
	void enterUsesCode(QlangParser.UsesCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code usesCode}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 */
	void exitUsesCode(QlangParser.UsesCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#grading}.
	 * @param ctx the parse tree
	 */
	void enterGrading(QlangParser.GradingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#grading}.
	 * @param ctx the parse tree
	 */
	void exitGrading(QlangParser.GradingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gradingLine}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 */
	void enterGradingLine(QlangParser.GradingLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gradingLine}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 */
	void exitGradingLine(QlangParser.GradingLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gradingText}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 */
	void enterGradingText(QlangParser.GradingTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gradingText}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 */
	void exitGradingText(QlangParser.GradingTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QlangParser.TypeContext ctx);
}