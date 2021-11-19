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