grammar OptionalInit;

@header {
    package parserll;
}

optional_init
    : '=' expr  # Init
    |           # NoInit
    ;

expr : ID;  // just a placeholder

decl : 'int' ID optional_init ';' ;

arg : 'int' ID optional_init ;

func_call : ID '(' arg ')' ;

ASSIGN : '=' ;
LPAREN : '(' ;
RPAREN : ')' ;
INT : 'int' ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;