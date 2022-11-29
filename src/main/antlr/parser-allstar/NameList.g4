grammar NameList;

@header {
package parser.ll1;
}

// [a, [b, c], d]
list : '[' elements ']' ;
elements : element (',' element)* ;
element : ID | list ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;