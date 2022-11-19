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

type : 'int' | 'double' | 'void' ;

expr : ID ;

funcDecl : ' ' ;