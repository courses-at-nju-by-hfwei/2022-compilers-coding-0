grammar Expr;

@header {
package expr;
}

expr : '-' expr
  | <assoc = right> expr '^' expr
  | expr ('*' | '/') expr
  | expr ('+' | '-') expr
  | '(' expr ')'
  | ID
  ;

ID : LETTER (LETTER | DIGIT)* ;
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;