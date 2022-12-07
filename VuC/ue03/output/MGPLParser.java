// $ANTLR 3.5.1 D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g 2022-12-07 01:57:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class MGPLParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FOR", "IF", "LETTER", 
		"MULTI_CHAR_IDF", "MULTI_DIGIT_INTEGER", "NEWLINE", "NONZERO_DIGIT", "OP", 
		"OTHER_WHITESPACE", "ZERO", "'!'", "'('", "')'", "','", "'-'", "'.'", 
		"';'", "'='", "'['", "']'", "'animation'", "'circle'", "'downarrow'", 
		"'else'", "'game '", "'int'", "'leftarrow'", "'on'", "'rectangle'", "'rightarrow'", 
		"'space'", "'touches'", "'triangle'", "'uparrow'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "block", "if_stmt", "for_stmt", "prog_body", "identifier", 
		"prog", "attr_ass", "expr", "init", "other_expr", "obj_decl", "ass_stmt", 
		"synpred2_MGPL", "operator", "obj_type", "stmt", "synpred1_MGPL", "anim_block", 
		"key_stroke", "integer", "decl", "var_decl", "event_block", "stmt_block", 
		"attr_ass_list", "unary_op_expr", "var", "prog_header"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public MGPLParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public MGPLParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public MGPLParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return MGPLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g"; }



	// $ANTLR start "integer"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:40:1: integer : ( ZERO | NONZERO_DIGIT | MULTI_DIGIT_INTEGER );
	public final void integer() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "integer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:41:2: ( ZERO | NONZERO_DIGIT | MULTI_DIGIT_INTEGER )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			dbg.location(41,2);
			if ( input.LA(1)==MULTI_DIGIT_INTEGER||input.LA(1)==NONZERO_DIGIT||input.LA(1)==ZERO ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "integer"



	// $ANTLR start "identifier"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:46:1: identifier : ( LETTER | MULTI_CHAR_IDF );
	public final void identifier() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:47:2: ( LETTER | MULTI_CHAR_IDF )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			dbg.location(47,2);
			if ( (input.LA(1) >= LETTER && input.LA(1) <= MULTI_CHAR_IDF) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier"



	// $ANTLR start "prog"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:51:1: prog : prog_header prog_body ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:51:5: ( prog_header prog_body )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:51:9: prog_header prog_body
			{
			dbg.location(51,9);
			pushFollow(FOLLOW_prog_header_in_prog280);
			prog_header();
			state._fsp--;
			if (state.failed) return;dbg.location(51,21);
			pushFollow(FOLLOW_prog_body_in_prog282);
			prog_body();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "prog_header"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:54:1: prog_header : 'game ' identifier '(' ( attr_ass_list )? ')' ;
	public final void prog_header() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog_header");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:55:5: ( 'game ' identifier '(' ( attr_ass_list )? ')' )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:55:7: 'game ' identifier '(' ( attr_ass_list )? ')'
			{
			dbg.location(55,7);
			match(input,29,FOLLOW_29_in_prog_header303); if (state.failed) return;dbg.location(55,15);
			pushFollow(FOLLOW_identifier_in_prog_header305);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(55,26);
			match(input,16,FOLLOW_16_in_prog_header307); if (state.failed) return;dbg.location(55,30);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:55:30: ( attr_ass_list )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( ((LA1_0 >= LETTER && LA1_0 <= MULTI_CHAR_IDF)) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:55:30: attr_ass_list
					{
					dbg.location(55,30);
					pushFollow(FOLLOW_attr_ass_list_in_prog_header309);
					attr_ass_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(55,45);
			match(input,17,FOLLOW_17_in_prog_header312); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog_header");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog_header"



	// $ANTLR start "prog_body"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:58:1: prog_body : ( ( decl )+ stmt_block ( block )* | stmt_block ( block )* );
	public final void prog_body() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog_body");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:5: ( ( decl )+ stmt_block ( block )* | stmt_block ( block )* )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==26||LA5_0==30||LA5_0==33||LA5_0==37) ) {
				alt5=1;
			}
			else if ( (LA5_0==39) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:9: ( decl )+ stmt_block ( block )*
					{
					dbg.location(59,9);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:9: ( decl )+
					int cnt2=0;
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==26||LA2_0==30||LA2_0==33||LA2_0==37) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:9: decl
							{
							dbg.location(59,9);
							pushFollow(FOLLOW_decl_in_prog_body335);
							decl();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(2, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt2++;
					}
					} finally {dbg.exitSubRule(2);}
					dbg.location(59,15);
					pushFollow(FOLLOW_stmt_block_in_prog_body338);
					stmt_block();
					state._fsp--;
					if (state.failed) return;dbg.location(59,26);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:26: ( block )*
					try { dbg.enterSubRule(3);

					loop3:
					while (true) {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==25||LA3_0==32) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:59:26: block
							{
							dbg.location(59,26);
							pushFollow(FOLLOW_block_in_prog_body340);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop3;
						}
					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:60:9: stmt_block ( block )*
					{
					dbg.location(60,9);
					pushFollow(FOLLOW_stmt_block_in_prog_body351);
					stmt_block();
					state._fsp--;
					if (state.failed) return;dbg.location(60,20);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:60:20: ( block )*
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==25||LA4_0==32) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:60:20: block
							{
							dbg.location(60,20);
							pushFollow(FOLLOW_block_in_prog_body353);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop4;
						}
					}
					} finally {dbg.exitSubRule(4);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog_body");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog_body"



	// $ANTLR start "block"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:63:1: block : ( anim_block | event_block );
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:64:5: ( anim_block | event_block )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==25) ) {
				alt6=1;
			}
			else if ( (LA6_0==32) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:64:9: anim_block
					{
					dbg.location(64,9);
					pushFollow(FOLLOW_anim_block_in_block373);
					anim_block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:64:22: event_block
					{
					dbg.location(64,22);
					pushFollow(FOLLOW_event_block_in_block377);
					event_block();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "decl"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:67:1: decl : ( var_decl ';' | obj_decl ';' );
	public final void decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:67:5: ( var_decl ';' | obj_decl ';' )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==30) ) {
				alt7=1;
			}
			else if ( (LA7_0==26||LA7_0==33||LA7_0==37) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:67:9: var_decl ';'
					{
					dbg.location(67,9);
					pushFollow(FOLLOW_var_decl_in_decl391);
					var_decl();
					state._fsp--;
					if (state.failed) return;dbg.location(67,18);
					match(input,21,FOLLOW_21_in_decl393); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:68:9: obj_decl ';'
					{
					dbg.location(68,9);
					pushFollow(FOLLOW_obj_decl_in_decl403);
					obj_decl();
					state._fsp--;
					if (state.failed) return;dbg.location(68,18);
					match(input,21,FOLLOW_21_in_decl405); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "decl"



	// $ANTLR start "var_decl"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:71:1: var_decl : 'int' identifier ( ( init )? | '[' integer ']' ) ;
	public final void var_decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "var_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:5: ( 'int' identifier ( ( init )? | '[' integer ']' ) )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:7: 'int' identifier ( ( init )? | '[' integer ']' )
			{
			dbg.location(72,7);
			match(input,30,FOLLOW_30_in_var_decl422); if (state.failed) return;dbg.location(72,13);
			pushFollow(FOLLOW_identifier_in_var_decl424);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(72,24);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:24: ( ( init )? | '[' integer ']' )
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= 21 && LA9_0 <= 22)) ) {
				alt9=1;
			}
			else if ( (LA9_0==23) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:25: ( init )?
					{
					dbg.location(72,25);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:25: ( init )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( (LA8_0==22) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:25: init
							{
							dbg.location(72,25);
							pushFollow(FOLLOW_init_in_var_decl427);
							init();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:72:33: '[' integer ']'
					{
					dbg.location(72,33);
					match(input,23,FOLLOW_23_in_var_decl432); if (state.failed) return;dbg.location(72,37);
					pushFollow(FOLLOW_integer_in_var_decl434);
					integer();
					state._fsp--;
					if (state.failed) return;dbg.location(72,45);
					match(input,24,FOLLOW_24_in_var_decl436); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "var_decl"



	// $ANTLR start "init"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:75:1: init : '=' expr ;
	public final void init() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "init");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:75:5: ( '=' expr )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:75:9: '=' expr
			{
			dbg.location(75,9);
			match(input,22,FOLLOW_22_in_init455); if (state.failed) return;dbg.location(75,13);
			pushFollow(FOLLOW_expr_in_init457);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "init"



	// $ANTLR start "obj_decl"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:78:1: obj_decl : obj_type identifier ( '(' ( attr_ass_list )? ')' | '[' identifier ']' ) ;
	public final void obj_decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "obj_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:5: ( obj_type identifier ( '(' ( attr_ass_list )? ')' | '[' identifier ']' ) )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:9: obj_type identifier ( '(' ( attr_ass_list )? ')' | '[' identifier ']' )
			{
			dbg.location(79,9);
			pushFollow(FOLLOW_obj_type_in_obj_decl476);
			obj_type();
			state._fsp--;
			if (state.failed) return;dbg.location(79,18);
			pushFollow(FOLLOW_identifier_in_obj_decl478);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(79,29);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:29: ( '(' ( attr_ass_list )? ')' | '[' identifier ']' )
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==16) ) {
				alt11=1;
			}
			else if ( (LA11_0==23) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:30: '(' ( attr_ass_list )? ')'
					{
					dbg.location(79,30);
					match(input,16,FOLLOW_16_in_obj_decl481); if (state.failed) return;dbg.location(79,34);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:34: ( attr_ass_list )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( ((LA10_0 >= LETTER && LA10_0 <= MULTI_CHAR_IDF)) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:34: attr_ass_list
							{
							dbg.location(79,34);
							pushFollow(FOLLOW_attr_ass_list_in_obj_decl483);
							attr_ass_list();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(79,49);
					match(input,17,FOLLOW_17_in_obj_decl486); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:79:55: '[' identifier ']'
					{
					dbg.location(79,55);
					match(input,23,FOLLOW_23_in_obj_decl490); if (state.failed) return;dbg.location(79,59);
					pushFollow(FOLLOW_identifier_in_obj_decl492);
					identifier();
					state._fsp--;
					if (state.failed) return;dbg.location(79,70);
					match(input,24,FOLLOW_24_in_obj_decl494); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "obj_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "obj_decl"



	// $ANTLR start "obj_type"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:82:1: obj_type : ( 'rectangle' | 'triangle' | 'circle' );
	public final void obj_type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "obj_type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:83:5: ( 'rectangle' | 'triangle' | 'circle' )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			dbg.location(83,5);
			if ( input.LA(1)==26||input.LA(1)==33||input.LA(1)==37 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "obj_type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "obj_type"



	// $ANTLR start "attr_ass_list"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:88:1: attr_ass_list : attr_ass ( ',' attr_ass_list )? ;
	public final void attr_ass_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "attr_ass_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:89:5: ( attr_ass ( ',' attr_ass_list )? )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:89:7: attr_ass ( ',' attr_ass_list )?
			{
			dbg.location(89,7);
			pushFollow(FOLLOW_attr_ass_in_attr_ass_list553);
			attr_ass();
			state._fsp--;
			if (state.failed) return;dbg.location(89,16);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:89:16: ( ',' attr_ass_list )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==18) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:89:17: ',' attr_ass_list
					{
					dbg.location(89,17);
					match(input,18,FOLLOW_18_in_attr_ass_list556); if (state.failed) return;dbg.location(89,21);
					pushFollow(FOLLOW_attr_ass_list_in_attr_ass_list558);
					attr_ass_list();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(90, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attr_ass_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "attr_ass_list"



	// $ANTLR start "attr_ass"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:92:1: attr_ass : identifier '=' expr ;
	public final void attr_ass() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "attr_ass");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:93:5: ( identifier '=' expr )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:93:7: identifier '=' expr
			{
			dbg.location(93,7);
			pushFollow(FOLLOW_identifier_in_attr_ass578);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(93,18);
			match(input,22,FOLLOW_22_in_attr_ass580); if (state.failed) return;dbg.location(93,22);
			pushFollow(FOLLOW_expr_in_attr_ass582);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attr_ass");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "attr_ass"



	// $ANTLR start "anim_block"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:96:1: anim_block : 'animation' identifier '(' obj_type identifier ')' stmt_block ;
	public final void anim_block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "anim_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:97:5: ( 'animation' identifier '(' obj_type identifier ')' stmt_block )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:97:9: 'animation' identifier '(' obj_type identifier ')' stmt_block
			{
			dbg.location(97,9);
			match(input,25,FOLLOW_25_in_anim_block601); if (state.failed) return;dbg.location(97,21);
			pushFollow(FOLLOW_identifier_in_anim_block603);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(97,32);
			match(input,16,FOLLOW_16_in_anim_block605); if (state.failed) return;dbg.location(97,36);
			pushFollow(FOLLOW_obj_type_in_anim_block607);
			obj_type();
			state._fsp--;
			if (state.failed) return;dbg.location(97,45);
			pushFollow(FOLLOW_identifier_in_anim_block609);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(97,56);
			match(input,17,FOLLOW_17_in_anim_block611); if (state.failed) return;dbg.location(97,60);
			pushFollow(FOLLOW_stmt_block_in_anim_block613);
			stmt_block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "anim_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "anim_block"



	// $ANTLR start "event_block"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:100:1: event_block : 'on' key_stroke stmt_block ;
	public final void event_block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "event_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:101:5: ( 'on' key_stroke stmt_block )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:101:9: 'on' key_stroke stmt_block
			{
			dbg.location(101,9);
			match(input,32,FOLLOW_32_in_event_block632); if (state.failed) return;dbg.location(101,14);
			pushFollow(FOLLOW_key_stroke_in_event_block634);
			key_stroke();
			state._fsp--;
			if (state.failed) return;dbg.location(101,25);
			pushFollow(FOLLOW_stmt_block_in_event_block636);
			stmt_block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(102, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "event_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "event_block"



	// $ANTLR start "stmt_block"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:105:1: stmt_block : '{' ( stmt )* '}' ;
	public final void stmt_block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmt_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:106:5: ( '{' ( stmt )* '}' )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:106:9: '{' ( stmt )* '}'
			{
			dbg.location(106,9);
			match(input,39,FOLLOW_39_in_stmt_block656); if (state.failed) return;dbg.location(106,13);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:106:13: ( stmt )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= FOR && LA13_0 <= MULTI_CHAR_IDF)) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:106:13: stmt
					{
					dbg.location(106,13);
					pushFollow(FOLLOW_stmt_in_stmt_block658);
					stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(106,19);
			match(input,40,FOLLOW_40_in_stmt_block661); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(107, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmt_block"



	// $ANTLR start "key_stroke"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:109:1: key_stroke : ( 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' );
	public final void key_stroke() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "key_stroke");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:110:5: ( 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
			{
			dbg.location(110,5);
			if ( input.LA(1)==27||input.LA(1)==31||(input.LA(1) >= 34 && input.LA(1) <= 35)||input.LA(1)==38 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(115, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "key_stroke");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "key_stroke"



	// $ANTLR start "stmt"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:118:1: stmt : ( if_stmt | for_stmt | ass_stmt );
	public final void stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:118:5: ( if_stmt | for_stmt | ass_stmt )
			int alt14=3;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			switch ( input.LA(1) ) {
			case IF:
				{
				alt14=1;
				}
				break;
			case FOR:
				{
				alt14=2;
				}
				break;
			case LETTER:
			case MULTI_CHAR_IDF:
				{
				alt14=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:118:9: if_stmt
					{
					dbg.location(118,9);
					pushFollow(FOLLOW_if_stmt_in_stmt742);
					if_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:119:9: for_stmt
					{
					dbg.location(119,9);
					pushFollow(FOLLOW_for_stmt_in_stmt753);
					for_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:120:9: ass_stmt
					{
					dbg.location(120,9);
					pushFollow(FOLLOW_ass_stmt_in_stmt764);
					ass_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(121, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stmt"



	// $ANTLR start "if_stmt"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:124:1: if_stmt : IF '(' expr ')' stmt_block ( 'else' stmt_block )? ;
	public final void if_stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:125:5: ( IF '(' expr ')' stmt_block ( 'else' stmt_block )? )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:125:9: IF '(' expr ')' stmt_block ( 'else' stmt_block )?
			{
			dbg.location(125,9);
			match(input,IF,FOLLOW_IF_in_if_stmt784); if (state.failed) return;dbg.location(125,12);
			match(input,16,FOLLOW_16_in_if_stmt786); if (state.failed) return;dbg.location(125,16);
			pushFollow(FOLLOW_expr_in_if_stmt788);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(125,21);
			match(input,17,FOLLOW_17_in_if_stmt790); if (state.failed) return;dbg.location(125,25);
			pushFollow(FOLLOW_stmt_block_in_if_stmt792);
			stmt_block();
			state._fsp--;
			if (state.failed) return;dbg.location(125,36);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:125:36: ( 'else' stmt_block )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==28) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:125:37: 'else' stmt_block
					{
					dbg.location(125,37);
					match(input,28,FOLLOW_28_in_if_stmt795); if (state.failed) return;dbg.location(125,44);
					pushFollow(FOLLOW_stmt_block_in_if_stmt797);
					stmt_block();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(126, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "for_stmt"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:128:1: for_stmt : FOR '(' ass_stmt ';' expr ';' ass_stmt ')' stmt_block ;
	public final void for_stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "for_stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:129:5: ( FOR '(' ass_stmt ';' expr ';' ass_stmt ')' stmt_block )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:129:7: FOR '(' ass_stmt ';' expr ';' ass_stmt ')' stmt_block
			{
			dbg.location(129,7);
			match(input,FOR,FOLLOW_FOR_in_for_stmt817); if (state.failed) return;dbg.location(129,11);
			match(input,16,FOLLOW_16_in_for_stmt819); if (state.failed) return;dbg.location(129,15);
			pushFollow(FOLLOW_ass_stmt_in_for_stmt821);
			ass_stmt();
			state._fsp--;
			if (state.failed) return;dbg.location(129,24);
			match(input,21,FOLLOW_21_in_for_stmt823); if (state.failed) return;dbg.location(129,28);
			pushFollow(FOLLOW_expr_in_for_stmt825);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(129,33);
			match(input,21,FOLLOW_21_in_for_stmt827); if (state.failed) return;dbg.location(129,37);
			pushFollow(FOLLOW_ass_stmt_in_for_stmt829);
			ass_stmt();
			state._fsp--;
			if (state.failed) return;dbg.location(129,46);
			match(input,17,FOLLOW_17_in_for_stmt831); if (state.failed) return;dbg.location(129,50);
			pushFollow(FOLLOW_stmt_block_in_for_stmt833);
			stmt_block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(130, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "for_stmt"



	// $ANTLR start "ass_stmt"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:132:1: ass_stmt : var '=' expr ';' ;
	public final void ass_stmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ass_stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:133:5: ( var '=' expr ';' )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:133:9: var '=' expr ';'
			{
			dbg.location(133,9);
			pushFollow(FOLLOW_var_in_ass_stmt852);
			var();
			state._fsp--;
			if (state.failed) return;dbg.location(133,13);
			match(input,22,FOLLOW_22_in_ass_stmt854); if (state.failed) return;dbg.location(133,17);
			pushFollow(FOLLOW_expr_in_ass_stmt856);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(133,22);
			match(input,21,FOLLOW_21_in_ass_stmt858); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(134, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ass_stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ass_stmt"



	// $ANTLR start "var"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:1: var : identifier ( '[' expr ']' )? ( '.' identifier )? ;
	public final void var() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "var");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:5: ( identifier ( '[' expr ']' )? ( '.' identifier )? )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:9: identifier ( '[' expr ']' )? ( '.' identifier )?
			{
			dbg.location(136,9);
			pushFollow(FOLLOW_identifier_in_var873);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(136,20);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:20: ( '[' expr ']' )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==23) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:21: '[' expr ']'
					{
					dbg.location(136,21);
					match(input,23,FOLLOW_23_in_var876); if (state.failed) return;dbg.location(136,25);
					pushFollow(FOLLOW_expr_in_var878);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(136,30);
					match(input,24,FOLLOW_24_in_var880); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(136,36);
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:36: ( '.' identifier )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==20) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:136:37: '.' identifier
					{
					dbg.location(136,37);
					match(input,20,FOLLOW_20_in_var885); if (state.failed) return;dbg.location(136,41);
					pushFollow(FOLLOW_identifier_in_var887);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(137, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "var"



	// $ANTLR start "expr"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:139:1: expr : ( ( '-' | '!' )=> unary_op_expr | ( integer | identifier | '(' )=> other_expr ( operator expr )? );
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:139:5: ( ( '-' | '!' )=> unary_op_expr | ( integer | identifier | '(' )=> other_expr ( operator expr )? )
			int alt19=2;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==19) && (synpred1_MGPL())) {
				alt19=1;
			}
			else if ( (LA19_0==15) && (synpred1_MGPL())) {
				alt19=1;
			}
			else if ( (LA19_0==MULTI_DIGIT_INTEGER||LA19_0==NONZERO_DIGIT||LA19_0==ZERO) && (synpred2_MGPL())) {
				alt19=2;
			}
			else if ( ((LA19_0 >= LETTER && LA19_0 <= MULTI_CHAR_IDF)) && (synpred2_MGPL())) {
				alt19=2;
			}
			else if ( (LA19_0==16) && (synpred2_MGPL())) {
				alt19=2;
			}

			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:139:9: ( '-' | '!' )=> unary_op_expr
					{
					dbg.location(139,24);
					pushFollow(FOLLOW_unary_op_expr_in_expr913);
					unary_op_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:9: ( integer | identifier | '(' )=> other_expr ( operator expr )?
					{
					dbg.location(140,41);
					pushFollow(FOLLOW_other_expr_in_expr937);
					other_expr();
					state._fsp--;
					if (state.failed) return;dbg.location(140,52);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:52: ( operator expr )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==OP) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:53: operator expr
							{
							dbg.location(140,53);
							pushFollow(FOLLOW_operator_in_expr940);
							operator();
							state._fsp--;
							if (state.failed) return;dbg.location(140,62);
							pushFollow(FOLLOW_expr_in_expr942);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(18);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(141, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "unary_op_expr"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:144:1: unary_op_expr : ( '-' expr | '!' expr );
	public final void unary_op_expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "unary_op_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(144, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:145:2: ( '-' expr | '!' expr )
			int alt20=2;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==19) ) {
				alt20=1;
			}
			else if ( (LA20_0==15) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:145:6: '-' expr
					{
					dbg.location(145,6);
					match(input,19,FOLLOW_19_in_unary_op_expr970); if (state.failed) return;dbg.location(145,10);
					pushFollow(FOLLOW_expr_in_unary_op_expr972);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:146:6: '!' expr
					{
					dbg.location(146,6);
					match(input,15,FOLLOW_15_in_unary_op_expr980); if (state.failed) return;dbg.location(146,10);
					pushFollow(FOLLOW_expr_in_unary_op_expr982);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(147, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary_op_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unary_op_expr"



	// $ANTLR start "other_expr"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:148:1: other_expr : ( integer | var ( 'touches' var )? | '(' expr ')' );
	public final void other_expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "other_expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:149:2: ( integer | var ( 'touches' var )? | '(' expr ')' )
			int alt22=3;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			switch ( input.LA(1) ) {
			case MULTI_DIGIT_INTEGER:
			case NONZERO_DIGIT:
			case ZERO:
				{
				alt22=1;
				}
				break;
			case LETTER:
			case MULTI_CHAR_IDF:
				{
				alt22=2;
				}
				break;
			case 16:
				{
				alt22=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:149:4: integer
					{
					dbg.location(149,4);
					pushFollow(FOLLOW_integer_in_other_expr992);
					integer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:150:6: var ( 'touches' var )?
					{
					dbg.location(150,6);
					pushFollow(FOLLOW_var_in_other_expr999);
					var();
					state._fsp--;
					if (state.failed) return;dbg.location(150,10);
					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:150:10: ( 'touches' var )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==36) ) {
						alt21=1;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:150:11: 'touches' var
							{
							dbg.location(150,11);
							match(input,36,FOLLOW_36_in_other_expr1002); if (state.failed) return;dbg.location(150,21);
							pushFollow(FOLLOW_var_in_other_expr1004);
							var();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(21);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:151:6: '(' expr ')'
					{
					dbg.location(151,6);
					match(input,16,FOLLOW_16_in_other_expr1014); if (state.failed) return;dbg.location(151,10);
					pushFollow(FOLLOW_expr_in_other_expr1016);
					expr();
					state._fsp--;
					if (state.failed) return;dbg.location(151,15);
					match(input,17,FOLLOW_17_in_other_expr1018); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(152, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "other_expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "other_expr"



	// $ANTLR start "operator"
	// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:154:1: operator : OP ;
	public final void operator() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "operator");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:155:2: ( OP )
			dbg.enterAlt(1);

			// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:155:4: OP
			{
			dbg.location(155,4);
			match(input,OP,FOLLOW_OP_in_operator1036); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(156, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "operator");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "operator"

	// $ANTLR start synpred1_MGPL
	public final void synpred1_MGPL_fragment() throws RecognitionException {
		// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:139:9: ( '-' | '!' )
		dbg.enterAlt(1);

		// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:
		{
		dbg.location(139,9);
		if ( input.LA(1)==15||input.LA(1)==19 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			dbg.recognitionException(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred1_MGPL

	// $ANTLR start synpred2_MGPL
	public final void synpred2_MGPL_fragment() throws RecognitionException {
		// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:9: ( integer | identifier | '(' )
		int alt23=3;
		try { dbg.enterDecision(23, decisionCanBacktrack[23]);

		switch ( input.LA(1) ) {
		case MULTI_DIGIT_INTEGER:
		case NONZERO_DIGIT:
		case ZERO:
			{
			alt23=1;
			}
			break;
		case LETTER:
		case MULTI_CHAR_IDF:
			{
			alt23=2;
			}
			break;
		case 16:
			{
			alt23=3;
			}
			break;
		default:
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 23, 0, input);
			dbg.recognitionException(nvae);
			throw nvae;
		}
		} finally {dbg.exitDecision(23);}

		switch (alt23) {
			case 1 :
				dbg.enterAlt(1);

				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:10: integer
				{
				dbg.location(140,10);
				pushFollow(FOLLOW_integer_in_synpred2_MGPL924);
				integer();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				dbg.enterAlt(2);

				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:20: identifier
				{
				dbg.location(140,20);
				pushFollow(FOLLOW_identifier_in_synpred2_MGPL928);
				identifier();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 3 :
				dbg.enterAlt(3);

				// D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\MGPL.g:140:33: '('
				{
				dbg.location(140,33);
				match(input,16,FOLLOW_16_in_synpred2_MGPL932); if (state.failed) return;
				}
				break;

		}
	}
	// $ANTLR end synpred2_MGPL

	// Delegated rules

	public final boolean synpred2_MGPL() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_MGPL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_MGPL() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred1_MGPL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_prog_header_in_prog280 = new BitSet(new long[]{0x000000A244000000L});
	public static final BitSet FOLLOW_prog_body_in_prog282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_prog_header303 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_prog_header305 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_prog_header307 = new BitSet(new long[]{0x0000000000020180L});
	public static final BitSet FOLLOW_attr_ass_list_in_prog_header309 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_prog_header312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_prog_body335 = new BitSet(new long[]{0x000000A244000000L});
	public static final BitSet FOLLOW_stmt_block_in_prog_body338 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_block_in_prog_body340 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_stmt_block_in_prog_body351 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_block_in_prog_body353 = new BitSet(new long[]{0x0000000102000002L});
	public static final BitSet FOLLOW_anim_block_in_block373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_event_block_in_block377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_decl391 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_decl393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obj_decl_in_decl403 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_decl405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_var_decl422 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_var_decl424 = new BitSet(new long[]{0x0000000000C00002L});
	public static final BitSet FOLLOW_init_in_var_decl427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_var_decl432 = new BitSet(new long[]{0x0000000000004A00L});
	public static final BitSet FOLLOW_integer_in_var_decl434 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_var_decl436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_init455 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_init457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obj_type_in_obj_decl476 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_obj_decl478 = new BitSet(new long[]{0x0000000000810000L});
	public static final BitSet FOLLOW_16_in_obj_decl481 = new BitSet(new long[]{0x0000000000020180L});
	public static final BitSet FOLLOW_attr_ass_list_in_obj_decl483 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_obj_decl486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_obj_decl490 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_obj_decl492 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_obj_decl494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_ass_in_attr_ass_list553 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_attr_ass_list556 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_attr_ass_list_in_attr_ass_list558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_attr_ass578 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_attr_ass580 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_attr_ass582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_anim_block601 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_anim_block603 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_anim_block605 = new BitSet(new long[]{0x0000002204000000L});
	public static final BitSet FOLLOW_obj_type_in_anim_block607 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_anim_block609 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_anim_block611 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_stmt_block_in_anim_block613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_event_block632 = new BitSet(new long[]{0x0000004C88000000L});
	public static final BitSet FOLLOW_key_stroke_in_event_block634 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_stmt_block_in_event_block636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stmt_block656 = new BitSet(new long[]{0x00000100000001E0L});
	public static final BitSet FOLLOW_stmt_in_stmt_block658 = new BitSet(new long[]{0x00000100000001E0L});
	public static final BitSet FOLLOW_40_in_stmt_block661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_stmt742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_stmt753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ass_stmt_in_stmt764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt784 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_if_stmt786 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_if_stmt788 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_if_stmt790 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_stmt_block_in_if_stmt792 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_if_stmt795 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_stmt_block_in_if_stmt797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_stmt817 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_for_stmt819 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_ass_stmt_in_for_stmt821 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt823 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_for_stmt825 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_for_stmt827 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_ass_stmt_in_for_stmt829 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_for_stmt831 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_stmt_block_in_for_stmt833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_ass_stmt852 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_ass_stmt854 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_ass_stmt856 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ass_stmt858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_var873 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_23_in_var876 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_var878 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_var880 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_var885 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_identifier_in_var887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_op_expr_in_expr913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_other_expr_in_expr937 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_operator_in_expr940 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_expr942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unary_op_expr970 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_unary_op_expr972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_unary_op_expr980 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_unary_op_expr982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_other_expr992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_other_expr999 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_other_expr1002 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_var_in_other_expr1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_other_expr1014 = new BitSet(new long[]{0x000000000009CB80L});
	public static final BitSet FOLLOW_expr_in_other_expr1016 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_other_expr1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_in_operator1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_synpred2_MGPL924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_synpred2_MGPL928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_synpred2_MGPL932 = new BitSet(new long[]{0x0000000000000002L});
}
