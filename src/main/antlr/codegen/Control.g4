grammar Control;

@header {
package control;
}

prog : stat ;

stat : assign                                   # AssignStat
     | 'if' '(' bool ')' stat ('else' stat)?    # IfStat
     | 'while' '(' bool ')' stat                # WhileStat
     | stat stat                                # SeqState
     ;

bool : '!' bool                             # NotExpr
     | lhs = bool ('||' | '&&') rhs = bool  # OrAndExpr
     | expr ('>' | '<' | '==' | '<=' | '>=') expr   # RelExpr
     | 'true'                               # TrueExpr
     | 'false'                              # FalseExpr
     ;

/**
 * Section 6.4.1: grammar for assignment and expressions
 */

assign : ID '=' expr ;
expr : '-' expr         # NegExpr
     | expr '+' expr    # ADDExpr
     | '(' expr ')'     # ParenExpr
     | ID               # IDExpr
     ;

ID : [a-z] ;