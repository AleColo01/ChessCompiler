// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-05-01 11:48:04

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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:113:1: startRule : ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ( lastTurn EOF )? ;
	public final void startRule() throws RecognitionException {
		Token flag=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:5: ( ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ( lastTurn EOF )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:114:7: ( preamble NEWLINE preamble NEWLINE )? ( blackStartingTurn flag= ( NEWLINE | EOF ) )? ( turn ( NEWLINE | EOF ) )* ( lastTurn EOF )?
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
				alt11 = dfa11.predict(input);
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

			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:122:5: ( lastTurn EOF )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:122:6: lastTurn EOF
					{
					pushFollow(FOLLOW_lastTurn_in_startRule573);
					lastTurn();
					state._fsp--;

					match(input,EOF,FOLLOW_EOF_in_startRule575); 
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
	// $ANTLR end "startRule"



	// $ANTLR start "turn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:124:1: turn : turnNum POINT TAB move TAB move ;
	public final void turn() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:125:5: ( turnNum POINT TAB move TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:125:7: turnNum POINT TAB move TAB move
			{
			pushFollow(FOLLOW_turnNum_in_turn593);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_turn601); 
			match(input,TAB,FOLLOW_TAB_in_turn609); 
			pushFollow(FOLLOW_move_in_turn617);
			move();
			state._fsp--;

			cc.processMove();
			    		cc.nextTurn();
			match(input,TAB,FOLLOW_TAB_in_turn627); 
			pushFollow(FOLLOW_move_in_turn635);
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



	// $ANTLR start "lastTurn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:134:1: lastTurn : turnNum POINT TAB move ;
	public final void lastTurn() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:135:2: ( turnNum POINT TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:135:4: turnNum POINT TAB move
			{
			pushFollow(FOLLOW_turnNum_in_lastTurn650);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_lastTurn659); 
			match(input,TAB,FOLLOW_TAB_in_lastTurn668); 
			pushFollow(FOLLOW_move_in_lastTurn677);
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
	// $ANTLR end "lastTurn"



	// $ANTLR start "blackStartingTurn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:142:1: blackStartingTurn : turnNum POINT TAB TAB move ;
	public final void blackStartingTurn() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:143:5: ( turnNum POINT TAB TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:143:7: turnNum POINT TAB TAB move
			{
			pushFollow(FOLLOW_turnNum_in_blackStartingTurn699);
			turnNum();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_blackStartingTurn707); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn715); 
			match(input,TAB,FOLLOW_TAB_in_blackStartingTurn723); 
			pushFollow(FOLLOW_move_in_blackStartingTurn731);
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:149:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:9: ( moveFrom )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:150:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move751);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move761);
					moveTo();
					state._fsp--;

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:152:7: ( enPassant | promotion )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:152:8: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move771);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:152:20: promotion
							{
							pushFollow(FOLLOW_promotion_in_move775);
							promotion();
							state._fsp--;

							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:153:7: ( check | checkmate )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:153:8: check
							{
							pushFollow(FOLLOW_check_in_move787);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:153:16: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move791);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:154:8: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move804);
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


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\u022d\uffff";
	static final String DFA11_eofS =
		"\1\2\14\uffff\1\2\1\uffff\1\2\11\uffff\1\2\1\uffff\2\2\2\uffff\1\2\3\uffff"+
		"\1\2\1\uffff\2\2\4\uffff\1\2\2\uffff\6\2\2\uffff\2\2\11\uffff\3\2\2\uffff"+
		"\2\2\4\uffff\3\2\1\uffff\2\2\2\uffff\3\2\1\uffff\2\2\2\uffff\1\2\1\uffff"+
		"\2\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\4\uffff"+
		"\2\2\4\uffff\4\2\1\uffff\2\2\2\uffff\1\2\4\uffff\2\2\4\uffff\1\2\1\uffff"+
		"\2\2\2\uffff\1\2\1\uffff\2\2\2\uffff\2\2\2\uffff\2\2\4\uffff\1\2\1\uffff"+
		"\2\2\2\uffff\1\2\1\uffff\2\2\2\uffff\2\2\2\uffff\2\2\4\uffff\2\2\2\uffff"+
		"\2\2\4\uffff\2\2\2\uffff\2\2\4\uffff\2\2\2\uffff\2\2\6\uffff\1\2\6\uffff"+
		"\1\2\1\uffff\2\2\2\uffff\1\2\1\uffff\2\2\2\uffff\2\2\2\uffff\2\2\6\uffff"+
		"\1\2\4\uffff\2\2\2\uffff\2\2\4\uffff\2\2\2\uffff\2\2\4\uffff\1\2\4\uffff"+
		"\2\2\4\uffff\2\2\2\uffff\2\2\4\uffff\2\2\2\uffff\2\2\4\uffff\1\2\4\uffff"+
		"\2\2\4\uffff\1\2\4\uffff\2\2\4\uffff\1\2\4\uffff\2\2\4\uffff\1\2\4\uffff"+
		"\2\2\6\uffff\2\2\2\uffff\2\2\4\uffff\2\2\2\uffff\2\2\4\uffff\1\2\4\uffff"+
		"\2\2\6\uffff\1\2\4\uffff\2\2\4\uffff\1\2\4\uffff\2\2\6\uffff\1\2\4\uffff"+
		"\1\2\4\uffff\2\2\4\uffff\1\2\4\uffff\2\2\6\uffff\1\2\6\uffff\1\2\6\uffff"+
		"\1\2\6\uffff\1\2\4\uffff\1\2\4\uffff\2\2\4\uffff\1\2\4\uffff\2\2\6\uffff"+
		"\1\2\6\uffff\1\2\6\uffff\1\2\10\uffff\1\2\6\uffff\1\2\16\uffff\1\2\6\uffff"+
		"\1\2\22\uffff";
	static final String DFA11_minS =
		"\1\12\1\20\1\uffff\1\22\1\4\1\6\1\12\1\13\5\6\1\7\1\4\3\6\1\12\2\6\4\12"+
		"\1\11\1\16\1\17\1\22\2\uffff\1\13\2\6\1\12\1\11\1\16\1\17\1\22\2\uffff"+
		"\2\12\1\7\2\12\4\7\1\17\1\22\2\uffff\1\11\1\22\4\uffff\1\4\2\uffff\2\12"+
		"\1\7\1\17\1\22\2\uffff\1\11\1\22\4\uffff\2\7\1\11\1\16\1\17\1\22\2\uffff"+
		"\2\7\1\11\1\16\1\17\1\22\2\uffff\1\11\1\16\1\17\1\22\2\uffff\1\11\1\16"+
		"\1\17\1\22\2\uffff\1\11\1\16\1\17\1\22\2\uffff\1\22\4\uffff\1\17\1\22"+
		"\4\uffff\1\22\2\7\1\11\1\16\1\17\1\22\2\uffff\1\22\4\uffff\1\17\1\22\4"+
		"\uffff\1\11\1\16\1\17\1\22\2\uffff\1\11\1\16\1\17\1\22\2\uffff\1\17\1"+
		"\22\2\uffff\1\11\1\22\4\uffff\1\11\1\16\1\17\1\22\2\uffff\1\11\1\16\1"+
		"\17\1\22\2\uffff\1\17\1\22\2\uffff\1\11\1\22\4\uffff\1\17\1\22\2\uffff"+
		"\1\11\1\22\4\uffff\1\17\1\22\2\uffff\1\11\1\22\4\uffff\1\17\1\22\2\uffff"+
		"\1\11\1\22\6\uffff\1\22\6\uffff\1\11\1\16\1\17\1\22\2\uffff\1\11\1\16"+
		"\1\17\1\22\2\uffff\1\17\1\22\2\uffff\1\11\1\22\6\uffff\1\22\4\uffff\1"+
		"\17\1\22\2\uffff\1\11\1\22\4\uffff\1\17\1\22\2\uffff\1\11\1\22\4\uffff"+
		"\1\22\4\uffff\1\17\1\22\4\uffff\1\17\1\22\2\uffff\1\11\1\22\4\uffff\1"+
		"\17\1\22\2\uffff\1\11\1\22\4\uffff\1\22\4\uffff\1\17\1\22\4\uffff\1\22"+
		"\4\uffff\1\17\1\22\4\uffff\1\22\4\uffff\1\17\1\22\4\uffff\1\22\4\uffff"+
		"\1\17\1\22\6\uffff\1\17\1\22\2\uffff\1\11\1\22\4\uffff\1\17\1\22\2\uffff"+
		"\1\11\1\22\4\uffff\1\22\4\uffff\1\17\1\22\6\uffff\1\22\4\uffff\1\17\1"+
		"\22\4\uffff\1\22\4\uffff\1\17\1\22\6\uffff\1\22\4\uffff\1\22\4\uffff\1"+
		"\17\1\22\4\uffff\1\22\4\uffff\1\17\1\22\6\uffff\1\22\6\uffff\1\22\6\uffff"+
		"\1\22\6\uffff\1\22\4\uffff\1\22\4\uffff\1\17\1\22\4\uffff\1\22\4\uffff"+
		"\1\17\1\22\6\uffff\1\22\6\uffff\1\22\6\uffff\1\22\10\uffff\1\22\6\uffff"+
		"\1\22\16\uffff\1\22\6\uffff\1\22\22\uffff";
	static final String DFA11_maxS =
		"\1\12\1\20\1\uffff\1\22\1\16\2\23\1\13\2\23\3\6\1\22\1\4\1\23\2\6\1\12"+
		"\2\6\4\12\1\22\1\16\2\22\2\uffff\1\22\2\6\1\12\1\22\1\16\2\22\2\uffff"+
		"\2\12\1\22\2\12\6\22\2\uffff\2\22\4\uffff\1\4\2\uffff\2\12\3\22\2\uffff"+
		"\2\22\4\uffff\3\22\1\16\2\22\2\uffff\3\22\1\16\2\22\2\uffff\1\22\1\16"+
		"\2\22\2\uffff\1\22\1\16\2\22\2\uffff\1\22\1\16\2\22\2\uffff\1\22\4\uffff"+
		"\2\22\4\uffff\4\22\1\16\2\22\2\uffff\1\22\4\uffff\2\22\4\uffff\1\22\1"+
		"\16\2\22\2\uffff\1\22\1\16\2\22\2\uffff\2\22\2\uffff\2\22\4\uffff\1\22"+
		"\1\16\2\22\2\uffff\1\22\1\16\2\22\2\uffff\2\22\2\uffff\2\22\4\uffff\2"+
		"\22\2\uffff\2\22\4\uffff\2\22\2\uffff\2\22\4\uffff\2\22\2\uffff\2\22\6"+
		"\uffff\1\22\6\uffff\1\22\1\16\2\22\2\uffff\1\22\1\16\2\22\2\uffff\2\22"+
		"\2\uffff\2\22\6\uffff\1\22\4\uffff\2\22\2\uffff\2\22\4\uffff\2\22\2\uffff"+
		"\2\22\4\uffff\1\22\4\uffff\2\22\4\uffff\2\22\2\uffff\2\22\4\uffff\2\22"+
		"\2\uffff\2\22\4\uffff\1\22\4\uffff\2\22\4\uffff\1\22\4\uffff\2\22\4\uffff"+
		"\1\22\4\uffff\2\22\4\uffff\1\22\4\uffff\2\22\6\uffff\2\22\2\uffff\2\22"+
		"\4\uffff\2\22\2\uffff\2\22\4\uffff\1\22\4\uffff\2\22\6\uffff\1\22\4\uffff"+
		"\2\22\4\uffff\1\22\4\uffff\2\22\6\uffff\1\22\4\uffff\1\22\4\uffff\2\22"+
		"\4\uffff\1\22\4\uffff\2\22\6\uffff\1\22\6\uffff\1\22\6\uffff\1\22\6\uffff"+
		"\1\22\4\uffff\1\22\4\uffff\2\22\4\uffff\1\22\4\uffff\2\22\6\uffff\1\22"+
		"\6\uffff\1\22\6\uffff\1\22\10\uffff\1\22\6\uffff\1\22\16\uffff\1\22\6"+
		"\uffff\1\22\22\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\33\uffff\1\1\u020e\uffff";
	static final String DFA11_specialS =
		"\u022d\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1",
			"\1\3",
			"",
			"\1\4",
			"\1\7\1\uffff\1\6\7\uffff\1\5",
			"\1\10\3\uffff\1\11\1\13\7\uffff\1\12",
			"\1\15\10\uffff\1\14",
			"\1\16",
			"\1\22\3\uffff\1\17\1\21\7\uffff\1\20",
			"\1\25\4\uffff\1\24\7\uffff\1\23",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31\1\32\1\34\5\uffff\1\33\2\uffff\1\36",
			"\1\37",
			"\1\42\1\43\1\44\1\46\1\uffff\1\41\3\uffff\1\45\2\uffff\1\36\1\40",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\63\5\uffff\1\62\2\uffff\1\36",
			"\1\66",
			"\1\67\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\74\6\uffff\1\36",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\103\5\uffff\1\102\2\uffff\1\36",
			"\1\106",
			"\1\107\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\114",
			"\1\115",
			"\1\116\1\117\1\121\5\uffff\1\120\2\uffff\1\36",
			"\1\124",
			"\1\125",
			"\1\126\1\127\1\131\5\uffff\1\130\2\uffff\1\36",
			"\1\134\1\135\1\137\5\uffff\1\136\2\uffff\1\36",
			"\1\142\1\143\1\145\5\uffff\1\144\2\uffff\1\36",
			"\1\150\1\151\1\153\5\uffff\1\152\2\uffff\1\36",
			"\1\156\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\164\5\uffff\1\163\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\171",
			"",
			"",
			"\1\172",
			"\1\173",
			"\1\174\1\175\1\177\5\uffff\1\176\2\uffff\1\36",
			"\1\u0082\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0088\5\uffff\1\u0087\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u008d\1\u008e\1\u0090\5\uffff\1\u008f\2\uffff\1\36",
			"\1\u0093\1\u0094\1\u0096\5\uffff\1\u0095\2\uffff\1\36",
			"\1\u009a\5\uffff\1\u0099\2\uffff\1\36",
			"\1\u009d",
			"\1\u009e\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u00a3\1\u00a4\1\u00a6\5\uffff\1\u00a5\2\uffff\1\36",
			"\1\u00a9\1\u00aa\1\u00ac\5\uffff\1\u00ab\2\uffff\1\36",
			"\1\u00b0\5\uffff\1\u00af\2\uffff\1\36",
			"\1\u00b3",
			"\1\u00b4\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u00ba\5\uffff\1\u00b9\2\uffff\1\36",
			"\1\u00bd",
			"\1\u00be\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u00c4\5\uffff\1\u00c3\2\uffff\1\36",
			"\1\u00c7",
			"\1\u00c8\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u00ce\5\uffff\1\u00cd\2\uffff\1\36",
			"\1\u00d1",
			"\1\u00d2\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u00d9\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"\1\u00e0\1\u00e1\1\u00e3\5\uffff\1\u00e2\2\uffff\1\36",
			"\1\u00e6\1\u00e7\1\u00e9\5\uffff\1\u00e8\2\uffff\1\36",
			"\1\u00ed\5\uffff\1\u00ec\2\uffff\1\36",
			"\1\u00f0",
			"\1\u00f1\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u00f8\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u00fe\5\uffff\1\u00fd\2\uffff\1\36",
			"\1\u0101",
			"\1\u0102\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0108\5\uffff\1\u0107\2\uffff\1\36",
			"\1\u010b",
			"\1\u010c\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0111\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0117\5\uffff\1\u0116\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u011d\5\uffff\1\u011c\2\uffff\1\36",
			"\1\u0120",
			"\1\u0121\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0127\5\uffff\1\u0126\2\uffff\1\36",
			"\1\u012a",
			"\1\u012b\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0130\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0136\5\uffff\1\u0135\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u013b\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0141\5\uffff\1\u0140\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u0146\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u014c\5\uffff\1\u014b\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u0151\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0157\5\uffff\1\u0156\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u015f\5\uffff\1\u015e\2\uffff\1\36",
			"\1\u0162",
			"\1\u0163\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0169\5\uffff\1\u0168\2\uffff\1\36",
			"\1\u016c",
			"\1\u016d\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0172\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0178\5\uffff\1\u0177\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u017f\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0185\5\uffff\1\u0184\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u018a\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u0190\5\uffff\1\u018f\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u0197\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u019c\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u01a2\5\uffff\1\u01a1\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01a7\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u01ad\5\uffff\1\u01ac\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01b4\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01bb\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01c2\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01c9\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u01ce\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u01d4\5\uffff\1\u01d3\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01d9\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"\1\u01df\5\uffff\1\u01de\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01e6\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01ed\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01f4\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u01fd\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u0204\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u0213\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"\1\u021a\2\uffff\1\36",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 121:5: ( turn ( NEWLINE | EOF ) )*";
		}
	}

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
	public static final BitSet FOLLOW_lastTurn_in_startRule573 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_startRule575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_turn593 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_turn601 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn609 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn617 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_turn627 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_turn635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_lastTurn650 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_lastTurn659 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_lastTurn668 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_lastTurn677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turnNum_in_blackStartingTurn699 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_POINT_in_blackStartingTurn707 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn715 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAB_in_blackStartingTurn723 = new BitSet(new long[]{0x0000000000004050L});
	public static final BitSet FOLLOW_move_in_blackStartingTurn731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move751 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_moveTo_in_move761 = new BitSet(new long[]{0x0000000000008382L});
	public static final BitSet FOLLOW_enPassant_in_move771 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_promotion_in_move775 = new BitSet(new long[]{0x0000000000008202L});
	public static final BitSet FOLLOW_check_in_move787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move804 = new BitSet(new long[]{0x0000000000000002L});
}
