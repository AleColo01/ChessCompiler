// $ANTLR 3.5.1 C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-23 16:13:36

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
	@Override public String getGrammarFileName() { return "C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g"; }


	compilerChecker cc = new compilerChecker();



	// $ANTLR start "moveFrom"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:37:1: moveFrom : ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) );
	public final void moveFrom() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:2: ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==PIECE) ) {
				alt4=1;
			}
			else if ( (LA4_0==COLUMN) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:6: PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )?
					{
					match(input,PIECE,FOLLOW_PIECE_in_moveFrom184); 
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: ( COLUMN )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COLUMN) ) {
						int LA1_1 = input.LA(2);
						if ( (LA1_1==ROW) ) {
							int LA1_4 = input.LA(3);
							if ( (LA1_4==COLUMN||LA1_4==MINUS||LA1_4==TAKE) ) {
								alt1=1;
							}
						}
						else if ( (LA1_1==COLUMN||LA1_1==MINUS||LA1_1==TAKE) ) {
							alt1=1;
						}
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: COLUMN
							{
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom186); 
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ( ROW )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ROW) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ROW
							{
							match(input,ROW,FOLLOW_ROW_in_moveFrom189); 
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:25: ( TAKE | MINUS )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==MINUS||LA3_0==TAKE) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:
							{
							if ( input.LA(1)==MINUS||input.LA(1)==TAKE ) {
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

					}

					}
					break;
				case 2 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:39:5: ( COLUMN TAKE )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:39:5: ( COLUMN TAKE )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:39:6: COLUMN TAKE
					{
					match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom209); 
					match(input,TAKE,FOLLOW_TAKE_in_moveFrom211); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:42:1: moveTo : COLUMN ROW ;
	public final void moveTo() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:42:8: ( COLUMN ROW )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:43:2: COLUMN ROW
			{
			match(input,COLUMN,FOLLOW_COLUMN_in_moveTo224); 
			match(input,ROW,FOLLOW_ROW_in_moveTo226); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:45:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:45:10: ( EP )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:45:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant233); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:7: ( PLUS ( PLUS )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check240); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:14: ( PLUS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PLUS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:14: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check242); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:11: ( HASH )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate250); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:1: promotion : EQUALS PIECE ;
	public final void promotion() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:11: ( EQUALS PIECE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:13: EQUALS PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion257); 
			match(input,PIECE,FOLLOW_PIECE_in_promotion259); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:13: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule270); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule272); 
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule274); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:33: ( MINUS CASTLE )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==MINUS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:34: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule277); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule279); 
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
	// $ANTLR end "castleRule"



	// $ANTLR start "startRule"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:52:1: startRule : ( move ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:53:5: ( ( move ( NEWLINE | EOF ) )* )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:53:7: ( move ( NEWLINE | EOF ) )*
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:53:7: ( move ( NEWLINE | EOF ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= CASTLE && LA7_0 <= COLUMN)||LA7_0==PIECE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:53:8: move ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_move_in_startRule297);
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
					break loop7;
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:55:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule );
	public final void move() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==COLUMN||LA11_0==PIECE) ) {
				alt11=1;
			}
			else if ( (LA11_0==CASTLE) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:7: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:7: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:8: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:8: ( moveFrom )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==PIECE) ) {
						alt8=1;
					}
					else if ( (LA8_0==COLUMN) ) {
						int LA8_2 = input.LA(2);
						if ( (LA8_2==TAKE) ) {
							alt8=1;
						}
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:8: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move324);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move327);
					moveTo();
					state._fsp--;

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:25: ( enPassant | promotion )?
					int alt9=3;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==EP) ) {
						alt9=1;
					}
					else if ( (LA9_0==EQUALS) ) {
						alt9=2;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:26: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move330);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:38: promotion
							{
							pushFollow(FOLLOW_promotion_in_move334);
							promotion();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:50: ( check | checkmate )?
					int alt10=3;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PLUS) ) {
						alt10=1;
					}
					else if ( (LA10_0==HASH) ) {
						alt10=2;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:51: check
							{
							pushFollow(FOLLOW_check_in_move339);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:59: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move343);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:56:74: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move350);
					castleRule();
					state._fsp--;

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
	// $ANTLR end "move"

	// Delegated rules



	public static final BitSet FOLLOW_PIECE_in_moveFrom184 = new BitSet(new long[]{0x0000000000006222L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom186 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_ROW_in_moveFrom189 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom209 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo224 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveTo226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check240 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_PLUS_in_check242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion257 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_PIECE_in_promotion259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule270 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_MINUS_in_castleRule272 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule274 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_MINUS_in_castleRule277 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_move_in_startRule297 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_set_in_startRule299 = new BitSet(new long[]{0x0000000000000832L});
	public static final BitSet FOLLOW_moveFrom_in_move324 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_move327 = new BitSet(new long[]{0x00000000000011C2L});
	public static final BitSet FOLLOW_enPassant_in_move330 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_promotion_in_move334 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_check_in_move339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move350 = new BitSet(new long[]{0x0000000000000002L});
}
