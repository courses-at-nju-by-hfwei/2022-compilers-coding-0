package dragon.lexer;

public class IntNumber extends Token {
    private final int val;

    public IntNumber(TokenType type, String text) {
        super(type, text);
        val = Integer.parseInt(text);
    }

    @Override
    public String toString() {
        return "IntNumber{" +
                "type = " + type +
                ", val = " + val +
                '}';
    }
}
