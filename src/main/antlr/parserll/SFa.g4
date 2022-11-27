grammar SFa;

@header {
package parserll.sfa;
}

s : f               # FCase
  | '(' s '+' f ')' # SFCase
  ;

f : 'a' ;

LPAREN : '(' ;
ADD : '+' ;
RPAREN : ')' ;

WS : [ \t\n\r]+ -> skip ;