grammar LRExprPrec;

// Bugs in the antlr plugin? It does not parse correctly.
// Test with command line (remember to comment out the following @header line).

@header {
package parser.allstar.exprprec;
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

ID : [a-z] ;
INT : [0-9] ;
WS  : [ \t\n\r]+ -> skip ;