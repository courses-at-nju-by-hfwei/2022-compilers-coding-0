grammar IfStatFactor;

@header {
    package parserll;
}

stat : 'if' expr 'then' stat stat_prime
     | expr
     ;

stat_prime : ('else' stat) ?
           ;

expr : ID ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;
