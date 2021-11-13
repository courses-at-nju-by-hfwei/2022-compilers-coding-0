package dragon.lexer;

public class DragonLexer extends Lexer {
    private KeywordTable kwTable = new KeywordTable();

    public DragonLexer(String input) {
        super(input);
    }

    @Override
    public Token nextToken() {
        if (peek == EOF) {
            return new Token(TokenType.EOF, "EOF");
        }

        if (Character.isWhitespace(peek)) {
           WS();
        }

        if (Character.isLetter(peek)) {
            return ID();
        }

        if (Character.isDigit(peek)) {
            return Number();
        }

        switch (peek) {
            case ';':
                consume();
                return new Token(TokenType.SC, ";");
            case '(':
                consume();
                return new Token(TokenType.LP, "(");
            case ')':
                consume();
                return new Token(TokenType.RP, ")");

            case '[':
                consume();
                return new Token(TokenType.LB, "[");
            case ']':
                consume();
                return new Token(TokenType.RB, "]");

            case '+':
                consume();
                return Word.ADD;
            case '-':
                consume();
                return Word.SUB;
            case '*':
                consume();
                return Word.MUL;
            case '/':
                consume();
                return Word.DIV;

            case '~':
                consume();
                return Word.BIT_NOT;
            case '&':
                if (nextMatch('&')) {
                    consume();
                    return Word.AND;
                }
                return Word.BIT_AND;
            case '|':
                if (nextMatch('|')) {
                    consume();
                    return Word.OR;
                }
                return Word.BIT_OR;
            case '=':
                if (nextMatch('=')) {
                    consume();
                    return Word.EQ;
                }
                return Word.ASSIGN;
            case '!':
                if (nextMatch('=')) {
                    consume();
                    return Word.NE;
                }
                return Word.NOT;
            case '<':
                if (nextMatch('=')) {
                    consume();
                    return Word.LE;
                }
                return Word.LT;
            case '>':
                if (nextMatch('=')) {
                    consume();
                    return Word.GE;
                }
                return Word.GT;
            default:
                return new Token(TokenType.UNKNOWN, "peek");
        }
    }

    private Token Number() {
        StringBuilder sb = new StringBuilder(10);
        do {
            sb.append(peek);
            consume();
        } while (Character.isDigit(this.peek));

        if (peek != '.') {
            return new IntNumber(TokenType.INT, sb.toString());
        }

        do {
            sb.append(peek);
            consume();
        } while (Character.isDigit(peek));

        return new FloatNumber(TokenType.FLOAT, sb.toString());
    }

    private Token ID() {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(peek);
            consume();
        } while (Character.isLetterOrDigit(peek));

        Word word = this.kwTable.getKeyword(sb.toString());
        if (word == null) {
            return new Token(TokenType.ID, sb.toString());
        }
        return word;
    }

    private void WS() {
        while (Character.isWhitespace(this.peek)) {
            consume();
        }
    }

    @Override
    public String getTokenName(int tokenType) {
        return TokenType.values()[tokenType].name();
    }
}