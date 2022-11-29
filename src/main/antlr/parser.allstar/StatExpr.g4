grammar StatExpr;

@header {
package parser.statexpr;
}

stat : ID ':' stat
     | expr ';'
     ;

expr : ID '=' expr
     | INT
     ;

ID : [a-z] ;
INT : [0-9] ;
WS : [ \t\r\n]+ -> skip ;