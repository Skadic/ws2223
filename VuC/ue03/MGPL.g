grammar MGPL;

options {
    language=Java;
    backtrack=false;
    output=AST;
}

fragment LETTER
    :   'a'..'z'
    |   'A'..'Z'
    ;
fragment NONZERO_DIGIT
	:   '1'..'9';
	
fragment ZERO:	'0';
fragment DIGIT
	:   ZERO | NONZERO_DIGIT;    

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
ANIM:	'animation';
ON:	'on';

KEY_STROKE
    :	'space' 
    |   'leftarrow' 
    |   'rightarrow' 
    |   'uparrow' 
    |   'downarrow'
    ; 
GAME:	'game';

// AST labels
fragment HEADER
	:	'header';
fragment BODY
	:	'body';
fragment ATTR
	:	'attribute';
fragment DECL
	:	'declaration';
fragment OBJ_DECL
	:	'object_declaration';
fragment ARR_DECL
	:	'array_declaration';
fragment ASS
	:	'assignment';
fragment ATTR_ACC
	:	'attribute_access';
fragment INDEX
	:	'indexing';
fragment STMT_BLOCK
	:	'statement_block';
fragment ANIM_TARGET
	:	'animation_target';
fragment IDENT
	:	'identifier';
fragment TYPE
	:	'type';
fragment VALUE
	: 	'value';
fragment COND
	:	'condition';
fragment INIT
	:	'for_loop_initialization';
fragment UPDATE
	:	'for_loop_update';
fragment IF_BLOCK
	:	'if_block';
fragment ELSE_BLOCK
	:	'else_block';
fragment EVENT_KEY
	:	'event_key';
fragment INT_LIT
	:	'integer_literal';

OBJ_TYPE
    :   'rectangle' 
    |   'triangle' 
    |   'circle'
    ;

IDENTIFIER
	:	LETTER (LETTER|DIGIT|'_')*
	;
	
INTEGER
	:	ZERO
	|   NONZERO_DIGIT DIGIT*
	;

prog:   prog_header prog_body -> ^(GAME prog_header prog_body)
    ;
    
prog_header
    : GAME identifier LPAREN attr_ass_list? RPAREN -> ^(HEADER attr_ass_list)
    ;
    
prog_body
    :   (decl+) stmt_block block* -> ^(BODY (decl)+ stmt_block block*)
    |   stmt_block (block)* -> ^(BODY stmt_block block*)
    ;
    
    
identifier
	:	IDENTIFIER -> ^(IDENT IDENTIFIER);

obj_type
	:	OBJ_TYPE -> ^(TYPE OBJ_TYPE);

integer
	:	INTEGER -> ^(INT_LIT INTEGER);

block
    :   anim_block | event_block
    ;

decl:   var_decl ';'!
    |   obj_decl ';'!
    ;

var_decl
    :	'int' identifier '[' integer ']' -> ^(ARR_DECL ^(TYPE 'int') identifier integer)
    |   'int' identifier init? -> ^(DECL ^(TYPE 'int') identifier init?)
    ;
    
init:   '='! bool_expr^
    ;

obj_decl
    :  	obj_type identifier LPAREN attr_ass_list? RPAREN -> ^(OBJ_DECL obj_type identifier attr_ass_list)
    |   obj_type identifier '[' add_expr ']' -> ^(ARR_DECL obj_type identifier add_expr)
    ;

    

attr_ass_list
    :	attr_ass (','! attr_ass)* 
    ; 

attr_ass
    :	identifier '=' add_expr -> ^(ATTR identifier add_expr)
    ;

anim_block
    :   ANIM identifier LPAREN obj_type identifier RPAREN stmt_block -> ^(ANIM identifier ^(ANIM_TARGET obj_type identifier) stmt_block)
    ;

event_block
    :   ON KEY_STROKE stmt_block -> ^(ON ^(EVENT_KEY KEY_STROKE) stmt_block)
    ;


stmt_block
    :   '{' stmt* '}' -> ^(STMT_BLOCK stmt*)
    ;

stmt:   if_stmt 
    |   for_stmt 
    |   ass_stmt ';'!
    ;


if_stmt
    :   IF LPAREN or_expr RPAREN stmt_block ('else' stmt_block)? -> ^(IF ^(COND or_expr) ^(IF_BLOCK stmt_block) ^(ELSE_BLOCK stmt_block))
    ; 

for_stmt
    :	FOR LPAREN ass_stmt ';' or_expr ';' ass_stmt RPAREN stmt_block -> ^(FOR ^(INIT ass_stmt) ^(COND or_expr) ^(UPDATE ass_stmt) stmt_block)
    ;

ass_stmt
    :   var '=' add_expr -> ^(ASS var add_expr)
    ;

var : (identifier '.') => identifier '.' identifier -> ^(ATTR_ACC identifier identifier)
	| (identifier '[') => identifier '[' add_expr ']' ('.' identifier)? -> ^(ATTR_ACC ^(INDEX identifier add_expr) identifier)
    | identifier
    ;

bool_expr:   or_expr;

or_expr
	:	and_expr (OR^ and_expr)*
	;
	
and_expr
    :   rel_expr (AND^ rel_expr)*
    ;
    
rel_expr
    	:   (var TOUCH) => var TOUCH^ var
    	|   (TRUE | FALSE | LPAREN | INV) => invert_expr (EQ^ invert_expr)?
 	|   add_expr ((EQ^ | LEQ^) add_expr)?
 	;
    
invert_expr
    :   INV^ bool_lit_expr
    |   bool_lit_expr
    ;
    
bool_lit_expr
	:   TRUE
	|   FALSE
	|   var
	|   LPAREN! or_expr RPAREN!;

add_expr
	:   mul_expr ((ADD^ | SUB^) mul_expr)*
	;
	

mul_expr
	:   negate_expr ((MUL^ | DIV^) negate_expr)*
	;

negate_expr
	:	SUB^ int_lit_expr
	|   int_lit_expr;

int_lit_expr
	:	var
	|   integer
	|   LPAREN! add_expr RPAREN!
	;
    
    
