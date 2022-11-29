grammar LRExprUSPrec;

@header {
package parser.allstar.exprprec;
}

stat : expr[0] ';' EOF;

expr[int _p]
    : (   ID
        | '-' expr[4]
      )
      (   {3 >= $_p}? '!'
        | {2 >= $_p}? '+' expr[3]
      )*
     ;

ID : [a-z] ;
INT : [0-9] ;
WS  : [ \t\n\r]+ -> skip ;