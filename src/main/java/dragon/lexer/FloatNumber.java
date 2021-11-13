package dragon.lexer;

public class FloatNumber extends Token {
    private final float val;

    public FloatNumber(TokenType type, String text) {
        super(type, text);
        val = Float.parseFloat(text);
    }

    @Override
    public String toString() {
        return "FloatNumber {" +
                "type = " + type +
                ", val = " + val +
                '}';
    }
}
