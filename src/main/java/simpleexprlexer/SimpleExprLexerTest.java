package simpleexprlexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import simpleexpr.SimpleExprLexer;
import simpleexpr.SimpleExprParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SimpleExprLexerTest {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        String file;
        if (args.length > 0) {
            file = args[0];
            is = new FileInputStream(file);
        }

        CharStream input = CharStreams.fromStream(is);
        SimpleExprLexer lexer = new SimpleExprLexer(input);

        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
    }
}
