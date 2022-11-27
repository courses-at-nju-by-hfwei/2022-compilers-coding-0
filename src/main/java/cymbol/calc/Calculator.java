package cymbol.calc;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

import cymbol.CymbolLexer;
import cymbol.CymbolParser;
import cymbol.calc.listener.CalcListenerWithProps;

public class Calculator {
  public static void main(String[] args) throws IOException {
    InputStream is = new FileInputStream(Path.of("src/main/antlr/cymbol/cymbol-calc-stat.txt").toFile());
    CharStream cs = CharStreams.fromStream(is);
    CymbolLexer lexer = new CymbolLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    CymbolParser parser = new CymbolParser(tokens);
    ParseTree tree = parser.prog();

    // for CalcListenerWithProps
    ParseTreeWalker walker = new ParseTreeWalker();
    CalcListenerWithProps calcListener = new CalcListenerWithProps();
    walker.walk(calcListener, tree);

    // for CalcVistor
//    CalcVisitor caclVisitor = new CalcVisitor();
//    // FIXME: NullPointerException
//    // Should override all visitxxx methods.
//    int result = caclVisitor.visit(tree);
//    System.out.println("Result = " + result);
  }
}
