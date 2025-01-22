grammar Qlang;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}


main: statements EOF;

statements: (stat? ';')* ;

stat :  
     uses
     | print
     | declaration 
     | assignment  
     | question
     | execution
     | export
     ;

declaration: ID ':' type; 

question returns [String varName]: 
			'hole' variable 'is' print 'end'	#questionHole
			 | 'open' variable 'is' print 'end' #questionOpen
			 | 'code-hole' variable 'is' (stat ';')+ 'end' #questionCodeHole
			 | 'code-open' variable 'is' (stat ';')+ 'end' #questionCodeOpen
			 | 'code' variable 'is' CODEPIL 'end'				#codePIL 			
			 ;


variable returns[String varName] : 
		VAR   #questionIDsubtype
          | ID    #questionIDtype
          ;



assignment: variable ':=' 'new' variable			    #newAssign
            | variable ':=' execution				    #executeAssign
            | variable ':=' expr						#exprAssign
            | variable ':=' TEXT '|' execution	        #stdInputAssign
            ;

expr returns[QType eType, String varName]:
	'read' (TEXT)?				#exprRead
	| 'integer(' expr ')'         #integerConversion
     | 'text(' expr ')'			#textConversion
     | TEXT							#exprTEXT
     | INTEGER						#exprINTEGER
     | ID 								#exprID
     ;

execution: 'execute' ID				#execID
	| 'execute' 'new' VAR			#execNewVAR
	;

print: 'println' (expr)+ ('ans->' TEXT (expr)+)?;

export : 'export' 'result' 'to' TEXT;

uses: 'uses' 'code' 'from' TEXT 'end'			#usesFile
    | 'uses' 'code' variable grading 'end' 	#usesCode
    ;

grading: (grades ';')* grades ;

grades:  INTEGER ',' TEXT 'line' INTEGER        #gradingLine
        | INTEGER ',' TEXT                      #gradingText
        ;


type: 'code'|'fraction'|'question'|'integer'|'text';

TEXT : '"' (.|ESC)*? '"';
CODEPIL: '"[' (.|ESC)*? ']"';
VAR: ID'.'ID;
ID: [a-zA-Z][a-zA-Z0-9_]*;
INTEGER: [0-9]+;
ESC: '\\"'+?;
WS: [ \t\r\n]+ -> skip;
COMMENT : '#' .*? '\n' -> skip;
