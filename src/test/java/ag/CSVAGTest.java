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

public class CSVAGTest {
  InputStream is = System.in;

  @BeforeMethod
  public void setUp() throws IOException {
    is = new FileInputStream(Path.of("src/test/antlr/ag/csv.txt").toFile());
  }

  @AfterMethod
  public void tearDown() {
  }

  @Test
  public void testCSVAG() throws IOException {
    CharStream input = CharStreams.fromStream(is);
    CSVAGLexer lexer = new CSVAGLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    CSVAGParser parser = new CSVAGParser(tokens);
    ParseTree tree = parser.file();
  }
}