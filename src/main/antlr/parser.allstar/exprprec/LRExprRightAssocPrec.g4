grammar LRExprRightAssocPrec;

@header {
package parser.allstar.exprprec;
}

stat : expr[0] ';' EOF;

expr[int _p]
    : ( INT )
      (   {3 >= $_p}? '^' expr[3]
        | {2 >= $_p}? '+' expr[3]
      )*
     ;

INT : [0-9] ;
WS  : [ \t\n\r]+ -> skip ;