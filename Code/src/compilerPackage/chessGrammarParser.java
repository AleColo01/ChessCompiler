// $ANTLR 3.5.1 C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g 2024-05-06 17:36:34

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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:60:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:61:5: ( ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )* )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:61:7: ( preamble NEWLINE preamble NEWLINE )? ( turn ( NEWLINE | EOF ) )*
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:61:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TURN) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:61:8: preamble NEWLINE preamble NEWLINE
					{
					pushFollow(FOLLOW_preamble_in_startRule233);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule235); 
					pushFollow(FOLLOW_preamble_in_startRule237);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule239); 
					}
					break;

			}

			cc.checkChessboard();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:62:5: ( turn ( NEWLINE | EOF ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:62:6: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule250);
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
					cc.checkCorrectStartingTurn();
					}
					break;

				default :
					break loop2;
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



	// $ANTLR start "preamble"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:65:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:66:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble283); 
			cc.setPrambleStartTurn(t);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble288); 
			match(input,OPEN,FOLLOW_OPEN_in_preamble292); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:2: (p= PIECE c= COLUMN r= INT SC )*
			loop3:
			while (true) {
				int alt3=2;
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

				switch (alt3) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:3: p= PIECE c= COLUMN r= INT SC
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble299); 
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble303); 
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble307); 
					match(input,SC,FOLLOW_SC_in_preamble309); 
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:2: (p1= PIECE c1= COLUMN r1= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:3: p1= PIECE c1= COLUMN r1= INT
			{
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble320); 
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble324); 
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble328); 
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_preamble335); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:75:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:75:9: (v= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:76:2: v= INT
			{
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum350); 

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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
			int alt8=2;
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
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom369); 
					cc.setPiece(p);
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: (c= COLUMN )?
					int alt4=2;
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
					switch (alt4) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom377); 
							cc.setColFrom(c);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:2: (r= INT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:85:3: r= INT
							{
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom387); 
							cc.setRowFrom(r);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:2: ( (t= TAKE |t= MINUS ) )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==MINUS||LA7_0==TAKE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:3: (t= TAKE |t= MINUS )
							{
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:3: (t= TAKE |t= MINUS )
							int alt6=2;
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
								throw nvae;
							}

							switch (alt6) {
								case 1 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom398); 
									}
									break;
								case 2 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom404); 
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:87:2: ( (c= COLUMN t= TAKE ) )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:87:2: ( (c= COLUMN t= TAKE ) )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:87:3: (c= COLUMN t= TAKE )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:87:3: (c= COLUMN t= TAKE )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:87:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom420); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom424); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:90:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:90:8: (c= COLUMN r= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:91:2: c= COLUMN r= INT
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo440); 
			cc.setColTo(c);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo447); 
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
	}
	// $ANTLR end "moveTo"



	// $ANTLR start "enPassant"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:10: ( EP )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:96:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant457); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:98:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:98:7: ( PLUS ( PLUS )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:98:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check467); 
			cc.setChecks();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:99:3: ( PLUS )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PLUS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:99:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check474); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:11: ( HASH )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate493); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:104:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:104:11: ( EQUALS p= PIECE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:104:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion503); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion507); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:106:1: castleRule : t= CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:106:11: (t= CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:107:2: t= CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			t=(Token)match(input,CASTLE,FOLLOW_CASTLE_in_castleRule524); 
			cc.setLastToken(t);
			match(input,MINUS,FOLLOW_MINUS_in_castleRule530); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule535); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:110:2: ( MINUS CASTLE )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==MINUS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:110:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule540); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule542); 
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



	// $ANTLR start "turn"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:114:1: turn : turnNum POINT TAB ( move )? ( TAB move )? ;
	public final void turn() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:115:5: ( turnNum POINT TAB ( move )? ( TAB move )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:115:7: turnNum POINT TAB ( move )? ( TAB move )?
			{
			pushFollow(FOLLOW_turnNum_in_turn567);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn575); 
			match(input,TAB,FOLLOW_TAB_in_turn583); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:118:6: ( move )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==CASTLE||LA11_0==COLUMN||LA11_0==PIECE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:118:7: move
					{
					pushFollow(FOLLOW_move_in_turn592);
					move();
					state._fsp--;

					cc.processMove();
					}
					break;

			}

			cc.nextTurn();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:120:6: ( TAB move )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==TAB) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:120:7: TAB move
					{
					match(input,TAB,FOLLOW_TAB_in_turn612); 
					pushFollow(FOLLOW_move_in_turn620);
					move();
					state._fsp--;

					cc.processMove();
					}
					break;

			}

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
	}
	// $ANTLR end "turn"



	// $ANTLR start "move"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:124:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			int alt16=2;
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
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:9: ( moveFrom )?
					int alt13=2;
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
					switch (alt13) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:125:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move646);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move656);
					moveTo();
					state._fsp--;

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:127:7: ( enPassant | promotion )?
					int alt14=3;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==EP) ) {
						alt14=1;
					}
					else if ( (LA14_0==EQUALS) ) {
						alt14=2;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:127:8: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move666);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:127:20: promotion
							{
							pushFollow(FOLLOW_promotion_in_move670);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:128:7: ( check | checkmate )?
					int alt15=3;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==PLUS) ) {
						alt15=1;
					}
					else if ( (LA15_0==HASH) ) {
						alt15=2;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:128:8: check
							{
							pushFollow(FOLLOW_check_in_move682);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:128:16: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move686);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:129:8: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move699);
					castleRule();
					state._fsp--;

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
	// $ANTLR end "move"

	// Delegated rules



	public static final BitSet FOLLOW_preamble_in_startRule233 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule235 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_preamble_in_startRule237 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule239 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_turn_in_startRule250 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_startRule252 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_TURN_in_preamble283 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble288 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OPEN_in_preamble292 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble299 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble303 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble307 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_preamble309 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble320 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble324 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble328 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom369 = new BitSet(new long[]{0x0000000000080C42L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom377 = new BitSet(new long[]{0x0000000000080C02L});
	public static final BitSet FOLLOW_INT_in_moveFrom387 = new BitSet(new long[]{0x0000000000080802L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom420 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo440 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_moveTo447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check467 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PLUS_in_check474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion503 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_promotion507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule524 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MINUS_in_castleRule530 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule535 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_MINUS_in_castleRule540 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_turn567 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_turn575 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn583 = new BitSet(new long[]{0x0000000000044052L});
	public static final BitSet FOLLOW_move_in_turn592 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_TAB_in_turn612 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move646 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move656 = new BitSet(new long[]{0x0000000000008382L});
	public static final BitSet FOLLOW_enPassant_in_move666 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_promotion_in_move670 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_check_in_move682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move699 = new BitSet(new long[]{0x0000000000000002L});
}
