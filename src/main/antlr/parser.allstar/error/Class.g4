grammar Class;

@header {
package parser.allstar.error;
}

prog : classDef+ ;

classDef : 'class' ID '{' member+ '}' ;

member
    :   'int' ID ';'
    |   'int' f=ID '(' ID ')' '{' stat '}'
    ;

stat:   expr ';'
    |   ID '=' expr ';'
    ;

expr:   INT
    |   ID '(' INT ')'
    ;

CLASS : 'class' ;
LBRACE : '{' ;
RBRACE : '}' ;
INTTYPE : 'int' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
ASSIGN : '=' ;

INT :  [0-9]+ ;
ID  :  [a-zA-Z]+ ;
WS  :  [ \t\r\n]+ -> skip ;