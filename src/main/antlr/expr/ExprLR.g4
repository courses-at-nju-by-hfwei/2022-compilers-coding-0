grammar ExprLR;

expr : expr ('+'|'-') term
     | term
     ;

term : term ('*' | '/') factor
     | factor
     ;

factor : '(' expr ')'
       | ID
       ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

WS  : [ \t\n\r]+ -> skip ;