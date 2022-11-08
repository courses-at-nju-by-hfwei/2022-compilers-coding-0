grammar Hello;

@header {
    package hello;
}

r : 'hello' ID EOF;

ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;