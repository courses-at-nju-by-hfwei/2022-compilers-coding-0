grammar SFa;

@header {
    package parserll;
}

s : f
  | '(' s '+' f ')'
  ;

f : 'a' ;

LPAREN : '(' ;
ADD : '+' ;
RPAREN : ')' ;

WS  : [ \t\n\r]+ -> skip ;