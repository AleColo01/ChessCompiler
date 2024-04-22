// $ANTLR 3.5.1 C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g 2024-04-22 17:41:31

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
		



	// $ANTLR start "preamble"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:51:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble241); 
			cc.setPrambleStartTurn(t);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble246); 
			match(input,OPEN,FOLLOW_OPEN_in_preamble250); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:2: (p= PIECE c= COLUMN r= INT SC )*
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:3: p= PIECE c= COLUMN r= INT SC
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble257); 
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble261); 
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble265); 
					match(input,SC,FOLLOW_SC_in_preamble267); 
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:55:2: (p1= PIECE c1= COLUMN r1= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:55:3: p1= PIECE c1= COLUMN r1= INT
			{
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble278); 
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble282); 
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble286); 
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_preamble293); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:59:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:59:9: (v= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:60:2: v= INT
			{
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum308); 

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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:66:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:66:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:67:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom327); 
					cc.setPiece(p);
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:68:2: (c= COLUMN )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:68:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom335); 
							cc.setColFrom(c);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:69:2: (r= INT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==INT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:69:3: r= INT
							{
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom345); 
							cc.setRowFrom(r);
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:2: ( (t= TAKE |t= MINUS ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==MINUS||LA5_0==TAKE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:3: (t= TAKE |t= MINUS )
							{
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:3: (t= TAKE |t= MINUS )
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
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom356); 
									}
									break;
								case 2 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:70:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom362); 
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:2: ( (c= COLUMN t= TAKE ) )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:2: ( (c= COLUMN t= TAKE ) )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:3: (c= COLUMN t= TAKE )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:3: (c= COLUMN t= TAKE )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:71:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom378); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom382); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:74:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:74:8: (c= COLUMN r= INT )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:75:2: c= COLUMN r= INT
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo398); 
			cc.setColTo(c);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo405); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:80:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:80:10: ( EP )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:80:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant415); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:7: ( PLUS ( PLUS )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:82:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check425); 
			cc.setChecks();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: ( PLUS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PLUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:83:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check432); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:11: ( HASH )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:86:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate451); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:88:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:88:11: ( EQUALS p= PIECE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:88:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion461); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion465); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:90:1: castleRule : t= CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		Token t=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:90:11: (t= CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:91:2: t= CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			t=(Token)match(input,CASTLE,FOLLOW_CASTLE_in_castleRule482); 
			cc.setLastToken(t);
			match(input,MINUS,FOLLOW_MINUS_in_castleRule488); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule493); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:94:2: ( MINUS CASTLE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MINUS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:94:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule498); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule500); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:100:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:101:5: ( ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:101:7: ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )*
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:101:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==TURN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:101:8: preamble NEWLINE preamble NEWLINE
					{
					pushFollow(FOLLOW_preamble_in_startRule525);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule527); 
					pushFollow(FOLLOW_preamble_in_startRule529);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule531); 
					}
					break;

			}

			cc.checkChessboard();
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:5: ( blackStartingTurn ( NEWLINE | EOF ) )?
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:102:6: blackStartingTurn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_blackStartingTurn_in_startRule542);
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

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:103:5: ( turn ( NEWLINE | EOF ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:103:6: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule559);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:105:1: turn : turnNum POINT TAB move TAB move ;
	public final void turn() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:106:5: ( turnNum POINT TAB move TAB move )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:106:7: turnNum POINT TAB move TAB move
			{
			pushFollow(FOLLOW_turnNum_in_turn585);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn587); 
			match(input,TAB,FOLLOW_TAB_in_turn589); 
			pushFollow(FOLLOW_move_in_turn591);
			move();
			state._fsp--;

			match(input,TAB,FOLLOW_TAB_in_turn593); 
			pushFollow(FOLLOW_move_in_turn595);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:108:1: blackStartingTurn : turnNum POINT TAB TAB move ;
	public final void blackStartingTurn() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:5: ( turnNum POINT TAB TAB move )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:109:7: turnNum POINT TAB TAB move
			{
			pushFollow(FOLLOW_turnNum_in_blackStartingTurn611);
			turnNum();
			state._fsp--;

			cc.checkCorrectStartingTurn();
			match(input,POINT,FOLLOW_POINT_in_blackStartingTurn615); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn617); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn619); 
			pushFollow(FOLLOW_move_in_blackStartingTurn621);
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:111:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:9: ( moveFrom )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move639);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move642);
					moveTo();
					state._fsp--;

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:26: ( enPassant | promotion )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move645);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move649);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:51: ( check | checkmate )?
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
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:52: check
							{
							pushFollow(FOLLOW_check_in_move654);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move658);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:112:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move665);
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



	public static final BitSet FOLLOW_TURN_in_preamble241 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble246 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_OPEN_in_preamble250 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble257 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble261 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble265 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_SC_in_preamble267 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_preamble278 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble282 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_preamble286 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom327 = new BitSet(new long[]{0x0000000000101842L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom335 = new BitSet(new long[]{0x0000000000101802L});
	public static final BitSet FOLLOW_INT_in_moveFrom345 = new BitSet(new long[]{0x0000000000101002L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom378 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo398 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_INT_in_moveTo405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check425 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_PLUS_in_check432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion461 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_PIECE_in_promotion465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule482 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MINUS_in_castleRule488 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule493 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_MINUS_in_castleRule498 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preamble_in_startRule525 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule527 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_preamble_in_startRule529 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule531 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_blackStartingTurn_in_startRule542 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_startRule543 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_turn_in_startRule559 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_startRule561 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_turnNum_in_turn585 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_turn587 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_turn589 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_turn591 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_turn593 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_turn595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_blackStartingTurn611 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_blackStartingTurn615 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn617 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn619 = new BitSet(new long[]{0x0000000000008050L});
	public static final BitSet FOLLOW_move_in_blackStartingTurn621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move639 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move642 = new BitSet(new long[]{0x0000000000010582L});
	public static final BitSet FOLLOW_enPassant_in_move645 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_promotion_in_move649 = new BitSet(new long[]{0x0000000000010402L});
	public static final BitSet FOLLOW_check_in_move654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move665 = new BitSet(new long[]{0x0000000000000002L});
}
