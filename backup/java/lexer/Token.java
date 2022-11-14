package dragon.lexer;

public class Token {
    protected final TokenType type;
    private final String text;

    public Token(TokenType type, String text) {
        this.type = type;
        this.text = text;
    }

    public TokenType getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Token {" +
                "type = " + this.type +
                ", text = " + this.text + '}';
    }
}