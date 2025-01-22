import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import java.io.FileInputStream;
import java.io.File;
import java.io.PrintWriter;

public class QlangMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(new FileInputStream(args[0]));
         // create a lexer that feeds off of input CharStream:
         QlangLexer lexer = new QlangLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         QlangParser parser = new QlangParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            QlangCompiler visitor0 = new QlangCompiler();
            ST code = visitor0.visit(tree);
            String filename = "Output.java";
            try {
            	code.add("name", "Output");
            	PrintWriter pw = new PrintWriter(new File(filename));
            	pw.print(code.render());
            	pw.close(); 
            } catch (Exception e) {
            	e.printStackTrace();
            	
            }
         }
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
