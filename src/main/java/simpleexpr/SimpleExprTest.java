package simpleexpr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SimpleExprTest {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        String file;
        if (args.length > 0) {
            file = args[0];
            is = new FileInputStream(file);
        }

        CharStream input = CharStreams.fromStream(is);
        SimpleExprLexer lexer = new SimpleExprLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleExprParser parser = new SimpleExprParser(tokens);
        ParseTree tree = parser.prog();

        for (Token token : tokens.getTokens()) {
            System.out.println(token);
        }
        System.out.println(tree.toStringTree(parser));
    }
}
