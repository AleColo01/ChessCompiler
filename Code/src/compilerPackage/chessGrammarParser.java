// $ANTLR 3.5.1 C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-25 17:38:55

package compilerPackage;
import compilerPackage.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class chessGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CASTLE", "COLUMN", "EP", "EQUALS", 
		"HASH", "MINUS", "NEWLINE", "PIECE", "PLUS", "ROW", "TAKE"
	};
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int COLUMN=5;
	public static final int EP=6;
	public static final int EQUALS=7;
	public static final int HASH=8;
	public static final int MINUS=9;
	public static final int NEWLINE=10;
	public static final int PIECE=11;
	public static final int PLUS=12;
	public static final int ROW=13;
	public static final int TAKE=14;

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



	// $ANTLR start "moveFrom"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:10: ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PIECE) ) {
				alt5=1;
			}
			else if ( (LA5_0==COLUMN) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:3: p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom187); 
					cc.setPiece(p);
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:39:2: (c= COLUMN )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COLUMN) ) {
						int LA1_1 = input.LA(2);
						if ( (LA1_1==ROW) ) {
							int LA1_5 = input.LA(3);
							if ( (LA1_5==COLUMN||LA1_5==MINUS||LA1_5==TAKE) ) {
								alt1=1;
							}
						}
						else if ( (LA1_1==COLUMN||LA1_1==MINUS||LA1_1==TAKE) ) {
							alt1=1;
						}
					}
					switch (alt1) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:39:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom195); 
							cc.setColFrom(c);
							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:40:2: (r= ROW )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ROW) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:40:3: r= ROW
							{
							r=(Token)match(input,ROW,FOLLOW_ROW_in_moveFrom205); 
							cc.setRowFrom(r);
							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:2: ( (t= TAKE |t= MINUS ) )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==MINUS||LA4_0==TAKE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:3: (t= TAKE |t= MINUS )
							{
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:3: (t= TAKE |t= MINUS )
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==TAKE) ) {
								alt3=1;
							}
							else if ( (LA3_0==MINUS) ) {
								alt3=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}

							switch (alt3) {
								case 1 :
									// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom216); 
									}
									break;
								case 2 :
									// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom222); 
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
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:2: ( (c= COLUMN t= TAKE ) )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:2: ( (c= COLUMN t= TAKE ) )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:3: (c= COLUMN t= TAKE )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:3: (c= COLUMN t= TAKE )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom238); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom242); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:1: moveTo : c= COLUMN r= ROW ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:8: (c= COLUMN r= ROW )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:2: c= COLUMN r= ROW
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo258); 
			cc.setColTo(c);
			r=(Token)match(input,ROW,FOLLOW_ROW_in_moveTo265); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:10: ( EP )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant274); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:7: ( PLUS ( PLUS )? )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check283); 
			cc.setChecks();
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:51:3: ( PLUS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PLUS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:51:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check290); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:11: ( HASH )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate305); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:11: ( EQUALS p= PIECE )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion314); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion318); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:2: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule332); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule336); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule341); 
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:2: ( MINUS CASTLE )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MINUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule346); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule348); 
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
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:64:1: startRule : ( move ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:65:5: ( ( move ( NEWLINE | EOF ) )* )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:65:7: ( move ( NEWLINE | EOF ) )*
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:65:7: ( move ( NEWLINE | EOF ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= CASTLE && LA8_0 <= COLUMN)||LA8_0==PIECE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:65:8: move ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_move_in_startRule372);
					move();
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
					break loop8;
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



	// $ANTLR start "move"
	// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COLUMN||LA12_0==PIECE) ) {
				alt12=1;
			}
			else if ( (LA12_0==CASTLE) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:9: ( moveFrom )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==PIECE) ) {
						alt9=1;
					}
					else if ( (LA9_0==COLUMN) ) {
						int LA9_2 = input.LA(2);
						if ( (LA9_2==TAKE) ) {
							alt9=1;
						}
					}
					switch (alt9) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move400);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move403);
					moveTo();
					state._fsp--;

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:26: ( enPassant | promotion )?
					int alt10=3;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EP) ) {
						alt10=1;
					}
					else if ( (LA10_0==EQUALS) ) {
						alt10=2;
					}
					switch (alt10) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move406);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move410);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:51: ( check | checkmate )?
					int alt11=3;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==PLUS) ) {
						alt11=1;
					}
					else if ( (LA11_0==HASH) ) {
						alt11=2;
					}
					switch (alt11) {
						case 1 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:52: check
							{
							pushFollow(FOLLOW_check_in_move415);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move419);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move426);
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



	public static final BitSet FOLLOW_PIECE_in_moveFrom187 = new BitSet(new long[]{0x0000000000006222L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom195 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_ROW_in_moveFrom205 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom238 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo258 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveTo265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check283 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_PLUS_in_check290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion314 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_PIECE_in_promotion318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule332 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_MINUS_in_castleRule336 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule341 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_MINUS_in_castleRule346 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_in_startRule372 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_set_in_startRule374 = new BitSet(new long[]{0x0000000000000832L});
	public static final BitSet FOLLOW_moveFrom_in_move400 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_move403 = new BitSet(new long[]{0x00000000000011C2L});
	public static final BitSet FOLLOW_enPassant_in_move406 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_promotion_in_move410 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_check_in_move415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move426 = new BitSet(new long[]{0x0000000000000002L});
}
