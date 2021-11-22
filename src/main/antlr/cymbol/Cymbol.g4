// source: http://media.pragprog.com/titles/tpantlr2/code/examples/Cymbol.g4

/**
 * Simple statically-typed programming language with functions and variables
 * taken from "Language Implementation Patterns" book.
 */

grammar Cymbol;

@header {
    package cymbol;
}

prog : (varDecl | functionDecl)+ EOF
     ;

varDecl :   type ID ('=' expr)? ';'
        ;

type : 'int'
     | 'float'
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
     | 'if' expr stat ('else' stat)?
     | 'while' expr stat
     | 'for' '(' expr? ';' expr? ';' expr? ')' stat
     | 'return' expr? ';'
     | expr '=' expr ';'
     | expr ';'
     ;

expr: '(' expr ')'
    | ID '(' exprList? ')'    // function call
    | expr '[' expr ']'       // array subscripts
    | '-' expr                // right association
    | '!' expr                // right association
    | <assoc=right> expr '^' expr
    | expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | expr ('<' | '<=' | '>' | '>=') expr
    | expr ('==' | '!=') expr
    | expr ('&&' | '||') expr
    | ID
    | INT
    ;

exprList : expr (',' expr)* ;

////////////////////////////////////////////
// You can use "Alt + Insert" to automatically generate
// the following lexer rules for literals in the grammar above.
// Note: Remember to rename the automatically generated 'INT' to avoid clash.

EQUAL : '=' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
COMMA : ',' ;
LBRACE : '{' ;
RBRACE : '}' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
RETURN : 'return' ;
INTTYPE : 'int' ;
FLOATTYPE : 'float' ;
VOIDTYPE : 'void' ;
LBRACK : '[' ;
RBRACK : ']' ;
SUB : '-' ;
LNOT : '!' ;
POWER : '^' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
LT : '<' ;
LE : '<=' ;
GT : '>' ;
GE : '>=' ;
EQUAL_EQUAL : '==' ;
NOT_EQUAL : '!=' ;
LAND : '&&' ;
LOR : '||' ;
////////////////////////////////////////////

ID : LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT : [0-9]+ ;

WS  : [ \t\n\r]+ -> skip ;

SL_COMMENT : '//' .*? '\n' -> channel(HIDDEN)
           ;