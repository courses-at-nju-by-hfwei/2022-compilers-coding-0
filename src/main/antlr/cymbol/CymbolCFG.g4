grammar CymbolCFG;

@header {
package cymbol.cfg;
}

prog : prog decl
     | decl
     ;

decl : varDecl
     | funcDecl
     ;

varDecl : type ID
        | type ID '=' expr
        ;

funcDecl : ' ' ;

type : 'int' | 'double' | 'void' ;

expr : ID ;

ID : [a-z]+ ;