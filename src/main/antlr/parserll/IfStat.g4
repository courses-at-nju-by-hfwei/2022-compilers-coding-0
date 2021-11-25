grammar IfStat;

// grun IfStat stat -gui -diagnostics

//@header {
//    package parserll;
//}

//stat : 'if' expr 'then' stat ('else' stat)?
//     | expr
//     ;

stat : 'if' expr 'then' stat
     | 'if' expr 'then' stat 'else' stat
     | expr
     ;

expr : ID ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;