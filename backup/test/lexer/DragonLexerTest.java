package dragon.lexer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DragonLexerTest {
    private String input;
    private DragonLexer lexer;

    @BeforeMethod
    public void setUp() throws IOException {
        input = Files.readString(Path.of("src/test/antlr/dragon/dragon0.txt"));
        lexer = new DragonLexer(input);
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testNextToken() {
        Token token = lexer.nextToken();
        while (token.type != TokenType.EOF) {
            System.out.println(token);
            token = lexer.nextToken();
        }
        System.out.println(token);
    }
}