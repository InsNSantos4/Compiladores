// Generated from Qlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QlangParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(QlangParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(QlangParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(QlangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QlangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionCodeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionCodeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codePIL}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodePIL(QlangParser.CodePILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionIDsubtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionIDsubtype(QlangParser.QuestionIDsubtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionIDtype}
	 * labeled alternative in {@link QlangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionIDtype(QlangParser.QuestionIDtypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAssign(QlangParser.NewAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code executeAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteAssign(QlangParser.ExecuteAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(QlangParser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stdInputAssign}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdInputAssign(QlangParser.StdInputAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(QlangParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConversion(QlangParser.IntegerConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textConversion}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextConversion(QlangParser.TextConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTEXT}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTEXT(QlangParser.ExprTEXTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprINTEGER}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprINTEGER(QlangParser.ExprINTEGERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link QlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(QlangParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execID}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecID(QlangParser.ExecIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code execNewVAR}
	 * labeled alternative in {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecNewVAR(QlangParser.ExecNewVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QlangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(QlangParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usesFile}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesFile(QlangParser.UsesFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code usesCode}
	 * labeled alternative in {@link QlangParser#uses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesCode(QlangParser.UsesCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#grading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrading(QlangParser.GradingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gradingLine}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGradingLine(QlangParser.GradingLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gradingText}
	 * labeled alternative in {@link QlangParser#grades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGradingText(QlangParser.GradingTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QlangParser.TypeContext ctx);
}