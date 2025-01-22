import java.util.Scanner;
@SuppressWarnings("CheckReturnValue")
public class PilInterpreter extends PilBaseVisitor<Value> {

   // @Override public Value visitMain(PilParser.MainContext ctx) {
   //    Value res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Value visitStatement(PilParser.StatementContext ctx) {
   //    Value res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }

   // @Override public Value visitStat(PilParser.StatContext ctx) {
   //    Value res = null;
   //    return visitChildren(ctx);
   //    //return res;
   // }


   @Override public Value visitPrint(PilParser.PrintContext ctx) {
      Value res =  visit(ctx.expr());
      if (ctx.printType.getText().equals("write") ) {
	      System.out.print(res);      	
      } else {
      	System.out.println(res);
      }
      return res;
   }

   @Override public Value visitConditionIfElse(PilParser.ConditionIfElseContext ctx) {
      Value res = visit(ctx.expr());
      if (res.boolValue())
      	visit(ctx.trueStat);
      else if (ctx.falseStat != null)
      	visit(ctx.falseStat);
      return res;
   }

   @Override public Value visitLoop(PilParser.LoopContext ctx) {
      Value v1 = null;
      Value res = visit(ctx.expr());
      

      if(ctx.cond.getText().equals("until")){
         res = new BooleanValue(!res.boolValue());
      } 
      else if(ctx.cond.getText().equals("while")){
         res = new BooleanValue(res.boolValue());
      }
      
      while (res.boolValue()){
         for (PilParser.StatContext t: ctx.stat())
         	v1 = visit(t);
         res = visit(ctx.expr());
         if(ctx.cond.getText().equals("until")){
		      res = new BooleanValue(!res.boolValue());
		   } 
		   else if(ctx.cond.getText().equals("while")){
		      res = new BooleanValue(res.boolValue());
		   }
         
      }
		// NEEDS TO BE CHANGED
		return v1;
   }

   @Override public Value visitExprNot(PilParser.ExprNotContext ctx) {
      Value res = visit(ctx.expr());
      return new BooleanValue(!res.boolValue());
   }

   @Override public Value visitExprRead(PilParser.ExprReadContext ctx) {
      Scanner pilScanner = new Scanner(System.in);
      Value res = null;
      if (ctx.Text() != null) {
      	System.out.print(ctx.Text().getText());
      }
      res = new StringValue(pilScanner.nextLine());
      return res;
   }

   @Override public Value visitExprMultDivMod(PilParser.ExprMultDivModContext ctx) {
      Value res = null;
      Value e1 = visit(ctx.expr(0));
      Value e2 = visit(ctx.expr(1));
      switch (ctx.op.getText()) {
      	case "*":
      		res = mulValues(e1,e2);
      		break;
      	case ":":
      		res = divValues(e1,e2);
      		break;
      	case "%":
      		res = remValues(e1,e2);
      		break;
      }
      return res;
   }

   @Override public Value visitExprAddSub(PilParser.ExprAddSubContext ctx) {
      Value res = null;
      Value e1 = visit(ctx.expr(0));
      Value e2 = visit(ctx.expr(1));
      switch (ctx.op.getText()) {
      	case "+":
      		res = addValues(e1,e2);
      		break;
      	case "-":
      		res = subValues(e1,e2);
      		break;
      }
      return res;
   }

   @Override public Value visitExprBoolean(PilParser.ExprBooleanContext ctx) {
      Value res = null;
      Value e1 = visit(ctx.expr(0));
      Value e2 = visit(ctx.expr(1));
      boolean val = false;
      if (e1.type().name().equals("boolean") && e2.type().name().equals("boolean")) {
		   switch (ctx.op.getText()) {
		   	case "and":
		   		val = e1.boolValue() && e2.boolValue();
		   		break;
		   	case "and then":
		   		if (!e1.boolValue())
		   			val = false;
		   		else if (e2.boolValue()) {
		   			val = true;	
		   		} else {
		   			val = false;
		   		}
		   		break;
		   	case "or else":
		   		if (e1.boolValue())
		   			val = true;
		   		else if (!e2.boolValue()) {
		   			val = false;	
		   		} else {
		   			val = true;
		   		}
		   		break;
		   	case "xor":
		   		val = e1.boolValue() ^ e2.boolValue();
		   		break;
		   	case "implies":
		   		val = !e1.boolValue() || e2.boolValue();
		   		break;
		   }
      }
		
      res = new BooleanValue(val);
      return res;
   }

   @Override public Value visitRealConversion(PilParser.RealConversionContext ctx) {
      Value res = visit(ctx.expr());
      res = conversion(res, new RealType());
      return res;
   }

   @Override public Value visitTextConversion(PilParser.TextConversionContext ctx) {
      Value res = visit(ctx.expr());
      res = conversion(res, new StringType());
      return res;
   }

   @Override public Value visitExprOR(PilParser.ExprORContext ctx) {
      Value res = null;
      Value res1 = visit(ctx.expr(0));
      Value res2 = visit(ctx.expr(1));

		if ("boolean".equals(""+res1.type()) && "boolean".equals(""+res2.type())){
			res = new BooleanValue(res1.boolValue() || res2.boolValue());
		}
		else{
			assert false : "values are not boolean type";
		}
		return res;
   }

   @Override public Value visitIntegerConversion(PilParser.IntegerConversionContext ctx) {
      Value res = visit(ctx.expr());
      res = conversion(res, new IntegerType());
      return res;
   }

   @Override public Value visitExprMultiple(PilParser.ExprMultipleContext ctx) {
      Value res = null;
      Value s1 = visit(ctx.expr(0));
      Value s2 = visit(ctx.expr(1));
      res = new StringValue(s1.toString().concat(s2.toString()));
      return res;
   }

   @Override public Value visitExprRelational(PilParser.ExprRelationalContext ctx) {
      Value res = null;
      Value r1 = visit(ctx.expr(0));
      Value r2 = visit(ctx.expr(1));

      switch (ctx.op.getText()) {
         case "=":
            res = equalValues(r1, r2, true);
            break;
      
         case "/=":
			res = equalValues(r1, r2, false);
            break;

         case ">":
            res = greaterValues(r1, r2);
            break;
         
         case "<":
		 	res = lesserValues(r1, r2);
            break;
           
         case ">=":
		 	res = greaterValues(r1, r2);
		 	res.setBoolValue(res.boolValue() || equalValues(r1, r2, true).boolValue());
            break;
         
         case "<=":
			res = lesserValues(r1, r2);
			res.setBoolValue(res.boolValue() || equalValues(r1, r2, true).boolValue());
            break;

         default:
            break;
      }

		return res;

   }

   @Override public Value visitExprParent(PilParser.ExprParentContext ctx) {
      Value res = visit(ctx.expr());
      return res;
   }

   @Override public Value visitAssign(PilParser.AssignContext ctx) {
      Value res = visit(ctx.expr());
      String id = ctx.ID().getText();

		// if (!PilParser.symbolTable.containsKey(id)) {
		VariableSymbol value = new VariableSymbol(id, res.type());
		value.setValueDefined();
		PilParser.symbolTable.put(id, value);
		PilParser.symbolTable.get(id).setValue(res);
		
		// }
		// else{
		// 	PilParser.symbolTable.get(id).setValue(res);
		// }	
      return res;

   }
   
	@Override public Value visitExprID(PilParser.ExprIDContext ctx) {
      String id = ctx.ID().getText();
		// if (!PilParser.symbolTable.containsKey(id)) {
		// 	System.out.println("Variable " + id + " not declared");
		// }
		// else{
		// 	if (!PilParser.symbolTable.get(id).valueDefined()){
		// 		System.out.println("Variable " + id + " not defined");
		// 	}
			
		// }
		return PilParser.symbolTable.get(id).value();
   }

   @Override public Value visitExprText(PilParser.ExprTextContext ctx) {
      String value = ctx.Text().getText();
      value = value.substring(1, value.length()-1);
      return new StringValue(String.valueOf(value));			
   }

   @Override public Value visitExprBool(PilParser.ExprBoolContext ctx) {
      return new BooleanValue(ctx.BOOLEAN().getText().equals("true"));		
   }

   @Override public Value visitExprReal(PilParser.ExprRealContext ctx) {
      return new RealValue(Double.parseDouble(ctx.REAL().getText()));		
   }

   @Override public Value visitExprInt(PilParser.ExprIntContext ctx) {
      return new IntegerValue(Integer.parseInt(ctx.INTEGER().getText()));	
   }
   
   protected Value addValues(Value v1, Value v2) {
   	assert v1 != null;
   	assert v2 != null;
   	
   	Value res = null;
   	
   	if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() + v2.realValue());
		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() + v2.intValue());
   	else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.intValue() + v2.realValue());
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new IntegerValue(v1.intValue() + v2.intValue());
   	else
   		assert false: "missing semantic error check!";
   	
   	return res;
   }
   
   protected Value subValues(Value v1, Value v2) {
   	assert v1 != null;
   	assert v2 != null;
   	
   	Value res = null;
   	
   	if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() - v2.realValue());
		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() - v2.intValue());
   	else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.intValue() - v2.realValue());
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new IntegerValue(v1.intValue() - v2.intValue());
   	else
   		assert false: "missing semantic error check!";
   	
   	return res;
   }
   
   protected Value mulValues(Value v1, Value v2) {
   	assert v1 != null;
   	assert v2 != null;
   	
   	Value res = null;
   	
   	if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() * v2.realValue());
		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new RealValue(v1.realValue() * v2.intValue());
   	else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
   		res = new RealValue(v1.intValue() * v2.realValue());
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
   		res = new IntegerValue(v1.intValue() * v2.intValue());
   	else
   		assert false: "missing semantic error check!";
   	
   	return res;
   }
   
   protected Value divValues(Value v1, Value v2) {
   	assert v1 != null;
   	assert v2 != null;
   	
   	Value res = null;
   	
   	if ("real".equals(""+v1.type()) && "real".equals(""+v2.type())) {
   		assert v2.realValue() != 0;
   		res = new RealValue(v1.realValue() * v2.realValue());
		} else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type())) {
			assert v2.intValue() != 0;
   		res = new RealValue(v1.realValue() * v2.intValue());
   	} else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type())) {
   		assert v2.realValue() != 0;
   		res = new RealValue(v1.intValue() * v2.realValue());
		} else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type())) {
			assert v2.intValue() != 0;
   		res = new RealValue((double)v1.intValue() * v2.intValue());
   	} else
   		assert false: "missing semantic error check!";
   	
   	return res;
   }
   
   protected Value remValues(Value v1, Value v2) {
   	assert v1 != null;
   	assert v2 != null;
   	
   	Value res = null;
   	
   	if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type())) {
   		res = new IntegerValue(v1.intValue() % v2.intValue());
   	} else
   		assert false: "missing semantic error check!";
   		
   	return res;
   	
   }
   
   protected Value conversion(Value v, Type t) {
   	String value = null;
   	switch(v.type().name()) {
   		case "string":
   			value = v.stringValue();
   			break;
   		case "integer":
   			value = String.valueOf(v.intValue());
   			break;
   		case "real":
   			value = String.valueOf(v.realValue());
   			break;
   		case "boolean": 
   			value = String.valueOf(v.boolValue());
   			break;
   	}
   	switch(t.name()) {
   		case "real":
   			Double valueReal = Double.parseDouble(value);
   			return new RealValue(valueReal);
   		case "integer":
   			int valueInt = Integer.parseInt(value);
   			return new IntegerValue(valueInt);
   		case "string":
   			return new StringValue(value);
   		default:
   			return v;
   	}
   }

   	protected Value equalValues(Value v1, Value v2, boolean equal){
		assert v1 != null;
		assert v2 != null;

		Value res = null;

		if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() == v2.realValue());

		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() == v2.intValue());
	
		else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() == v2.realValue());
	
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() == v2.intValue());
	
		else if ("boolean".equals(""+v1.type()) && "boolean".equals(""+v2.type()))
			res = new BooleanValue(v1.boolValue() == v2.boolValue());
	
		else
			assert false: "missing semantic error check!";

		if (!equal)
		res.setBoolValue(!res.boolValue());

		return res;
	}
  
  	protected Value greaterValues(Value v1, Value v2){
	  	assert v1 != null;
	  	assert v2 != null;

		Value res = null;

		if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() > v2.realValue());
	
		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() > v2.intValue());
	
		else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() > v2.realValue());
	
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() > v2.intValue());
	
		else
			assert false: "missing semantic error check!";

		return res;
  }

	protected Value lesserValues(Value v1, Value v2){
		assert v1 != null;
		assert v2 != null;

		Value res = null;

		if ("real".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() < v2.realValue());

		else if ("real".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.realValue() < v2.intValue());
	
		else if ("integer".equals(""+v1.type()) && "real".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() < v2.realValue());
		
		else if ("integer".equals(""+v1.type()) && "integer".equals(""+v2.type()))
			res = new BooleanValue(v1.intValue() < v2.intValue());
		
		else
			assert false: "missing semantic error check!";

		return res;
	}
	
	
}
