grammar IfStat;

// grun IfStat stat -gui -diagnostics

@header {
    package parserll;
}

prog : stat EOF;

stat : 'if' expr 'then' stat    // with higher priority
     | 'if' expr 'then' stat 'else' stat
     | expr
     ;

// The following stat rule using '?' also works as expected.
//stat : 'if' expr 'then' stat ('else' stat)?
//     | expr
//     ;

expr : ID ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;