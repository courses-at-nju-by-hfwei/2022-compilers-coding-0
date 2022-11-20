// source: http://media.pragprog.com/titles/tpantlr2/code/examples/Cymbol.g4

/**
 * Simple statically-typed programming language with functions and variables
 * taken from "Language Implementation Patterns" book.
 */

grammar Cymbol;

@header {
package cymbol;
}

prog : (varDecl | functionDecl)* EOF
     ;

varDecl :   type ID ('=' expr)? ';'
        ;

type : 'int'
     | 'double'
     | 'void'
     ;

functionDecl : type ID '(' formalParameters? ')' block
             ;

formalParameters : formalParameter (',' formalParameter)*
                 ;

formalParameter : type ID
                ;

block : '{' stat* '}' ;

stat : block
     | varDecl
     | 'if' expr 'then' stat ('else' stat)? // TODO: priority?
     | 'return' expr? ';'
     | expr '=' expr ';'
     | expr ';'
     ;

expr: ID '(' exprList? ')'    # Call // function call
    | expr '[' expr ']'       # Index // array subscripts
    | op = '-' expr                # Negate // right association
    | op = '!' expr                # Not // right association
    | lhs = expr (op = '*'| op = '/') rhs = expr     # MultDiv
    | lhs = expr (op = '+'| op = '-') rhs = expr     # AddSub
    | lhs = expr (op = '==' | op = '!=') rhs = expr  # EQNE
    | '(' expr ')'            # Parens
    | ID                      # Id
    | INT                     # Int
    ;

exprList : expr (',' expr)* ;

////////////////////////////////////////////
// You can use "Alt + Insert" to automatically generate
// the following lexer rules for literals in the grammar above.
// Note: Remember to rename the automatically generated 'INT' to avoid clash.

SEMI : ';' ;
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[' ;
RBRACK : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;

IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
RETURN : 'return' ;

INTTYPE : 'int' ;
DOUBLETYPE : 'double' ;
VOIDTYPE : 'void' ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

EQ : '=' ;
NE : '!=' ;
EE : '==' ;
////////////////////////////////////////////

ID : LETTER (LETTER | DIGIT)* ;
INT : [0-9]+ ;

WS  : [ \t\n\r]+ -> skip ;
SL_COMMENT : '//' .*? '\n' -> skip ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;