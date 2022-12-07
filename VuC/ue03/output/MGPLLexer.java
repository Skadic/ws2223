// $ANTLR 3.5.1 D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g 2022-12-07 01:57:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MGPLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int COMMENT=4;
	public static final int FOR=5;
	public static final int IF=6;
	public static final int LETTER=7;
	public static final int MULTI_CHAR_IDF=8;
	public static final int MULTI_DIGIT_INTEGER=9;
	public static final int NEWLINE=10;
	public static final int NONZERO_DIGIT=11;
	public static final int OP=12;
	public static final int OTHER_WHITESPACE=13;
	public static final int ZERO=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MGPLLexer() {} 
	public MGPLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MGPLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:7:7: ( '!' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:7:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:8:7: ( '(' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:9:7: ( ')' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:10:7: ( ',' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:10:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:11:7: ( '-' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:12:7: ( '.' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:12:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:13:7: ( ';' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:13:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:14:7: ( '=' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:14:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:15:7: ( '[' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:15:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:16:7: ( ']' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:16:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:17:7: ( 'animation' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:17:9: 'animation'
			{
			match("animation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:7: ( 'circle' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:9: 'circle'
			{
			match("circle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:19:7: ( 'downarrow' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:19:9: 'downarrow'
			{
			match("downarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:20:7: ( 'else' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:20:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:21:7: ( 'game ' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:21:9: 'game '
			{
			match("game "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:7: ( 'int' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:23:7: ( 'leftarrow' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:23:9: 'leftarrow'
			{
			match("leftarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:24:7: ( 'on' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:24:9: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:25:7: ( 'rectangle' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:25:9: 'rectangle'
			{
			match("rectangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:26:7: ( 'rightarrow' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:26:9: 'rightarrow'
			{
			match("rightarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:27:7: ( 'space' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:27:9: 'space'
			{
			match("space"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:28:7: ( 'touches' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:28:9: 'touches'
			{
			match("touches"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:29:7: ( 'triangle' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:29:9: 'triangle'
			{
			match("triangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:30:7: ( 'uparrow' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:30:9: 'uparrow'
			{
			match("uparrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:31:7: ( '{' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:31:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:32:7: ( '}' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:32:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			int _type = LETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:9:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "NONZERO_DIGIT"
	public final void mNONZERO_DIGIT() throws RecognitionException {
		try {
			int _type = NONZERO_DIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:13:2: ( '1' .. '9' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NONZERO_DIGIT"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			int _type = ZERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:15:5: ( '0' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:15:7: '0'
			{
			match('0'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:2: ( ( '\\r' )? '\\n' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:4: ( '\\r' )? '\\n'
			{
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:4: ( '\\r' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\r') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:18:4: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* NEWLINE ) )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:9: ( '//' (~ ( '\\n' | '\\r' ) )* NEWLINE )
			{
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:9: ( '//' (~ ( '\\n' | '\\r' ) )* NEWLINE )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:10: '//' (~ ( '\\n' | '\\r' ) )* NEWLINE
			{
			match("//"); 

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:22:15: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			mNEWLINE(); 

			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "OTHER_WHITESPACE"
	public final void mOTHER_WHITESPACE() throws RecognitionException {
		try {
			int _type = OTHER_WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:26:2: ( ( ' ' | '\\t' ) )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:26:4: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER_WHITESPACE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:29:4: ( 'if' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:29:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:30:5: ( 'for' )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:30:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "MULTI_CHAR_IDF"
	public final void mMULTI_CHAR_IDF() throws RecognitionException {
		try {
			int _type = MULTI_CHAR_IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:32:16: ( LETTER ( LETTER | ZERO | NONZERO_DIGIT | '_' )* )
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:32:18: LETTER ( LETTER | ZERO | NONZERO_DIGIT | '_' )*
			{
			mLETTER(); 

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:32:25: ( LETTER | ZERO | NONZERO_DIGIT | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI_CHAR_IDF"

	// $ANTLR start "MULTI_DIGIT_INTEGER"
	public final void mMULTI_DIGIT_INTEGER() throws RecognitionException {
		try {
			int _type = MULTI_DIGIT_INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:36:2: ( ZERO | ( NONZERO_DIGIT ( ZERO | NONZERO_DIGIT )+ ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:36:4: ZERO
					{
					mZERO(); 

					}
					break;
				case 2 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:37:6: ( NONZERO_DIGIT ( ZERO | NONZERO_DIGIT )+ )
					{
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:37:6: ( NONZERO_DIGIT ( ZERO | NONZERO_DIGIT )+ )
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:37:7: NONZERO_DIGIT ( ZERO | NONZERO_DIGIT )+
					{
					mNONZERO_DIGIT(); 

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:37:21: ( ZERO | NONZERO_DIGIT )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTI_DIGIT_INTEGER"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:5: ( '||' | '&&' | '==' | '<' ( '=' )? | '+' | '-' | '*' | '/' )
			int alt7=8;
			switch ( input.LA(1) ) {
			case '|':
				{
				alt7=1;
				}
				break;
			case '&':
				{
				alt7=2;
				}
				break;
			case '=':
				{
				alt7=3;
				}
				break;
			case '<':
				{
				alt7=4;
				}
				break;
			case '+':
				{
				alt7=5;
				}
				break;
			case '-':
				{
				alt7=6;
				}
				break;
			case '*':
				{
				alt7=7;
				}
				break;
			case '/':
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:9: '||'
					{
					match("||"); 

					}
					break;
				case 2 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:16: '&&'
					{
					match("&&"); 

					}
					break;
				case 3 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:23: '=='
					{
					match("=="); 

					}
					break;
				case 4 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:30: '<' ( '=' )?
					{
					match('<'); 
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:34: ( '=' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='=') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:34: '='
							{
							match('='); 
							}
							break;

					}

					}
					break;
				case 5 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:41: '+'
					{
					match('+'); 
					}
					break;
				case 6 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:47: '-'
					{
					match('-'); 
					}
					break;
				case 7 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:53: '*'
					{
					match('*'); 
					}
					break;
				case 8 :
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:158:59: '/'
					{
					match('/'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | LETTER | NONZERO_DIGIT | ZERO | NEWLINE | COMMENT | OTHER_WHITESPACE | IF | FOR | MULTI_CHAR_IDF | MULTI_DIGIT_INTEGER | OP )
		int alt8=37;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:70: T__25
				{
				mT__25(); 

				}
				break;
			case 12 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:76: T__26
				{
				mT__26(); 

				}
				break;
			case 13 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:82: T__27
				{
				mT__27(); 

				}
				break;
			case 14 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:88: T__28
				{
				mT__28(); 

				}
				break;
			case 15 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:94: T__29
				{
				mT__29(); 

				}
				break;
			case 16 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:100: T__30
				{
				mT__30(); 

				}
				break;
			case 17 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:106: T__31
				{
				mT__31(); 

				}
				break;
			case 18 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:112: T__32
				{
				mT__32(); 

				}
				break;
			case 19 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:118: T__33
				{
				mT__33(); 

				}
				break;
			case 20 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:124: T__34
				{
				mT__34(); 

				}
				break;
			case 21 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:130: T__35
				{
				mT__35(); 

				}
				break;
			case 22 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:136: T__36
				{
				mT__36(); 

				}
				break;
			case 23 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:142: T__37
				{
				mT__37(); 

				}
				break;
			case 24 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:148: T__38
				{
				mT__38(); 

				}
				break;
			case 25 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:154: T__39
				{
				mT__39(); 

				}
				break;
			case 26 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:160: T__40
				{
				mT__40(); 

				}
				break;
			case 27 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:166: LETTER
				{
				mLETTER(); 

				}
				break;
			case 28 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:173: NONZERO_DIGIT
				{
				mNONZERO_DIGIT(); 

				}
				break;
			case 29 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:187: ZERO
				{
				mZERO(); 

				}
				break;
			case 30 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:192: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 31 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:200: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 32 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:208: OTHER_WHITESPACE
				{
				mOTHER_WHITESPACE(); 

				}
				break;
			case 33 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:225: IF
				{
				mIF(); 

				}
				break;
			case 34 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:228: FOR
				{
				mFOR(); 

				}
				break;
			case 35 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:232: MULTI_CHAR_IDF
				{
				mMULTI_CHAR_IDF(); 

				}
				break;
			case 36 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:247: MULTI_DIGIT_INTEGER
				{
				mMULTI_DIGIT_INTEGER(); 

				}
				break;
			case 37 :
				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:1:267: OP
				{
				mOP(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\10\uffff\1\42\2\uffff\14\44\2\uffff\1\44\1\65\2\uffff\1\40\1\uffff\1"+
		"\44\3\uffff\1\45\2\uffff\5\45\1\77\1\45\1\101\7\45\4\uffff\5\45\1\116"+
		"\1\uffff\1\45\1\uffff\6\45\1\126\3\45\1\132\1\45\1\uffff\7\45\1\uffff"+
		"\3\45\2\uffff\3\45\1\151\4\45\1\156\4\45\1\uffff\4\45\1\uffff\4\45\1\173"+
		"\1\45\1\175\5\45\1\uffff\1\u0083\1\uffff\1\u0084\1\u0085\1\u0086\1\u0087"+
		"\1\45\5\uffff\1\u0089\1\uffff";
	static final String DFA8_eofS =
		"\u008a\uffff";
	static final String DFA8_minS =
		"\1\11\7\uffff\1\75\2\uffff\14\60\2\uffff\2\60\2\uffff\1\57\1\uffff\1\60"+
		"\3\uffff\1\151\2\uffff\1\162\1\167\1\163\1\155\1\164\1\60\1\146\1\60\1"+
		"\143\1\147\1\141\1\165\1\151\1\141\1\162\4\uffff\1\155\1\143\1\156\2\145"+
		"\1\60\1\uffff\1\164\1\uffff\1\164\1\150\2\143\1\141\1\162\1\60\1\141\1"+
		"\154\1\141\1\60\1\40\1\uffff\2\141\1\164\1\145\1\150\1\156\1\162\1\uffff"+
		"\1\164\1\145\1\162\2\uffff\1\162\1\156\1\141\1\60\1\145\1\147\1\157\1"+
		"\151\1\60\2\162\1\147\1\162\1\uffff\1\163\1\154\1\167\1\157\1\uffff\2"+
		"\157\1\154\1\162\1\60\1\145\1\60\1\156\2\167\1\145\1\157\1\uffff\1\60"+
		"\1\uffff\4\60\1\167\5\uffff\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\7\uffff\1\75\2\uffff\14\172\2\uffff\1\172\1\71\2\uffff\1\57\1\uffff"+
		"\1\172\3\uffff\1\151\2\uffff\1\162\1\167\1\163\1\155\1\164\1\172\1\146"+
		"\1\172\1\143\1\147\1\141\1\165\1\151\1\141\1\162\4\uffff\1\155\1\143\1"+
		"\156\2\145\1\172\1\uffff\1\164\1\uffff\1\164\1\150\2\143\1\141\1\162\1"+
		"\172\1\141\1\154\1\141\1\172\1\40\1\uffff\2\141\1\164\1\145\1\150\1\156"+
		"\1\162\1\uffff\1\164\1\145\1\162\2\uffff\1\162\1\156\1\141\1\172\1\145"+
		"\1\147\1\157\1\151\1\172\2\162\1\147\1\162\1\uffff\1\163\1\154\1\167\1"+
		"\157\1\uffff\2\157\1\154\1\162\1\172\1\145\1\172\1\156\2\167\1\145\1\157"+
		"\1\uffff\1\172\1\uffff\4\172\1\167\5\uffff\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\14\uffff\1\31\1"+
		"\32\2\uffff\1\35\1\36\1\uffff\1\40\1\uffff\1\45\1\5\1\10\1\uffff\1\33"+
		"\1\43\17\uffff\1\34\1\44\1\35\1\37\6\uffff\1\41\1\uffff\1\22\14\uffff"+
		"\1\20\7\uffff\1\42\3\uffff\1\16\1\17\15\uffff\1\25\4\uffff\1\14\14\uffff"+
		"\1\26\1\uffff\1\30\5\uffff\1\27\1\13\1\15\1\21\1\23\1\uffff\1\24";
	static final String DFA8_specialS =
		"\u008a\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\36\1\34\2\uffff\1\34\22\uffff\1\36\1\1\4\uffff\1\40\1\uffff\1\2\1"+
			"\3\2\40\1\4\1\5\1\6\1\35\1\33\11\32\1\uffff\1\7\1\40\1\10\3\uffff\32"+
			"\37\1\11\1\uffff\1\12\3\uffff\1\13\1\37\1\14\1\15\1\16\1\31\1\17\1\37"+
			"\1\20\2\37\1\21\2\37\1\22\2\37\1\23\1\24\1\25\1\26\5\37\1\27\1\40\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\40",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\43\14\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\46\21\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\47\13\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\50\16\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\51\31\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\5\45\1\53\7\45\1\52\14\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\54\25\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\55\14\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\56\3\45\1\57\21\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\60\12\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\61\2\45\1\62\10\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\63\12\45",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\64\13\45",
			"\12\66",
			"",
			"",
			"\1\70",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"",
			"",
			"\1\71",
			"",
			"",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\100",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"",
			"",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\117",
			"",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\133",
			"",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"",
			"\1\146",
			"\1\147",
			"\1\150",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\174",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\u0088",
			"",
			"",
			"",
			"",
			"",
			"\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | LETTER | NONZERO_DIGIT | ZERO | NEWLINE | COMMENT | OTHER_WHITESPACE | IF | FOR | MULTI_CHAR_IDF | MULTI_DIGIT_INTEGER | OP );";
		}
	}

}
