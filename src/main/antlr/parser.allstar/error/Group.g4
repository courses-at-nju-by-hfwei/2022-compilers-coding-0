grammar Group;

@header {
package parser.allstar.error;
}

// [i^2]: correct input
// []: wrong input; the following set is {'^', ']'}
group : '[' expr ']'
      | '(' expr ')'
      ;

expr : atom '^' INT ;

atom : ID
     | INT
     ;

INT : [0-9]+ ;
ID : [a-zA-Z]+ ;
WS : [ \t\r\n]+ -> skip ;