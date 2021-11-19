grammar Expr;

expr : '-' expr
  | <assoc = right> expr '^' expr
  | expr ('*' | '/') expr
  | expr ('+' | '-') expr
  | '(' expr ')'
  | ID
  ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;