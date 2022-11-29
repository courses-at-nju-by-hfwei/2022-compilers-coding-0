grammar NameList;

@header {
package parser.allstar.namelist;
}

// [a, [b, c], d]
list : '[' elements ']' ;
elements : element (',' element)* ;
element : ID | list ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;