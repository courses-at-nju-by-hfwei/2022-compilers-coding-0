grammar IfStatFactor;

@header {
package ifstatefactor;
}

stat : 'if' expr 'then' stat stat_prime ;

stat_prime : ('else' stat)? ;

expr : ID ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;