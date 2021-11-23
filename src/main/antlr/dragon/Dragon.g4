grammar Dragon;

@header {
    package dragon;
}

program : block EOF ;

block: '{' declarations statements '}';

declarations : declaration* ;
declaration : type ID ;
type : 'int'
     | 'float'
     | 'char'
     | 'bool'
     | type '[' INT ']'
     ;

statements : statement*;

statement: ' '; // TODO: To Be Continued

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;
