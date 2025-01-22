grammar Pil;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}


main: statement* stat ';'? EOF;

statement: stat ';';

stat : assign
      |print
      |expr
      |condition
      |loop 
      ;

assign : ID ':=' expr;

print : printType=('writeln' | 'write') expr;

condition: 'if' expr 'then' trueStat=stat+ ('else' falseStat=stat+)? 'end' ';'?			#conditionIfElse
				;


loop: 'loop' cond = ('until'|'while') expr 'do' stat+ 'end';
        
		  
expr returns[Type eType, String varName]:    
         expr ',' expr                                                        			#exprMultiple    
        | Text                                                                			#exprText
        | 'read' (Text)?																		         #exprRead
        | expr op = ('*'|':'|'%') expr	                                      				#exprMultDivMod
	  | expr op = ('+'|'-') expr	                                          			#exprAddSub
        | expr op = ('='|'/='|'>'|'<'|'>='|'<=') expr                         			#exprRelational
        | 'not' expr 																			         #exprNot
        | expr op = ('and'|'and then'|'or else'|'xor'|'implies') expr  			  			#exprBoolean
        | expr 'or' expr																		   		#exprOR 
        | 'integer(' expr ')'                                                 			#integerConversion
        | 'text(' expr ')'																	            #textConversion
        | 'real(' expr ')'																	            #realConversion
        | '(' expr ')'																		            #exprParent
        | BOOLEAN																				            #exprBool
        | ID                                                                  			#exprID
        | INTEGER										#exprInt
        | REAL                                                                			#exprReal
        ;


Text : '"' (.|ESC)*? '"';
BOOLEAN: ('true' | 'false');
ID : [a-zA-Z][a-zA-Z0-9_]*;
ESC : '\\"'+?;
INTEGER: [0-9]+;
REAL: [0-9]+'.'[0-9]+;


WS : [ \t\n]+ -> skip;
COMMENT : '--' .*? '\n' -> skip;

