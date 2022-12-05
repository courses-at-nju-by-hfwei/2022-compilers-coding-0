grammar LRExprRightAssoc;

@header {
package parser.allstar.exprprec;
}

stat : expr ';' EOF ;
expr : <assoc = right> expr '^' expr
     | expr '+' expr
     | INT
     ;

INT : [0-9] ;
WS : [ \t\r\n] -> skip ;