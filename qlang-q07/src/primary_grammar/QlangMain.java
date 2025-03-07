import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

public class QlangMain {
  public static void main(String[] args) {
    try {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      // create a lexer that feeds off of input CharStream:
      QlangLexer lexer = new QlangLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      QlangParser parser = new QlangParser(tokens);
      // replace error listener:
      // parser.removeErrorListeners(); // remove ConsoleErrorListener
      // parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
        QlangCompiler visitor0 = new QlangCompiler();
        ST program = visitor0.visit(tree);
        System.out.println(program.render());
      }
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    } catch (RecognitionException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
