// a right-recursive version
grammar ExprRR;

@header {
package parserantlr.expr;
}

expr : term expr_prime ;

expr_prime : ('+'|'-') term expr_prime
     |
     ;

term : factor term_prime ;

term_prime : ('*' | '/') factor term_prime
     |
     ;

factor : '(' expr ')'
       | ID
       ;

ID : LETTER (LETTER | DIGIT)* ;
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;