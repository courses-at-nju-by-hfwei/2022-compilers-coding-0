grammar LRExprPrec;

// Bugs in the antlr plugin;
// test with command line (comment out the @header line).

@header {
    package parserllantlr;
}

stat : expr[0] ';' EOF;

expr[int _p]
    : (  INT
       | ID
      )
      (  {4 >= $_p}? '*' expr[5]
       | {3 >= $_p}? '+' expr[4]
      )*
    ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

INT : '0' | ([1-9] [0-9]*) ;

WS  : [ \t\n\r]+ -> skip ;