grammar SimpleExpr;

@header {
    package simpleexpr;
}

prog : stat* EOF ;

stat : expr
     |  ID '=' expr
     | 'if' expr
     ;

expr : expr ('*' | '/') expr
     | expr ('+' | '-') expr
     | '(' expr ')'
     | ID
     | INT
     ;

ID : (LETTER | '_') WORD* ;

INT : '0' | ([1-9] [0-9]*) ;
WS : [ \t\r\n]+ -> skip ;

// Note: in antlr4, '.' matches any (single) character, including '\n'.
SL_COMMENT : '//' .*? '\n' -> skip;  // non-greedy
ML_COMMENT : '/*' .*? '*/' -> skip;  // non-greedy

fragment
DIGIT : [0-9] ;
fragment
LETTER : [a-zA-Z] ;
fragment
WORD : [a-zA-Z0-9_] ;