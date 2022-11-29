grammar NameListWithParallelAssign;

@header {
package parser.backtrack;
}

// [a, b = c, [d, [e = f]]]
// [a, b = c] = [d, [e = f]]
stat : list EOF
     | assign EOF
     ;

assign : list '=' list ;

list : '[' elements ']' ;
elements : element (',' element)* ;
element : ID '=' ID
        | ID
        | list
        ;

ID : [a-z] ;
WS : [ \t\n\r]+ -> skip ;