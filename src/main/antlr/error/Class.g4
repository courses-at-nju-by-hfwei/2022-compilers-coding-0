grammar Class;

prog : classDef+ ;

classDef : 'class' ID '{' member+ '}'
           {System.out.println("class " + $ctx.ID.getText();}
         ;

member
    :   'int' ID ';'
        {System.out.println("Var " + $ctx.ID.getText());}
    |   'int' f=ID '(' ID ')' '{' stat '}'
        {System.out.println("Method: " + $ctx.f.getText());}
    ;

stat:   expr ';'
        {System.out.println("Expr: " + $ctx.getText());}
    |   ID '=' expr ';'
        {System.out.println("Assign: " + $ctx.getText());}
    ;

expr:   INT 
    |   ID '(' INT ')'
    ;

INT :   [0-9]+ ;
ID  :   [a-zA-Z]+ ;
WS  :   [ \t\r\n]+ -> skip ;