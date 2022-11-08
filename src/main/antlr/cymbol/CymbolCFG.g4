grammar CymbolCFG;

@header {
package cymbolcfg;
}

prog : prog decl
     | decl
     ;

decl : varDecl
     | funcDecl
     ;

varDecl : ' ' ;     // just for placeholder
funcDecl : ' ' ;    // just for placeholder