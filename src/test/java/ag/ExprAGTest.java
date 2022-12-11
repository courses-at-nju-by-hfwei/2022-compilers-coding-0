package ag;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class ExprAGTest {
  InputStream is = System.in;

  @BeforeMethod
  public void setUp() throws IOException {
    is = new FileInputStream(Path.of("src/test/antlr/ag/expr.txt").toFile());
  }

  @AfterMethod
  public void tearDown() {
  }

  @Test
  public void testExprAG() throws IOException {
    CharStream input = CharStreams.fromStream(is);
    ExprAGLexer lexer = new ExprAGLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    ExprAGParser parser = new ExprAGParser(tokens);
    ParseTree tree = parser.stat();
  }
}