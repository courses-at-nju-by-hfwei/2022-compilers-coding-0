grammar NameListWithAssign;

@header {
package parser.ll2;
}

// [a, b = c, [d, [e = f]]]
list : '[' elements ']' ;
elements : element (',' element)* ;
element  : ID '=' ID
         | ID
         | list
         ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;
ASSIGN : '=' ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;