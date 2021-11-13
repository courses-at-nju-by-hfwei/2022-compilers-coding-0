package dragon.lexer;

/**
 * Keywords, types, IDs, and Operators
 */
public class Word extends Token {
    public static final Word BOOL = new Word(TokenType.BOOL, "bool");
    public static final Word INT = new Word(TokenType.INT, "int");
    public static final Word FLOAT = new Word(TokenType.FLOAT, "float");
    public static final Word CHAR = new Word(TokenType.CHAR, "char");

    public static final Word TRUE = new Word(TokenType.TRUE, "true");
    public static final Word FALSE = new Word(TokenType.FALSE, "false");

    public static final Word AND = new Word(TokenType.AND, "&&");
    public static final Word OR = new Word(TokenType.OR, "||");
    public static final Word NOT = new Word(TokenType.NOT, "!");

    public static final Word BIT_AND = new Word(TokenType.BIT_AND, "&");
    public static final Word BIT_OR = new Word(TokenType.BIT_OR, "|");
    public static final Word BIT_NOT = new Word(TokenType.BIT_NOT, "~");

    public static final Word ASSIGN = new Word(TokenType.ASSIGN, "=");
    public static final Word EQ = new Word(TokenType.EQ, "==");
    public static final Word NE = new Word(TokenType.NE, "!=");
    public static final Word LE = new Word(TokenType.LE, "<=");
    public static final Word GE = new Word(TokenType.GE, ">=");

    public static final Word MINUS = new Word(TokenType.MINUS, "minus");

    public static final Word ADD = new Word(TokenType.ADD, "+");
    public static final Word SUB = new Word(TokenType.SUB, "-");
    public static final Word MUL = new Word(TokenType.MUL, "*");
    public static final Word DIV = new Word(TokenType.DIV, "/");

    public static final Word IF = new Word(TokenType.IF, "if");
    public static final Word ELSE = new Word(TokenType.ELSE, "else");
    public static final Word WHILE = new Word(TokenType.WHILE, "while");
    public static final Word DO = new Word(TokenType.DO, "do");
    public static final Word BREAK = new Word(TokenType.BREAK, "break");

    public static final Word LT = new Word(TokenType.LT, "<");
    public static final Word GT = new Word(TokenType.GT, ">");

    public Word(TokenType type, String text) {
        super(type, text);
    }
}
