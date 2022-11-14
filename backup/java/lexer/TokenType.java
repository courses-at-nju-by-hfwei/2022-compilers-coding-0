package dragon.lexer;

public enum TokenType {
    UNKNOWN,
    EOF,
    ID,
    COMMA,
    LB,
    RB,
    IF,
    ELSE,
    WHILE,
    DO,
    BREAK,
    AND,
    OR,
    BOOL, TRUE, FALSE,
    EQ, NE, LT, LE, GE, GT,
    MINUS,
    INT, FLOAT, CHAR,
    BIT_AND, BIT_OR, ASSIGN, NOT, DIV, MUL, SUB, ADD, LP, RP, BIT_NOT, SC;
}
