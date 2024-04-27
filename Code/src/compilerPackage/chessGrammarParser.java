// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-04-27 15:12:13

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




	// $ANTLR start "preamble"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:1: preamble : t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE ;
	public final void preamble() throws RecognitionException {
		Token t=null;
		Token p=null;
		Token c=null;
		Token r=null;
		Token p1=null;
		Token c1=null;
		Token r1=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:63:2: (t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:64:2: t= TURN EQUALS OPEN (p= PIECE c= COLUMN r= INT SC )* (p1= PIECE c1= COLUMN r1= INT ) CLOSE
			{
			t=(Token)match(input,TURN,FOLLOW_TURN_in_preamble233); 
			cc.setPrambleStartTurn(t);
			match(input,EQUALS,FOLLOW_EQUALS_in_preamble238); 
			match(input,OPEN,FOLLOW_OPEN_in_preamble242); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:2: (p= PIECE c= COLUMN r= INT SC )*
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:3: p= PIECE c= COLUMN r= INT SC
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble249); 
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble253); 
					r=(Token)match(input,INT,FOLLOW_INT_in_preamble257); 
					match(input,SC,FOLLOW_SC_in_preamble259); 
					cc.checkPreamblePlacement(p,t,r,c);
					}
					break;

				default :
					break loop1;
				}
			}

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:2: (p1= PIECE c1= COLUMN r1= INT )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:3: p1= PIECE c1= COLUMN r1= INT
			{
			p1=(Token)match(input,PIECE,FOLLOW_PIECE_in_preamble270); 
			c1=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_preamble274); 
			r1=(Token)match(input,INT,FOLLOW_INT_in_preamble278); 
			cc.checkPreamblePlacement(p1,t,r1,c1);
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_preamble285); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:1: turnNum : v= INT ;
	public final void turnNum() throws RecognitionException {
		Token v=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:9: (v= INT )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:73:2: v= INT
			{
			v=(Token)match(input,INT,FOLLOW_INT_in_turnNum300); 

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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:79:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:79:10: ( (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:80:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:80:2: (p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:80:3: p= PIECE (c= COLUMN )? (r= INT )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom319); 
					cc.setPiece(p);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:81:2: (c= COLUMN )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:81:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom327); 
							cc.setColFrom(c);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:82:2: (r= INT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==INT) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:82:3: r= INT
							{
							r=(Token)match(input,INT,FOLLOW_INT_in_moveFrom337); 
							cc.setRowFrom(r);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:2: ( (t= TAKE |t= MINUS ) )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==MINUS||LA5_0==TAKE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: (t= TAKE |t= MINUS )
							{
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:3: (t= TAKE |t= MINUS )
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
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom348); 
									}
									break;
								case 2 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:83:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom354); 
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: ( (c= COLUMN t= TAKE ) )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:2: ( (c= COLUMN t= TAKE ) )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: (c= COLUMN t= TAKE )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:3: (c= COLUMN t= TAKE )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:84:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom370); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom374); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:1: moveTo : c= COLUMN r= INT ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:87:8: (c= COLUMN r= INT )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:88:2: c= COLUMN r= INT
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo390); 
			cc.setColTo(c);
			r=(Token)match(input,INT,FOLLOW_INT_in_moveTo397); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:10: ( EP )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:93:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant407); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:95:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:95:7: ( PLUS ( PLUS )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:95:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check417); 
			cc.setChecks();
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:96:3: ( PLUS )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PLUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:96:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check424); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:11: ( HASH )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:99:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate443); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:101:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:101:11: ( EQUALS p= PIECE )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:101:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion453); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion457); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:1: castleRule : t= CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		Token t=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:103:11: (t= CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:104:2: t= CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			t=(Token)match(input,CASTLE,FOLLOW_CASTLE_in_castleRule474); 
			cc.setLastToken(t);
			match(input,MINUS,FOLLOW_MINUS_in_castleRule480); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule485); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:107:2: ( MINUS CASTLE )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==MINUS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:107:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule490); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule492); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:113:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		Token flag=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:5: ( ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:7: ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )*
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:7: ( preamble NEWLINE preamble NEWLINE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==TURN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:8: preamble NEWLINE preamble NEWLINE
					{
					pushFollow(FOLLOW_preamble_in_startRule517);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule519); 
					pushFollow(FOLLOW_preamble_in_startRule521);
					preamble();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule523); 
					}
					break;

			}

			cc.checkChessboard();
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:115:5: ( blackStartingTurn flag= ( NEWLINE | EOF ) )?
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:115:6: blackStartingTurn flag= ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_blackStartingTurn_in_startRule534);
					blackStartingTurn();
					state._fsp--;

					flag=input.LT(1);
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

			cc.checkCorrectStartingTurn();
				    					if(flag != null){
				    					    	cc.processMove();
				    					 	cc.nextTurn();
				    					}		
									
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:5: ( turn ( NEWLINE | EOF ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:121:6: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule555);
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:123:1: turn : turnNum POINT TAB move TAB move ;
	public final void turn() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:124:5: ( turnNum POINT TAB move TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:124:7: turnNum POINT TAB move TAB move
			{
			pushFollow(FOLLOW_turnNum_in_turn582);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn590); 
			match(input,TAB,FOLLOW_TAB_in_turn598); 
			pushFollow(FOLLOW_move_in_turn606);
			move();
			state._fsp--;

			cc.processMove();
			    		cc.nextTurn();
			match(input,TAB,FOLLOW_TAB_in_turn616); 
			pushFollow(FOLLOW_move_in_turn624);
			move();
			state._fsp--;

			cc.processMove();
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



	// $ANTLR start "blackStartingTurn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:133:1: blackStartingTurn : turnNum POINT TAB TAB move ;
	public final void blackStartingTurn() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:134:5: ( turnNum POINT TAB TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:134:7: turnNum POINT TAB TAB move
			{
			pushFollow(FOLLOW_turnNum_in_blackStartingTurn642);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_blackStartingTurn650); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn658); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn666); 
			pushFollow(FOLLOW_move_in_blackStartingTurn674);
			move();
			state._fsp--;

			cc.setBlackStarting();
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:140:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:9: ( moveFrom )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:141:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move694);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move704);
					moveTo();
					state._fsp--;

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:143:7: ( enPassant | promotion )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:143:8: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move714);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:143:20: promotion
							{
							pushFollow(FOLLOW_promotion_in_move718);
							promotion();
							state._fsp--;

							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:144:7: ( check | checkmate )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:144:8: check
							{
							pushFollow(FOLLOW_check_in_move730);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:144:16: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move734);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:145:8: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move747);
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



	public static final BitSet FOLLOW_TURN_in_preamble233 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQUALS_in_preamble238 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_OPEN_in_preamble242 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble249 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble253 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble257 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SC_in_preamble259 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_preamble270 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COLUMN_in_preamble274 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_preamble278 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CLOSE_in_preamble285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_turnNum300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom319 = new BitSet(new long[]{0x0000000000080C42L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom327 = new BitSet(new long[]{0x0000000000080C02L});
	public static final BitSet FOLLOW_INT_in_moveFrom337 = new BitSet(new long[]{0x0000000000080802L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom370 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo390 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INT_in_moveTo397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check417 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PLUS_in_check424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion453 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_PIECE_in_promotion457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule474 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_MINUS_in_castleRule480 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule485 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_MINUS_in_castleRule490 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_preamble_in_startRule517 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule519 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_preamble_in_startRule521 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule523 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_blackStartingTurn_in_startRule534 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_startRule538 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_turn_in_startRule555 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_startRule557 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_turnNum_in_turn582 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_turn590 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn598 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn606 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn616 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_blackStartingTurn642 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_blackStartingTurn650 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn658 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn666 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_blackStartingTurn674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move694 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move704 = new BitSet(new long[]{0x0000000000008382L});
	public static final BitSet FOLLOW_enPassant_in_move714 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_promotion_in_move718 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_check_in_move730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move747 = new BitSet(new long[]{0x0000000000000002L});
}
