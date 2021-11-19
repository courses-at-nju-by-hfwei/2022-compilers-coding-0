grammar IfStat;

stat : 'if' expr 'then' stat    // higher priority
     | 'if' expr 'then' stat 'else' stat
     | expr
     ;

expr : ID ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;
