// a left-recursive version
grammar ExprLR;

@header {
package expr;
}

expr : expr ('+'|'-') term
     | term
     ;

term : term ('*' | '/') factor
     | factor
     ;

factor : '(' expr ')'
       | ID
       ;

ID : LETTER (LETTER | DIGIT)* ;
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;