@SuppressWarnings("CheckReturnValue")
public class PilSemanticCheck extends PilBaseVisitor<Boolean> {
   private final RealType realType = new RealType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();

   
   @Override public Boolean visitPrint(PilParser.PrintContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitConditionIfElse(PilParser.ConditionIfElseContext ctx) {
      Boolean res = visit(ctx.expr());
      visit(ctx.trueStat); // ignores result on purpose (to avoid override of all visit*)!
      if (ctx.falseStat != null)
         visit(ctx.falseStat); // ignores result on purpose (to avoid override of all visit*)!
      if (res)
      {
         if (!"boolean".equals(ctx.expr().eType.name()))
         {
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitLoop(PilParser.LoopContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

  

   @Override public Boolean visitExprBoolean(PilParser.ExprBooleanContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprNot(PilParser.ExprNotContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprRead(PilParser.ExprReadContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprMultDivMod(PilParser.ExprMultDivModContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprAddSub(PilParser.ExprAddSubContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   

   @Override public Boolean visitRealConversion(PilParser.RealConversionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitTextConversion(PilParser.TextConversionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprOR(PilParser.ExprORContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIntegerConversion(PilParser.IntegerConversionContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprMultiple(PilParser.ExprMultipleContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprRelational(PilParser.ExprRelationalContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAssign(PilParser.AssignContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }


   @Override public Boolean visitExprID(PilParser.ExprIDContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExprParent(PilParser.ExprParentContext ctx) {
      Boolean res = visit(ctx.expr());

      if(res){
         ctx.eType = ctx.expr().eType; 
      }

      return res;
   }

   @Override public Boolean visitExprText(PilParser.ExprTextContext ctx) {
      ctx.eType = stringType;
      return true;
   }
   
   @Override public Boolean visitExprInt(PilParser.ExprIntContext ctx) {
      ctx.eType = integerType;
      return true;
   }

   @Override public Boolean visitExprBool(PilParser.ExprBoolContext ctx) {
      ctx.eType = booleanType;
      return true;
   }

   @Override public Boolean visitExprReal(PilParser.ExprRealContext ctx) {
      ctx.eType = realType;
      return true;
   }
}
