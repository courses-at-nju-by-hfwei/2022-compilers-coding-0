grammar IfStatFactor;

@header {
package ifstatefactor;
}

stat : 'if' expr 'then' stat stat_prime ;

stat_prime : ('else' stat)? ;

expr : ID ;

ID : LETTER (LETTER | DIGIT)* ;
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;