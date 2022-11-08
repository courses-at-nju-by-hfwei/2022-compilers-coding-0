grammar IntExpr;

@header {
    package intexpr;
}

prog : expr* EOF ;

expr : expr ('*' | '/') expr
     | expr ('+' | '-') expr
     | '(' expr ')'
     | INT
     ;


INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;