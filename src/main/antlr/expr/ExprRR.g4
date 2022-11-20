// a right-recursive version
grammar ExprRR;

@header {
package parserantlr.expr;
}

prog : expr EOF ;

expr : term expr_prime ;

expr_prime : '+' term expr_prime
     |
     ;

term : factor term_prime ;

term_prime : '*' factor term_prime
     |
     ;

factor : DIGIT ;
DIGIT : [0-9] ;

WS  : [ \t\n\r]+ -> skip ;