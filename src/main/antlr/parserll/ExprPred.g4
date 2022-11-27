grammar ExprPred;

@header {
package parserll.exprpred;
}

// T(6) maybe a function call (if T is a function name)
// or a constructor type conversion (if T is a class type).
// We need runtime information to resolve such an ambiguity.
// It is thus "context-sensitive".
expr : INT
     | ID '(' expr ')'  // function call
     | ID '(' expr ')'  // constructor type conversion
     ;

ID : LETTER (LETTER | [0-9])* ;
fragment LETTER : [a-zA-Z] ;

INT : [0-9]+ ;

WS  : [ \t\n\r]+ -> skip ;