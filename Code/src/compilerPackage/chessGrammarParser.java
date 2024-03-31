// $ANTLR 3.5.1 C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-31 21:08:17

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
		"EQUALS", "HASH", "INT", "MINUS", "NEWLINE", "OPEN", "PIECE", "PLUS", 
		"POINT", "SC", "TAB", "TAKE", "TURN"
	};
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int CLOSE=5;
	public static final int COLUMN=6;
	public static final int EP=7;
	public static final int EQUALS=8;
	public static final int HASH=9;
	public static final int INT=10;
	public static final int MINUS=11;
	public static final int NEWLINE=12;
	public static final int OPEN=13;
	public static final int PIECE=14;
	public static final int PLUS=15;
	public static final int POINT=16;
	public static final int SC=17;
	public static final int TAB=18;
	public static final int TAKE=19;
	public static final int TURN=20;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g"; }


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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:64:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:65:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:66:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble232); 
			cc.setPrambleStartTurn(t);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble237); 
			match(input,OPEN,FOLLOW_OPEN_in_preamble241); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:69:2: (p= PIECE c= COLUMN r= INT SC )*
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:69:3: p= PIECE c= COLUMN r= INT SC
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble248); 
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble252); 
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble256); 
					match(input,SC,FOLLOW_SC_in_preamble258); 
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:2: (p1= PIECE c1= COLUMN r1= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:3: p1= PIECE c1= COLUMN r1= INT
			{
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble269); 
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble273); 
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble277); 
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_preamble284); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:74:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:74:9: (v= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:75:2: v= INT
			{
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum299); 

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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:80:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:80:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:81:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:81:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:81:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom316); 
					cc.setPiece(p);
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:2: (c= COLUMN )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom324); 
							cc.setColFrom(c);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:2: (r= INT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==INT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: r= INT
							{
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom334); 
							cc.setRowFrom(r);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: ( (t= TAKE |t= MINUS ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==MINUS||LA5_0==TAKE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: (t= TAKE |t= MINUS )
							{
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: (t= TAKE |t= MINUS )
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
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom345); 
									}
									break;
								case 2 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom351); 
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:2: ( (c= COLUMN t= TAKE ) )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:2: ( (c= COLUMN t= TAKE ) )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: (c= COLUMN t= TAKE )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: (c= COLUMN t= TAKE )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom367); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom371); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:88:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:88:8: (c= COLUMN r= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:89:2: c= COLUMN r= INT
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo387); 
			cc.setColTo(c);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo394); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:92:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:92:10: ( EP )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:92:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant403); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:93:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:93:7: ( PLUS ( PLUS )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:93:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check412); 
			cc.setChecks();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:94:3: ( PLUS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PLUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:94:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check419); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:11: ( HASH )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate434); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:97:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:97:11: ( EQUALS p= PIECE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:97:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion443); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion447); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:98:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:98:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:99:2: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule461); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule465); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule470); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:2: ( MINUS CASTLE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MINUS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule475); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule477); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:108:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:5: ( ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:7: ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )*
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==TURN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:8: preamble NEWLINE preamble NEWLINE
					{
					pushFollow(FOLLOW_preamble_in_startRule502);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule504); 
					pushFollow(FOLLOW_preamble_in_startRule510);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule512); 
					}
					break;

			}

			cc.checkChessboard();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:111:5: ( blackStartingTurn ( NEWLINE | EOF ) )?
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:111:6: blackStartingTurn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_blackStartingTurn_in_startRule523);
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

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:5: ( turn ( NEWLINE | EOF ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:6: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule540);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:114:1: turn : turnNum POINT TAB move TAB move ;
	public final void turn() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:115:5: ( turnNum POINT TAB move TAB move )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:115:7: turnNum POINT TAB move TAB move
			{
			pushFollow(FOLLOW_turnNum_in_turn566);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn568); 
			match(input,TAB,FOLLOW_TAB_in_turn570); 
			pushFollow(FOLLOW_move_in_turn572);
			move();
			state._fsp--;

			match(input,TAB,FOLLOW_TAB_in_turn574); 
			pushFollow(FOLLOW_move_in_turn576);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:117:1: blackStartingTurn : turnNum POINT TAB TAB move ;
	public final void blackStartingTurn() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:118:5: ( turnNum POINT TAB TAB move )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:118:7: turnNum POINT TAB TAB move
			{
			pushFollow(FOLLOW_turnNum_in_blackStartingTurn592);
			turnNum();
			state._fsp--;

			cc.checkCorrectStartingTurn();
			match(input,POINT,FOLLOW_POINT_in_blackStartingTurn596); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn598); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn600); 
			pushFollow(FOLLOW_move_in_blackStartingTurn602);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:120:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: ( moveFrom )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move620);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move623);
					moveTo();
					state._fsp--;

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:26: ( enPassant | promotion )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move626);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move630);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:51: ( check | checkmate )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:52: check
							{
							pushFollow(FOLLOW_check_in_move635);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move639);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:121:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move646);
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



	public static final BitSet FOLLOW_TURN_in_preamble232 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble237 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OPEN_in_preamble241 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble248 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble252 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble256 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_preamble258 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble269 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble273 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble277 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom316 = new BitSet(new long[]{0x0000000000080C42L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom324 = new BitSet(new long[]{0x0000000000080C02L});
	public static final BitSet FOLLOW_INT_in_moveFrom334 = new BitSet(new long[]{0x0000000000080802L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom367 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo387 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_moveTo394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check412 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PLUS_in_check419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion443 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_promotion447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule461 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MINUS_in_castleRule465 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule470 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_MINUS_in_castleRule475 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preamble_in_startRule502 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule504 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_preamble_in_startRule510 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule512 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_blackStartingTurn_in_startRule523 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_startRule524 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_turn_in_startRule540 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_startRule542 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_turnNum_in_turn566 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_turn568 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn570 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn572 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn574 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_blackStartingTurn592 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_blackStartingTurn596 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn598 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn600 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_blackStartingTurn602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move620 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move623 = new BitSet(new long[]{0x0000000000008382L});
	public static final BitSet FOLLOW_enPassant_in_move626 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_promotion_in_move630 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_check_in_move635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move646 = new BitSet(new long[]{0x0000000000000002L});
}
