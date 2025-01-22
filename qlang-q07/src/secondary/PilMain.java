import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class PilMain {
   public static void main(String[] args) {
   	// Neste momento o main está a ler um ficheiro file, linha a linha
   	String file = args[0];
   	// isto foi simplesmente para conseguir testar o read com o Scanner, já que da maneira normal, o código pil é passado pelo System.in
   	// Não sei que mudanças terão de fazer para conseguir por a funcionar, mas secalhar guardar este ficheiro num ficheiro dummy e experimentar. Qualquer coisa perguntem
   	// O mismatch input acontece porque como ele cria um arvore para cada linha, um linha comentada não tem tokens 
      try {
      	Scanner sc = new Scanner(new FileInputStream(file)); 
      	String lineText = null;
      	int lineNum = 1;
      	if (sc.hasNextLine())
      		lineText = sc.nextLine();
      	PilParser parser = new PilParser(null);
      	PilInterpreter visitor0 = new PilInterpreter();
			while(lineText != null) {
				CharStream input = CharStreams.fromString(lineText + "\n");
				PilLexer lexer = new PilLexer(input);
				lexer.setLine(lineNum);
				lexer.setCharPositionInLine(0);
					
         	CommonTokenStream tokens = new CommonTokenStream(lexer);
         	parser.setInputStream(tokens);
         	ParseTree tree = parser.main();
         	if (parser.getNumberOfSyntaxErrors() == 0) {
		         // print LISP-style tree:
		         // System.out.println(tree.toStringTree(parser));
		         visitor0.visit(tree);
		      }
		      if (sc.hasNextLine())
		      	lineText = sc.nextLine();
		      else 
		      	lineText = null;
		      lineNum++;				
			}

         // create a CharStream that reads from standard input:
         //CharStream input = CharStreams.fromStream(new FileInputStream("examples/p1.pil"));
         // create a lexer that feeds off of input CharStream:
         //PilLexer lexer = new PilLexer(input);
         // create a buffer of tokens pulled from the lexer:
         //CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         //PilParser parser = new PilParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at main rule:
         //ParseTree tree = parser.main();
         
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
