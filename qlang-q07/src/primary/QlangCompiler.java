import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class QlangCompiler extends QlangBaseVisitor<ST> {
	
	private STGroup templates = new STGroupFile("java.stg");
	private int numVars = 0;
	
	private String newVar() {
		numVars++;
		return "v"+ numVars;
	}
	
   @Override public ST visitMain(QlangParser.MainContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("stat", visit(ctx.statements()));
      
      return res;
   }

   @Override public ST visitStatements(QlangParser.StatementsContext ctx) {
      ST res = templates.getInstanceOf("stats");
      for(QlangParser.StatContext sc: ctx.stat())
      	res.add("stat", visit(sc));
      return res;
   }


   @Override public ST visitDeclaration(QlangParser.DeclarationContext ctx) {
      ST res = templates.getInstanceOf("decl");
      String id = ctx.ID().getText();
      res.add("var", id);
      String type = ctx.type().getText();
      res.add("type", type);
      QlangParser.symbolTable.put(id, new VariableSymbol(id, null));
      return res;
   }

   @Override public ST visitQuestionHole(QlangParser.QuestionHoleContext ctx) {
      ST res = templates.getInstanceOf("holeQuestion");
      String var = ctx.variable().getText();
      var = var.replace(".","");
      res.add("var", var);
      res.add("stat", visit(ctx.print()).render());
      return res;
   }

   @Override public ST visitQuestionOpen(QlangParser.QuestionOpenContext ctx) {
      ST res = templates.getInstanceOf("openQuestion");
      String var = ctx.variable().getText();
      var = var.replace(".","");
      res.add("var", var);
      res.add("stat", visit(ctx.print()).render());
      return res;
   }

   @Override public ST visitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx) {
      ST res = templates.getInstanceOf("codeOpenQuestion");
      String var = ctx.variable().getText();
      var = var.replace(".","");
      res.add("var", var);
      for(QlangParser.StatContext sc: ctx.stat())
		   	res.add("stat", visit(sc).render());
      return res;
   }

   @Override public ST visitCodePIL(QlangParser.CodePILContext ctx) {
      ST res = null;
      ST var = visit(ctx.variable());
      String code = ctx.CODEPIL().getText();
		code = code.substring(2,code.length()-2);
      return visitChildren(ctx);
   }

   @Override public ST visitQuestionIDsubtype(QlangParser.QuestionIDsubtypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestionIDtype(QlangParser.QuestionIDtypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitNewAssign(QlangParser.NewAssignContext ctx) {
      ST res = templates.getInstanceOf("assignNew");
      String var = ctx.variable(0).getText();
      var = var.replace(".","");
      res.add("var",var);
      String var1 = ctx.variable(1).getText();
      var1 = var1.replace(".","");
      res.add("class", var1);
      return res;
   }

   @Override public ST visitExecuteAssign(QlangParser.ExecuteAssignContext ctx) {
      ST res = templates.getInstanceOf("assignExecute");
      res.add("var", ctx.variable().getText());
      res.add("method", visit(ctx.execution()).render());
      return res;
   }

   @Override public ST visitExprAssign(QlangParser.ExprAssignContext ctx) {
      ST res = templates.getInstanceOf("assign");
      res.add("stat", visit(ctx.expr()).render());
      res.add("var", ctx.variable().getText());
      res.add("value", ctx.expr().varName);
      return res;
   }

   @Override public ST visitStdInputAssign(QlangParser.StdInputAssignContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExprRead(QlangParser.ExprReadContext ctx) {
      ST res = templates.getInstanceOf("read");
		if (ctx.TEXT() != null){
         res.add("prompt", ctx.TEXT().getText());
      }
      ctx.varName = newVar();
      res.add("scanner", "scanner"+ctx.varName);
      res.add("var", ctx.varName);      
		return res;
   }

   @Override public ST visitIntegerConversion(QlangParser.IntegerConversionContext ctx) {
      ST res = templates.getInstanceOf("intConv");
      res.add("stat", visit(ctx.expr()).render());
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("var2", ctx.expr().varName);
      return res;
   }

   @Override public ST visitTextConversion(QlangParser.TextConversionContext ctx) {
      // ST res = templates.getInstanceOf("strConv");
      // res.add("stat", visit(ctx.expr()).render());
      // ctx.varName = newVar();
      // res.add("var", ctx.varName);
      // res.add("var2", ctx.expr().varName);
      ST res = templates.getInstanceOf("text");
      res.add("value", ctx.expr().getText());
      return res;
   }

   @Override public ST visitExprTEXT(QlangParser.ExprTEXTContext ctx) {
      ST res = templates.getInstanceOf("text");
      res.add("value", ctx.TEXT().getText());
      return res;
   }

   @Override public ST visitExprINTEGER(QlangParser.ExprINTEGERContext ctx) {
      ST res = templates.getInstanceOf("text");
      res.add("value", ctx.INTEGER().getText());
      return res;
   }

   @Override public ST visitExprID(QlangParser.ExprIDContext ctx) {
      ST res = templates.getInstanceOf("text");
      res.add("value", ctx.ID().getText());
      return res;
      
   }

   @Override public ST visitExecID(QlangParser.ExecIDContext ctx) {
      ST res = templates.getInstanceOf("execute");
      res.add("class", ctx.ID().getText());
      return res;
   }

   @Override public ST visitExecNewVAR(QlangParser.ExecNewVARContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitPrint(QlangParser.PrintContext ctx) {
      if (ctx.TEXT() != null) {
		   ST res = templates.getInstanceOf("print");
		   String value = "";
		   for(QlangParser.ExprContext ec: ctx.expr()) {
				String expr = visit(ec).render();
				expr = expr.substring(1, expr.length()-1);
				value = value + expr;
			}
		   res.add("value", value);
      
      	String ans = ctx.TEXT().getText();
      	//ans = ans.substring(1,ans.length()-1);
      	res.add("ans", ans);
      	return res;
      } else {
      	ST res = templates.getInstanceOf("print");
      	String value = " ";
      	for(QlangParser.ExprContext ec: ctx.expr()) {
				// String temp = visit(ec).render();
            // if(temp == null) temp = "null"; // codigo dummy
            // value = value + "+" + temp;
				// //expr = expr.substring(1, expr.length()-1);
				
            // System.out.println(value);
			}
		   res.add("value", value);
      	return res;
      	
      }
      
   }

   @Override public ST visitExport(QlangParser.ExportContext ctx) {
      ST res = templates.getInstanceOf("export");
		String file = ctx.TEXT().getText();    
		res.add("path", file);
      return res;
   }

   @Override public ST visitUsesCode(QlangParser.UsesCodeContext ctx) {
      ST res = templates.getInstanceOf("uses");
      return res;
   }
   
   @Override public ST visitUsesFile(QlangParser.UsesFileContext ctx) {
      ST res = templates.getInstanceOf("uses");
      String file = ctx.TEXT().getText();
      res.add("value", file);
      return res;
   }

   @Override public ST visitGrading(QlangParser.GradingContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitGradingLine(QlangParser.GradingLineContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitGradingText(QlangParser.GradingTextContext ctx) {
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
