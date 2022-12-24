grammar Control;

@header {
package codegen;
}

prog : stat ;

stat : assign                                   # AssignStat
     | 'if' '(' bool ')' stat 'else' stat       # IfElseStat
     | 'if' '(' bool ')' stat                   # IfStat
     | 'while' '(' bool ')' stat                # WhileStat
     | stat stat                                # SeqState
     ;

bool : '!' bool                    # NotExpr
     | lhs = bool '&&' rhs = bool  # AndExpr
     | lhs = bool '||' rhs = bool  # OrExpr
     | lhs = expr relop = ('>' | '<' | '==' | '!=' | '<=' | '>=') rhs = expr   # RelExpr
     | 'true'                      # TrueExpr
     | 'false'                     # FalseExpr
     ;

/**
 * Section 6.4.1: grammar for assignment and expressions
 */

assign : ID '=' expr ;
expr : '-' expr         # NegExpr
     | expr '+' expr    # ADDExpr
     | '(' expr ')'     # ParenExpr
     | ID               # IdExpr
     | INT              # IntExpr
     ;

ID : [a-z] ;
INT : [0-9] ;
WS : [ \t\r\n]+ -> skip;