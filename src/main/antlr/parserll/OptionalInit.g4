grammar OptionalInit;

@header {
package parserll.optionalinit;
}

prog : func_call | decl EOF;

func_call : ID '(' arg ')' ;
decl : 'int' ID optional_init ';' ;

arg : 'int' ID optional_init ;
optional_init
    : '=' ID  # Init
    |         # NoInit
    ;

ID : [a-z];
WS : [ \t\n\r]+ -> skip ;