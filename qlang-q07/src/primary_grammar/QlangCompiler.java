import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class QlangCompiler extends QlangBaseVisitor<ST> {
   STGroup stg = new STGroupFile("templates/Main.stg");

   @Override public ST visitProgram(QlangParser.ProgramContext ctx) {
      ST prog = stg.getInstanceOf("mainClass");
       for (QlangParser.StmtContext stmt : ctx.stmt()) {
         ST stmtST = visit(stmt);
         prog.add("stmts", stmtST);
       }
       return prog;
   }

   @Override public ST visitQuestionStmt(QlangParser.QuestionStmtContext ctx) {
      return visit(ctx.question());
   }

   @Override public ST visitAssignStmt(QlangParser.AssignStmtContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExecuteStmt(QlangParser.ExecuteStmtContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExportStmt(QlangParser.ExportStmtContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitDeclareStmt(QlangParser.DeclareStmtContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestion(QlangParser.QuestionContext ctx) {
     String questionType = ctx.questionType().getText();

    switch (questionType) {
      case "question":
        return visit(ctx.questionBlock());
      case "holeQuestion":
        return visit(ctx.holeQuestionBlock());
      case "codeQuestion":
        return visit(ctx.codeQuestionBlock());
      default:
        return null;
    }
   }

   @Override public ST visitQuestionType(QlangParser.QuestionTypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestionBlock(QlangParser.QuestionBlockContext ctx) {
      ST question = stg.getInstanceOf("question");
        return question;
   }

   @Override public ST visitHoleQuestionBlock(QlangParser.HoleQuestionBlockContext ctx) {
     ST question = stg.getInstanceOf("holeQuestion");
     String print;
     // concatenate all print statements


    print = ctx.holePrintStatement().getText();
    question.add("question", print);
     return question;
   }

   @Override public ST visitCodeQuestionBlock(QlangParser.CodeQuestionBlockContext ctx) {
        ST question = stg.getInstanceOf("codeOpenQuestion");
        question.add("question", "Dummy question");
        question.add("code", "dummy code");
        return question;
   }

   @Override public ST visitHolePrintStatement(QlangParser.HolePrintStatementContext ctx) {
        ST print = stg.getInstanceOf("print");
        print.add("text", ctx.STRING().getText());
   }

   @Override public ST visitPrintStatement(QlangParser.PrintStatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitUsesStatement(QlangParser.UsesStatementContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAnwser(QlangParser.AnwserContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAssign(QlangParser.AssignContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExecute(QlangParser.ExecuteContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExport(QlangParser.ExportContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitDeclare(QlangParser.DeclareContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitVar(QlangParser.VarContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitIDtype(QlangParser.IDtypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitSubtype(QlangParser.SubtypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitType(QlangParser.TypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }
}
