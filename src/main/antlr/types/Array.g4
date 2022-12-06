grammar Array;

@header {
package types;
}

prog : stat* EOF ;

stat : varDecl                              # VarDeclStat
     | arrDecl                              # ArrDeclStat
     | lhs = expr '=' rhs = expr ';'                    # AssignStat
     ;

varDecl : type ID ';' ;

// array declaration (without initialization); added 2022-12-06
// OR: type ID ('[' INT ']')* ';'
arrDecl : type ID arrayType ';' ;
arrayType : '[' INT ']' arrayType # NonEmptyArrayType
          |                       # EmptyArrayType
          ;   // added 2022-12-06

type : 'int' | 'double' | 'void' ;

expr: primary = expr '[' index = expr ']'       # ArrayIndex // array subscripts
    | lhs = expr (op = '*'| op = '/') rhs = expr     # MultDiv
    | lhs = expr (op = '+'| op = '-') rhs = expr     # AddSub
    | lhs = expr (op = '==' | op = '!=') rhs = expr  # EQNE
    | ID                      # Id
    | INT                     # Int
    ;
////////////////////////////////////////////
// You can use "Alt + Insert" to automatically generate
// the following lexer rules for literals in the grammar above.
// Remember to check and modify them if necessary.

SEMI : ';' ;
LBRACK : '[' ;
RBRACK : ']' ;

INTTYPE : 'int' ;
DOUBLETYPE : 'double' ;
VOIDTYPE : 'void' ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

ASSIGN : '=' ;
NE : '!=' ;
EE : '==' ;
////////////////////////////////////////////
WS : [ \t\n\r]+ -> skip ;
ID : [a-z] ;
INT : [0-9] ;