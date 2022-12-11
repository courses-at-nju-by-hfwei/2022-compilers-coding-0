package ag;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExprAGMain {
  public static void main(String[] args) throws IOException {
    InputStream is = System.in;
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    String expr = br.readLine();
    int line = 1;

    ExprAGParser parser = new ExprAGParser(null);
    parser.setBuildParseTree(false);

    while (expr != null) {
//      CharStream input = CharStreams.fromStream(expr + "\n");
      ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
      ExprAGLexer lexer = new ExprAGLexer(input);
      lexer.setLine(line);
      lexer.setCharPositionInLine(0);

      CommonTokenStream tokens = new CommonTokenStream(lexer);
      parser.setInputStream(tokens);
      parser.stat();

      expr = br.readLine();
      line++;
    }
  }
}
