grammar CymbolCFG;

prog : prog decl
     | decl
     ;

decl : varDecl
     | funcDecl
     ;