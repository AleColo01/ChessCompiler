// $ANTLR 3.5.1 C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-29 15:27:18

package compilerPackage;
import compilerPackage.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class chessGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CASTLE", "CLOSE", "COLUMN", "EP", 
		"EQUALS", "ERROR_TOKEN", "HASH", "INT", "MINUS", "NEWLINE", "OPEN", "PIECE", 
		"PLUS", "POINT", "SC", "TAB", "TAKE", "TURN"
	};
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int CLOSE=5;
	public static final int COLUMN=6;
	public static final int EP=7;
	public static final int EQUALS=8;
	public static final int ERROR_TOKEN=9;
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


	public chessGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public chessGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return chessGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g"; }


	public compilerChecker cc = new compilerChecker();

	/*
	SemanticHandler h = new SemanticHandler ();

		public SemanticHandler getHandler () {
			return h;
		}


	public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
		// in tokenNames c'è la lista dei token che si sarebbe voluto trovare
		// token che genera l'errore
		Token tk = input.LT(1);
	    // header e corpo dell'errore gestito automaticamente da ANTLR
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
			
		// passo tutto all'handler che lo 
		h.handleError(tokenNames, tk, e, hdr, msg);
	  }
	*/



	// $ANTLR start "preamble"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:65:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:66:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble240); 
			cc.setPrambleStartTurn(t);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble245); 
			match(input,OPEN,FOLLOW_OPEN_in_preamble249); 
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:70:2: (p= PIECE c= COLUMN r= INT SC )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==PIECE) ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==COLUMN) ) {
						int LA1_2 = input.LA(3);
						if ( (LA1_2==INT) ) {
							int LA1_3 = input.LA(4);
							if ( (LA1_3==SC) ) {
								alt1=1;
							}

						}

					}

				}

				switch (alt1) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:70:3: p= PIECE c= COLUMN r= INT SC
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble256); 
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble260); 
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble264); 
					match(input,SC,FOLLOW_SC_in_preamble266); 
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:2: (p1= PIECE c1= COLUMN r1= INT )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:3: p1= PIECE c1= COLUMN r1= INT
			{
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble277); 
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble281); 
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble285); 
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_preamble292); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "preamble"



	// $ANTLR start "turnNum"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:75:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:75:9: (v= INT )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:76:2: v= INT
			{
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum307); 

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
	}
	// $ANTLR end "turnNum"



	// $ANTLR start "moveFrom"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:81:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:81:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PIECE) ) {
				alt6=1;
			}
			else if ( (LA6_0==COLUMN) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:82:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:82:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:82:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom324); 
					cc.setPiece(p);
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:2: (c= COLUMN )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==COLUMN) ) {
						int LA2_1 = input.LA(2);
						if ( (LA2_1==INT) ) {
							int LA2_5 = input.LA(3);
							if ( (LA2_5==COLUMN||LA2_5==MINUS||LA2_5==TAKE) ) {
								alt2=1;
							}
						}
						else if ( (LA2_1==COLUMN||LA2_1==MINUS||LA2_1==TAKE) ) {
							alt2=1;
						}
					}
					switch (alt2) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom332); 
							cc.setColFrom(c);
							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: (r= INT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==INT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: r= INT
							{
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom342); 
							cc.setRowFrom(r);
							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:2: ( (t= TAKE |t= MINUS ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==MINUS||LA5_0==TAKE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: (t= TAKE |t= MINUS )
							{
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: (t= TAKE |t= MINUS )
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==TAKE) ) {
								alt4=1;
							}
							else if ( (LA4_0==MINUS) ) {
								alt4=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}

							switch (alt4) {
								case 1 :
									// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom353); 
									}
									break;
								case 2 :
									// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:85:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom359); 
									}
									break;

							}

							cc.setTake(t);
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:2: ( (c= COLUMN t= TAKE ) )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:2: ( (c= COLUMN t= TAKE ) )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:3: (c= COLUMN t= TAKE )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:3: (c= COLUMN t= TAKE )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:86:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom375); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom379); 
					}

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
	}
	// $ANTLR end "moveFrom"



	// $ANTLR start "moveTo"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:89:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:89:8: (c= COLUMN r= INT )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:90:2: c= COLUMN r= INT
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo395); 
			cc.setColTo(c);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo402); 
			cc.setRowTo(r);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "moveTo"



	// $ANTLR start "enPassant"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:10: ( EP )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant411); 
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
	}
	// $ANTLR end "enPassant"



	// $ANTLR start "check"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:94:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:94:7: ( PLUS ( PLUS )? )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:94:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check420); 
			cc.setChecks();
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:95:3: ( PLUS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PLUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:95:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check427); 
					cc.setChecks();
					}
					break;

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
	}
	// $ANTLR end "check"



	// $ANTLR start "checkmate"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:11: ( HASH )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:97:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate442); 
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
	}
	// $ANTLR end "checkmate"



	// $ANTLR start "promotion"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:98:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:98:11: ( EQUALS p= PIECE )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:98:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion451); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion455); 
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
	}
	// $ANTLR end "promotion"



	// $ANTLR start "castleRule"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:100:2: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule469); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule473); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule478); 
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:2: ( MINUS CASTLE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MINUS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule483); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule485); 
					i = 2;
					}
					break;

			}

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
	}
	// $ANTLR end "castleRule"



	// $ANTLR start "startRule"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:108:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:109:5: ( ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:109:7: ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )*
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:109:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==TURN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:109:8: preamble NEWLINE preamble NEWLINE
					{
					pushFollow(FOLLOW_preamble_in_startRule509);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule511); 
					pushFollow(FOLLOW_preamble_in_startRule517);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule519); 
					}
					break;

			}

			cc.checkChessboard();
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:111:5: ( blackStartingTurn ( NEWLINE | EOF ) )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==INT) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==POINT) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==TAB) ) {
						int LA10_4 = input.LA(4);
						if ( (LA10_4==TAB) ) {
							alt10=1;
						}
					}
				}
			}
			switch (alt10) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:111:6: blackStartingTurn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_blackStartingTurn_in_startRule530);
					blackStartingTurn();
					state._fsp--;

					if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:112:5: ( turn ( NEWLINE | EOF ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:112:6: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule547);
					turn();
					state._fsp--;

					if ( input.LA(1)==EOF||input.LA(1)==NEWLINE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
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
	}
	// $ANTLR end "startRule"



	// $ANTLR start "turn"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:1: turn : turnNum POINT TAB move TAB move ;
	public final void turn() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:115:5: ( turnNum POINT TAB move TAB move )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:115:7: turnNum POINT TAB move TAB move
			{
			pushFollow(FOLLOW_turnNum_in_turn573);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn575); 
			match(input,TAB,FOLLOW_TAB_in_turn577); 
			pushFollow(FOLLOW_move_in_turn579);
			move();
			state._fsp--;

			match(input,TAB,FOLLOW_TAB_in_turn581); 
			pushFollow(FOLLOW_move_in_turn583);
			move();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "turn"



	// $ANTLR start "blackStartingTurn"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:117:1: blackStartingTurn : turnNum POINT TAB TAB move ;
	public final void blackStartingTurn() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:118:5: ( turnNum POINT TAB TAB move )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:118:7: turnNum POINT TAB TAB move
			{
			pushFollow(FOLLOW_turnNum_in_blackStartingTurn599);
			turnNum();
			state._fsp--;

			cc.checkCorrectStartingTurn();
			match(input,POINT,FOLLOW_POINT_in_blackStartingTurn603); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn605); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn607); 
			pushFollow(FOLLOW_move_in_blackStartingTurn609);
			move();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "blackStartingTurn"



	// $ANTLR start "move"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:120:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==COLUMN||LA15_0==PIECE) ) {
				alt15=1;
			}
			else if ( (LA15_0==CASTLE) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: ( moveFrom )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==PIECE) ) {
						alt12=1;
					}
					else if ( (LA12_0==COLUMN) ) {
						int LA12_2 = input.LA(2);
						if ( (LA12_2==TAKE) ) {
							alt12=1;
						}
					}
					switch (alt12) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move627);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move630);
					moveTo();
					state._fsp--;

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:26: ( enPassant | promotion )?
					int alt13=3;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EP) ) {
						alt13=1;
					}
					else if ( (LA13_0==EQUALS) ) {
						alt13=2;
					}
					switch (alt13) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move633);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move637);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:51: ( check | checkmate )?
					int alt14=3;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==PLUS) ) {
						alt14=1;
					}
					else if ( (LA14_0==HASH) ) {
						alt14=2;
					}
					switch (alt14) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:52: check
							{
							pushFollow(FOLLOW_check_in_move642);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move646);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move653);
					castleRule();
					state._fsp--;

					}
					break;

			}

			cc.processMove();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "move"

	// Delegated rules



	public static final BitSet FOLLOW_TURN_in_preamble240 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble245 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_in_preamble249 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble256 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble260 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble264 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_SC_in_preamble266 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble277 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble281 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble285 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom324 = new BitSet(new long[]{0x0000000000101842L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom332 = new BitSet(new long[]{0x0000000000101802L});
	public static final BitSet FOLLOW_INT_in_moveFrom342 = new BitSet(new long[]{0x0000000000101002L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom375 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo395 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_moveTo402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check420 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_PLUS_in_check427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion451 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_promotion455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule469 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MINUS_in_castleRule473 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule478 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_MINUS_in_castleRule483 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preamble_in_startRule509 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule511 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_preamble_in_startRule517 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule519 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_blackStartingTurn_in_startRule530 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_startRule531 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_turn_in_startRule547 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_startRule549 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_turnNum_in_turn573 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_turn575 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_turn577 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_turn579 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_turn581 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_turn583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_blackStartingTurn599 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_blackStartingTurn603 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn605 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn607 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_blackStartingTurn609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move627 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move630 = new BitSet(new long[]{0x0000000000010582L});
	public static final BitSet FOLLOW_enPassant_in_move633 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_promotion_in_move637 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_check_in_move642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move653 = new BitSet(new long[]{0x0000000000000002L});
}
