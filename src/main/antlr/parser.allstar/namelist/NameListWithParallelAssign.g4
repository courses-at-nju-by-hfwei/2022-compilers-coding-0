grammar NameListWithParallelAssign;

@header {
package parser.backtrack;
}

// [a, b = c, [d, [e = f]]]
stat : (list | assign) EOF ;
// [a, b = c] = [d, [e = f]]
assign : list '=' list ;

list : '[' elements ']' ;
elements : element (',' element)* ;
element : ID '=' ID
        | ID
        | list
        ;

LBRACK : '[' ;
RBRACK : ']' ;
COMMA : ',' ;
ASSIGN : '=' ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;