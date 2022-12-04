package symtable;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

import cymbol.CymbolLexer;
import cymbol.CymbolParser;

public class SymbolTableListenerTest {
  InputStream is = System.in;

  @BeforeMethod
  public void setUp() throws IOException {
    is = new FileInputStream(Path.of("src/test/antlr/symtable/monolithic.txt").toFile());
  }

  @AfterMethod
  public void tearDown() {
  }

  @Test
  public void testGetAllTokens() throws IOException {
    CharStream input = CharStreams.fromStream(is);
    CymbolLexer lexer = new CymbolLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    CymbolParser parser = new CymbolParser(tokens);
    ParseTree tree = parser.prog();

    ParseTreeWalker walker = new ParseTreeWalker();
    SymbolTableListener def = new SymbolTableListener();
    walker.walk(def, tree);
  }
}