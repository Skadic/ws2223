grammar MGPL;

options {
    language=Java;
    backtrack=false;
}

LETTER
    :   'a'..'z'
    |   'A'..'Z'
    ;
NONZERO_DIGIT
	:   '1'..'9';
	
ZERO:	'0';
    
NEWLINE
	:	'\r'? '\n' {skip();}
	;
	
COMMENT
    :   ('//' ~('\n'|'\r')* NEWLINE) {skip();}
    ;
 
OTHER_WHITESPACE
	:	(' ' | '\t') {skip();}
	;
	
IF	:	'if';
FOR :	'for';
	
ADD :   '+';

MUL :   '*';
SUB :   '-';
INV :   '!';
DIV :   '/';
AND :   '&&';
EQ  :	'==';
LEQ :	'<' '='?;
OR  :   '||';
TOUCH
	:	'touches';

LPAREN 
	:   '(';
RPAREN
	:	')';

TRUE:   'true';
FALSE:   'false';

MULTI_CHAR_IDF 
    :    LETTER (LETTER|ZERO|NONZERO_DIGIT|'_')*
	;
	
MULTI_DIGIT_INTEGER
	:	ZERO 
	|   (NONZERO_DIGIT (ZERO | NONZERO_DIGIT)+)
    ;
	

integer
	:	ZERO
	| 	NONZERO_DIGIT
	|   MULTI_DIGIT_INTEGER
	;
    
identifier
	:	LETTER
	|   MULTI_CHAR_IDF
	;

prog:   prog_header prog_body
    ;
    
prog_header
    : 'game ' identifier '(' attr_ass_list? ')'
    ;
    
prog_body
    :   decl+ stmt_block block*
    |   stmt_block block*
    ;

block
    :   anim_block | event_block
    ;

decl:   var_decl ';'
    |   obj_decl ';'
    ;

var_decl
    :	'int' identifier (init? | '[' integer ']')
    ;
    
init:   '=' expr
    ;

obj_decl
    :  	obj_type identifier ('(' attr_ass_list? ')' | '[' add_expr ']')
    ;

obj_type
    :   'rectangle' 
    |   'triangle' 
    |   'circle'
    ;

attr_ass_list
    :	attr_ass (',' attr_ass_list)?
    ; 

attr_ass
    :	identifier '=' add_expr
    ;

anim_block
    :   'animation' identifier '(' obj_type identifier ')' stmt_block
    ;

event_block
    :   'on' key_stroke stmt_block
    ;


stmt_block
    :   '{' stmt* '}'
    ;
    
key_stroke
    :	'space' 
    |   'leftarrow' 
    |   'rightarrow' 
    |   'uparrow' 
    |   'downarrow'
    ; 


stmt:   if_stmt 
    |   for_stmt 
    |   ass_stmt ';'
    ;


if_stmt
    :   IF LPAREN or_expr RPAREN stmt_block ('else' stmt_block)?
    ; 

for_stmt
    :	FOR LPAREN ass_stmt ';' or_expr ';' ass_stmt RPAREN stmt_block
    ;

ass_stmt
    :   var '=' add_expr
    ;

var : (identifier '.') => identifier '.' identifier
	| (identifier '[') => identifier '[' add_expr ']' ('.' identifier)?
    | identifier
    ;

expr:   or_expr;

or_expr
	:	and_expr (OR and_expr)*
	;
	
and_expr
    :   rel_expr (AND rel_expr)*
    ;
    
rel_expr
    	:   (var TOUCH) => var TOUCH var
    	|   (TRUE | FALSE | LPAREN | INV) => invert_expr (EQ invert_expr)?
 	|   add_expr ((EQ | LEQ) add_expr)?
 	;
    
invert_expr
    :   INV bool_lit_expr
    |   bool_lit_expr
    ;
    
bool_lit_expr
	:   TRUE
	|   FALSE
	|   var
	|   LPAREN or_expr RPAREN;

add_expr
	:   mul_expr ((ADD | SUB) mul_expr)*
	;
	

mul_expr
	:   negate_expr ((MUL | DIV) negate_expr)*
	;

negate_expr
	:	SUB int_lit_expr
	|   int_lit_expr;

int_lit_expr
	:	var
	|   integer
	|   LPAREN add_expr RPAREN
	;
    
    
