grammar LRExprUS;

@header {
package parser.allstar.exprprec;
}

stat : expr ';' EOF;

expr : '-' expr
     | expr '!'
     | expr '+' expr
     | ID
     ;

ID : [a-z] ;
INT : [0-9] ;
WS  : [ \t\n\r]+ -> skip ;