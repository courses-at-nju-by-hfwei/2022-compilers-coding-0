grammar OptionalInitLeftRefactoring;

@header {
package parserll.optionalinitleftrecursion;
}

/*
decl : 'int' ID ';'
     | 'int' ID '=' ID ';'
     ;
*/

decl : 'int' ID optional_init ';' ;
optional_init
    : '=' ID  # Init
    |         # NoInit
    ;

/*
decl : 'int' ID ('=' ID)? ';'
*/

ID : [a-z];
WS : [ \t\n\r]+ -> skip ;