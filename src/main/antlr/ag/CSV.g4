// Comma-Separated Values
grammar CSV;

@header {
package ag;
}

file : hdr row+ ;
hdr : row ;
row : field (',' field)* '\r'? '\n' ;

field : ID | NUMBER ;

ID : [a-z]+ ;
NUMBER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip;