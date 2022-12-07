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
	:	 '1'..'9';
	
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
	
MULTI_CHAR_IDF :	LETTER (LETTER|ZERO|NONZERO_DIGIT|'_')*
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
    :  	obj_type identifier ('(' attr_ass_list? ')' | '[' identifier ']')
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
    :	identifier '=' expr
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
    |   ass_stmt
    ;


if_stmt
    :   IF '(' expr ')' stmt_block ('else' stmt_block)?
    ; 

for_stmt
    :	FOR '(' ass_stmt ';' expr ';' ass_stmt ')' stmt_block
    ;

ass_stmt
    :   var '=' expr ';'
    ;

var :   identifier ('[' expr ']')? ('.' identifier)?
    ;

expr:   ('-' | '!') => unary_op_expr
    |   (integer | identifier | '(') => other_expr (operator expr)?	
    ;
    
    
unary_op_expr
	:   '-' expr 
	|   '!' expr
	;
other_expr
	:	integer
	|   var ('touches' var)? 
	|   '(' expr ')'
    ;
    
operator
	:	OP
	;
    
OP  :   '||' | '&&' | '==' | '<' '='? | '+' | '-' | '*' | '/'
    ;