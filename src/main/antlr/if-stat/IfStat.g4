grammar IfStat;

@header {
package ifstat;
}

prog : stat EOF ;

stat : 'if' expr 'then' stat
     | 'if' expr 'then' stat 'else' stat
     ;

// The following stat rule using '?' also works as expected.
//stat : 'if' expr 'then' stat ('else' stat)? ;
//     ;

expr : ID ;

ID : LETTER (LETTER | DIGIT)* ;
fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;