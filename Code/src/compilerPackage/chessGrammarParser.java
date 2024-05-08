// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-05-08 15:14:29

package compilerPackage;
import compilerPackage.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class chessGrammarParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CASTLE", "CLOSE", "COLUMN", "EP", 
		"EQUALS", "ERROR", "HASH", "INT", "MINUS", "NEWLINE", "OPEN", "PIECE", 
		"PLUS", "POINT", "SC", "TAB", "TAKE", "TURN"
	};
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int CLOSE=5;
	public static final int COLUMN=6;
	public static final int EP=7;
	public static final int EQUALS=8;
	public static final int ERROR=9;
	public static final int HASH=10;
	public static final int INT=11;
	public static final int MINUS=12;
	public static final int NEWLINE=13;
	public static final int OPEN=14;
	public static final int PIECE=15;
	public static final int PLUS=16;
	public static final int POINT=17;
	public static final int SC=18;
	public static final int TAB=19;
	public static final int TAKE=20;
	public static final int TURN=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "moveTo", "castleRule", "moveFrom", "enPassant", "turnNum", 
		"promotion", "checkmate", "turn", "startRule", "check", "move", "preamble"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public chessGrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public chessGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public chessGrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return chessGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g"; }


	public compilerChecker cc = new compilerChecker();

		public semanticHandler getHandler () {
			return cc.sh;
		}
		
		 public void displayRecognitionError(String[] tokenNames,
	                                       RecognitionException e) {
			// in tokenNames c'è la lista dei token che si sarebbe voluto trovare
			// token che genera l'errore
			Token tk = input.LT(1);
	    // header e corpo dell'errore gestito automaticamente da ANTLR
			String hdr = getErrorHeader(e);
			String msg = getErrorMessage(e, tokenNames);
			
			// passo tutto all'handler che lo 
			cc.sh.handleError(tokenNames, tk, e, hdr, msg);
	  }




	// $ANTLR start "startRule"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "startRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:5: ( ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )* )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:7: ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )*
			{
			dbg.location(62,7);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==TURN) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:8: preamble NEWLINE preamble NEWLINE
					{
					dbg.location(62,8);
					pushFollow(FOLLOW_preamble_in_startRule239);
					preamble();
					state._fsp--;
					dbg.location(62,17);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule241); dbg.location(62,25);
					pushFollow(FOLLOW_preamble_in_startRule243);
					preamble();
					state._fsp--;
					dbg.location(62,34);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule245); 
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(62,44);
			cc.checkChessboard();dbg.location(63,5);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:63:5: ( turn ( NEWLINE | EOF ) )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:63:6: turn ( NEWLINE | EOF )
					{
					dbg.location(63,6);
					pushFollow(FOLLOW_turn_in_startRule256);
					turn();
					state._fsp--;
					dbg.location(63,11);
					if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(63,27);
					cc.checkCorrectStartingTurn();
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "startRule"



	// $ANTLR start "preamble"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:66:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try { dbg.enterRule(getGrammarFileName(), "preamble");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			dbg.location(68,3);
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble289); dbg.location(68,9);
			cc.setPrambleStartTurn(t);dbg.location(69,2);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble294); dbg.location(70,2);
			match(input,OPEN,FOLLOW_OPEN_in_preamble298); dbg.location(71,2);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:2: (p= PIECE c= COLUMN r= INT SC )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==PIECE) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==COLUMN) ) {
						int LA3_2 = input.LA(3);
						if ( (LA3_2==INT) ) {
							int LA3_3 = input.LA(4);
							if ( (LA3_3==SC) ) {
								alt3=1;
							}

						}

					}

				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:3: p= PIECE c= COLUMN r= INT SC
					{
					dbg.location(71,4);
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble305); dbg.location(71,12);
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble309); dbg.location(71,21);
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble313); dbg.location(71,26);
					match(input,SC,FOLLOW_SC_in_preamble315); dbg.location(71,29);
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(72,2);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:2: (p1= PIECE c1= COLUMN r1= INT )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:3: p1= PIECE c1= COLUMN r1= INT
			{
			dbg.location(72,5);
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble326); dbg.location(72,14);
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble330); dbg.location(72,24);
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble334); dbg.location(72,29);
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}
			dbg.location(73,2);
			match(input,CLOSE,FOLLOW_CLOSE_in_preamble341); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "preamble");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "preamble"



	// $ANTLR start "turnNum"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:76:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try { dbg.enterRule(getGrammarFileName(), "turnNum");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:76:9: (v= INT )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:2: v= INT
			{
			dbg.location(77,3);
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum356); dbg.location(77,8);

					cc.setTurnNumber(v);
			    		cc.isTurnCorrect();
			    		
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "turnNum");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "turnNum"



	// $ANTLR start "moveFrom"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try { dbg.enterRule(getGrammarFileName(), "moveFrom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==PIECE) ) {
				alt8=1;
			}
			else if ( (LA8_0==COLUMN) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					dbg.location(84,2);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					dbg.location(84,4);
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom375); dbg.location(84,11);
					cc.setPiece(p);dbg.location(85,2);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:2: (c= COLUMN )?
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( (LA4_0==COLUMN) ) {
						int LA4_1 = input.LA(2);
						if ( (LA4_1==INT) ) {
							int LA4_5 = input.LA(3);
							if ( (LA4_5==COLUMN||LA4_5==MINUS||LA4_5==TAKE) ) {
								alt4=1;
							}
						}
						else if ( (LA4_1==COLUMN||LA4_1==MINUS||LA4_1==TAKE) ) {
							alt4=1;
						}
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: c= COLUMN
							{
							dbg.location(85,4);
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom383); dbg.location(85,12);
							cc.setColFrom(c);
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}
					dbg.location(86,2);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:2: (r= INT )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:3: r= INT
							{
							dbg.location(86,4);
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom393); dbg.location(86,9);
							cc.setRowFrom(r);
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(87,2);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:2: ( (t= TAKE |t= MINUS ) )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==MINUS||LA7_0==TAKE) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:3: (t= TAKE |t= MINUS )
							{
							dbg.location(87,3);
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:3: (t= TAKE |t= MINUS )
							int alt6=2;
							try { dbg.enterSubRule(6);
							try { dbg.enterDecision(6, decisionCanBacktrack[6]);

							int LA6_0 = input.LA(1);
							if ( (LA6_0==TAKE) ) {
								alt6=1;
							}
							else if ( (LA6_0==MINUS) ) {
								alt6=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(6);}

							switch (alt6) {
								case 1 :
									dbg.enterAlt(1);

									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:4: t= TAKE
									{
									dbg.location(87,5);
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom404); 
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:13: t= MINUS
									{
									dbg.location(87,14);
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom410); 
									}
									break;

							}
							} finally {dbg.exitSubRule(6);}
							dbg.location(87,22);
							cc.setTake(t);
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:2: ( (c= COLUMN t= TAKE ) )
					{
					dbg.location(88,2);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:2: ( (c= COLUMN t= TAKE ) )
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:3: (c= COLUMN t= TAKE )
					{
					dbg.location(88,3);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:3: (c= COLUMN t= TAKE )
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:4: c= COLUMN t= TAKE
					{
					dbg.location(88,5);
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom426); dbg.location(88,14);
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom430); 
					}
					dbg.location(88,21);
					cc.setTake(t); 
										cc.setColFrom(c);
					}

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
		dbg.location(90, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moveFrom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "moveFrom"



	// $ANTLR start "moveTo"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:91:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try { dbg.enterRule(getGrammarFileName(), "moveTo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:91:8: (c= COLUMN r= INT )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:92:2: c= COLUMN r= INT
			{
			dbg.location(92,3);
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo446); dbg.location(92,11);
			cc.setColTo(c);dbg.location(93,3);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo453); dbg.location(93,8);
			cc.setRowTo(r); 
					cc.setLastToken(r); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moveTo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "moveTo"



	// $ANTLR start "enPassant"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "enPassant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:10: ( EP )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:12: EP
			{
			dbg.location(97,12);
			match(input,EP,FOLLOW_EP_in_enPassant463); dbg.location(97,15);
			cc.setEnpassant();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "enPassant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "enPassant"



	// $ANTLR start "check"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "check");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:7: ( PLUS ( PLUS )? )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:9: PLUS ( PLUS )?
			{
			dbg.location(99,9);
			match(input,PLUS,FOLLOW_PLUS_in_check473); dbg.location(99,14);
			cc.setChecks();dbg.location(100,3);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:100:3: ( PLUS )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==PLUS) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:100:4: PLUS
					{
					dbg.location(100,4);
					match(input,PLUS,FOLLOW_PLUS_in_check480); dbg.location(100,9);
					cc.setChecks();
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
		dbg.location(101, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "check");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "check"



	// $ANTLR start "checkmate"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "checkmate");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:11: ( HASH )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:13: HASH
			{
			dbg.location(103,13);
			match(input,HASH,FOLLOW_HASH_in_checkmate499); dbg.location(103,18);
			cc.setCheckMate();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "checkmate");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "checkmate"



	// $ANTLR start "promotion"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:105:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try { dbg.enterRule(getGrammarFileName(), "promotion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:105:11: ( EQUALS p= PIECE )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:105:13: EQUALS p= PIECE
			{
			dbg.location(105,13);
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion509); dbg.location(105,21);
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion513); dbg.location(105,28);
			cc.setPromotion(p);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 49);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "promotion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "promotion"



	// $ANTLR start "castleRule"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:107:1: castleRule : t= CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		Token t=null;

		try { dbg.enterRule(getGrammarFileName(), "castleRule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:107:11: (t= CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:108:2: t= CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			dbg.location(108,3);
			t=(Token)match(input,CASTLE,FOLLOW_CASTLE_in_castleRule530); dbg.location(108,11);
			cc.setLastToken(t);dbg.location(109,2);
			match(input,MINUS,FOLLOW_MINUS_in_castleRule536); dbg.location(109,8);
			int i=1;dbg.location(110,2);
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule541); dbg.location(111,2);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:111:2: ( MINUS CASTLE )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==MINUS) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:111:3: MINUS CASTLE
					{
					dbg.location(111,3);
					match(input,MINUS,FOLLOW_MINUS_in_castleRule546); dbg.location(111,9);
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule548); dbg.location(111,16);
					i = 2;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(113,2);
			cc.setCastle(i);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(113, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "castleRule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "castleRule"



	// $ANTLR start "turn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:115:1: turn : turnNum POINT TAB ( move )? ( TAB move )? ;
	public final void turn() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "turn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:116:5: ( turnNum POINT TAB ( move )? ( TAB move )? )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:116:7: turnNum POINT TAB ( move )? ( TAB move )?
			{
			dbg.location(116,7);
			pushFollow(FOLLOW_turnNum_in_turn573);
			turnNum();
			state._fsp--;
			dbg.location(117,6);
			match(input,POINT,FOLLOW_POINT_in_turn581); dbg.location(118,6);
			match(input,TAB,FOLLOW_TAB_in_turn589); dbg.location(119,6);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:119:6: ( move )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==CASTLE||LA11_0==COLUMN||LA11_0==PIECE) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:119:7: move
					{
					dbg.location(119,7);
					pushFollow(FOLLOW_move_in_turn598);
					move();
					state._fsp--;
					dbg.location(119,12);
					cc.processMove();
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(120,7);
			cc.nextTurn();dbg.location(121,6);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:6: ( TAB move )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==TAB) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:7: TAB move
					{
					dbg.location(121,7);
					match(input,TAB,FOLLOW_TAB_in_turn618); dbg.location(122,6);
					pushFollow(FOLLOW_move_in_turn626);
					move();
					state._fsp--;
					dbg.location(122,11);
					cc.processMove();
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(123,7);
			cc.nextTurn();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(123, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "turn");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "turn"



	// $ANTLR start "move"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:125:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "move");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			dbg.enterAlt(1);

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			dbg.location(126,7);
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==COLUMN||LA16_0==PIECE) ) {
				alt16=1;
			}
			else if ( (LA16_0==CASTLE) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					dbg.location(126,8);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					dbg.enterAlt(1);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					dbg.location(126,9);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:9: ( moveFrom )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==PIECE) ) {
						alt13=1;
					}
					else if ( (LA13_0==COLUMN) ) {
						int LA13_2 = input.LA(2);
						if ( (LA13_2==TAKE) ) {
							alt13=1;
						}
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:126:9: moveFrom
							{
							dbg.location(126,9);
							pushFollow(FOLLOW_moveFrom_in_move652);
							moveFrom();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(127,7);
					pushFollow(FOLLOW_moveTo_in_move662);
					moveTo();
					state._fsp--;
					dbg.location(128,7);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:128:7: ( enPassant | promotion )?
					int alt14=3;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==EP) ) {
						alt14=1;
					}
					else if ( (LA14_0==EQUALS) ) {
						alt14=2;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:128:8: enPassant
							{
							dbg.location(128,8);
							pushFollow(FOLLOW_enPassant_in_move672);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:128:20: promotion
							{
							dbg.location(128,20);
							pushFollow(FOLLOW_promotion_in_move676);
							promotion();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(129,7);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:129:7: ( check | checkmate )?
					int alt15=3;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					int LA15_0 = input.LA(1);
					if ( (LA15_0==PLUS) ) {
						alt15=1;
					}
					else if ( (LA15_0==HASH) ) {
						alt15=2;
					}
					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:129:8: check
							{
							dbg.location(129,8);
							pushFollow(FOLLOW_check_in_move688);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:129:16: checkmate
							{
							dbg.location(129,16);
							pushFollow(FOLLOW_checkmate_in_move692);
							checkmate();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(15);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:130:8: castleRule
					{
					dbg.location(130,8);
					pushFollow(FOLLOW_castleRule_in_move705);
					castleRule();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(130, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "move");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "move"

	// Delegated rules



	public static final BitSet FOLLOW_preamble_in_startRule239 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule241 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_preamble_in_startRule243 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule245 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_turn_in_startRule256 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_startRule258 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_TURN_in_preamble289 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble294 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_in_preamble298 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble305 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble309 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble313 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_SC_in_preamble315 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble326 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble330 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble334 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom375 = new BitSet(new long[]{0x0000000000101842L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom383 = new BitSet(new long[]{0x0000000000101802L});
	public static final BitSet FOLLOW_INT_in_moveFrom393 = new BitSet(new long[]{0x0000000000101002L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom426 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo446 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_moveTo453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check473 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_PLUS_in_check480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion509 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_promotion513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule530 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MINUS_in_castleRule536 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule541 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_MINUS_in_castleRule546 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_turn573 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_turn581 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_turn589 = new BitSet(new long[]{0x0000000000088052L});
	public static final BitSet FOLLOW_move_in_turn598 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_TAB_in_turn618 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_turn626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move652 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move662 = new BitSet(new long[]{0x0000000000010582L});
	public static final BitSet FOLLOW_enPassant_in_move672 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_promotion_in_move676 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_check_in_move688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move705 = new BitSet(new long[]{0x0000000000000002L});
}
