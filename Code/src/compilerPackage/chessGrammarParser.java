// $ANTLR 3.5.1 C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-22 18:08:10

package compilerPackage;


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



	// $ANTLR start "moveFromOld"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:1: moveFromOld : ( ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE ) ( TAKE | MINUS )? )? ( COLUMN ROW ) ;
	public final void moveFromOld() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:12: ( ( ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE ) ( TAKE | MINUS )? )? ( COLUMN ROW ) )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:13: ( ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE ) ( TAKE | MINUS )? )? ( COLUMN ROW )
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:13: ( ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE ) ( TAKE | MINUS )? )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==PIECE||LA3_0==ROW) ) {
				alt3=1;
			}
			else if ( (LA3_0==COLUMN) ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ROW) ) {
					int LA3_4 = input.LA(3);
					if ( (LA3_4==COLUMN||LA3_4==MINUS||LA3_4==TAKE) ) {
						alt3=1;
					}
				}
				else if ( (LA3_2==COLUMN||LA3_2==MINUS||LA3_2==TAKE) ) {
					alt3=1;
				}
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:14: ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE ) ( TAKE | MINUS )?
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:14: ( PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE )
					int alt1=7;
					switch ( input.LA(1) ) {
					case PIECE:
						{
						switch ( input.LA(2) ) {
						case COLUMN:
							{
							int LA1_4 = input.LA(3);
							if ( (LA1_4==ROW) ) {
								int LA1_10 = input.LA(4);
								if ( (LA1_10==COLUMN||LA1_10==MINUS||LA1_10==TAKE) ) {
									alt1=1;
								}
								else if ( (LA1_10==EOF) ) {
									alt1=7;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA1_4==COLUMN||LA1_4==MINUS||LA1_4==TAKE) ) {
								alt1=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case ROW:
							{
							alt1=3;
							}
							break;
						case MINUS:
						case TAKE:
							{
							alt1=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case COLUMN:
						{
						int LA1_2 = input.LA(2);
						if ( (LA1_2==ROW) ) {
							alt1=4;
						}
						else if ( (LA1_2==COLUMN||LA1_2==MINUS||LA1_2==TAKE) ) {
							alt1=5;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ROW:
						{
						alt1=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:15: PIECE COLUMN ROW
							{
							match(input,PIECE,FOLLOW_PIECE_in_moveFromOld178); 
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFromOld180); 
							match(input,ROW,FOLLOW_ROW_in_moveFromOld182); 
							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:34: PIECE COLUMN
							{
							match(input,PIECE,FOLLOW_PIECE_in_moveFromOld186); 
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFromOld188); 
							}
							break;
						case 3 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:49: PIECE ROW
							{
							match(input,PIECE,FOLLOW_PIECE_in_moveFromOld192); 
							match(input,ROW,FOLLOW_ROW_in_moveFromOld194); 
							}
							break;
						case 4 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:61: COLUMN ROW
							{
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFromOld198); 
							match(input,ROW,FOLLOW_ROW_in_moveFromOld200); 
							}
							break;
						case 5 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:74: COLUMN
							{
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFromOld204); 
							}
							break;
						case 6 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:83: ROW
							{
							match(input,ROW,FOLLOW_ROW_in_moveFromOld208); 
							}
							break;
						case 7 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:89: PIECE
							{
							match(input,PIECE,FOLLOW_PIECE_in_moveFromOld212); 
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:95: ( TAKE | MINUS )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==MINUS||LA2_0==TAKE) ) {
						alt2=1;
					}
					switch (alt2) {
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
					break;

			}

			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:112: ( COLUMN ROW )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:36:113: COLUMN ROW
			{
			match(input,COLUMN,FOLLOW_COLUMN_in_moveFromOld225); 
			match(input,ROW,FOLLOW_ROW_in_moveFromOld227); 
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
	// $ANTLR end "moveFromOld"



	// $ANTLR start "moveFrom"
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:37:1: moveFrom : ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) );
	public final void moveFrom() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:2: ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PIECE) ) {
				alt7=1;
			}
			else if ( (LA7_0==COLUMN) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:6: PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )?
					{
					match(input,PIECE,FOLLOW_PIECE_in_moveFrom238); 
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: ( COLUMN )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==COLUMN) ) {
						int LA4_1 = input.LA(2);
						if ( (LA4_1==ROW) ) {
							int LA4_4 = input.LA(3);
							if ( (LA4_4==COLUMN||LA4_4==MINUS||LA4_4==TAKE) ) {
								alt4=1;
							}
						}
						else if ( (LA4_1==COLUMN||LA4_1==MINUS||LA4_1==TAKE) ) {
							alt4=1;
						}
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: COLUMN
							{
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom240); 
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ( ROW )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ROW) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ROW
							{
							match(input,ROW,FOLLOW_ROW_in_moveFrom243); 
							}
							break;

					}

					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:38:25: ( TAKE | MINUS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==MINUS||LA6_0==TAKE) ) {
						alt6=1;
					}
					switch (alt6) {
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
					match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom263); 
					match(input,TAKE,FOLLOW_TAKE_in_moveFrom265); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:42:1: moveTo : c= COLUMN r= ROW ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:42:8: (c= COLUMN r= ROW )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:43:2: c= COLUMN r= ROW
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo280); 
			r=(Token)match(input,ROW,FOLLOW_ROW_in_moveTo286); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:10: ( EP )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:46:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant293); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:7: ( PLUS ( PLUS )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check300); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:14: ( PLUS )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PLUS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:47:14: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check302); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:11: ( HASH )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:48:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate310); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: promotion : EQUALS PIECE ;
	public final void promotion() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:11: ( EQUALS PIECE )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:49:13: EQUALS PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion317); 
			match(input,PIECE,FOLLOW_PIECE_in_promotion319); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:13: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule330); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule332); 
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule334); 
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:33: ( MINUS CASTLE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==MINUS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:50:34: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule337); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule339); 
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
	// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:53:1: startRule : ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )* ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:2: ( ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )* )
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )*
			{
			// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= CASTLE && LA14_0 <= COLUMN)||LA14_0==PIECE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE
					{
					// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==COLUMN||LA13_0==PIECE) ) {
						alt13=1;
					}
					else if ( (LA13_0==CASTLE) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:6: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
							{
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:6: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
							{
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: ( moveFrom )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==PIECE) ) {
								alt10=1;
							}
							else if ( (LA10_0==COLUMN) ) {
								int LA10_2 = input.LA(2);
								if ( (LA10_2==TAKE) ) {
									alt10=1;
								}
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: moveFrom
									{
									pushFollow(FOLLOW_moveFrom_in_startRule356);
									moveFrom();
									state._fsp--;

									}
									break;

							}

							pushFollow(FOLLOW_moveTo_in_startRule359);
							moveTo();
							state._fsp--;

							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:24: ( enPassant | promotion )?
							int alt11=3;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==EP) ) {
								alt11=1;
							}
							else if ( (LA11_0==EQUALS) ) {
								alt11=2;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:25: enPassant
									{
									pushFollow(FOLLOW_enPassant_in_startRule362);
									enPassant();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:37: promotion
									{
									pushFollow(FOLLOW_promotion_in_startRule366);
									promotion();
									state._fsp--;

									}
									break;

							}

							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:49: ( check | checkmate )?
							int alt12=3;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==PLUS) ) {
								alt12=1;
							}
							else if ( (LA12_0==HASH) ) {
								alt12=2;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:50: check
									{
									pushFollow(FOLLOW_check_in_startRule371);
									check();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:58: checkmate
									{
									pushFollow(FOLLOW_checkmate_in_startRule375);
									checkmate();
									state._fsp--;

									}
									break;

							}

							}

							}
							break;
						case 2 :
							// C:\\Users\\doubl\\Desktop\\Uni\\Linguaggi Formali\\Progetto\\Chess\\Code\\src\\compilerPackage\\chessGrammar.g:54:74: castleRule
							{
							pushFollow(FOLLOW_castleRule_in_startRule383);
							castleRule();
							state._fsp--;

							}
							break;

					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule387); 
					}
					break;

				default :
					break loop14;
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

	// Delegated rules



	public static final BitSet FOLLOW_PIECE_in_moveFromOld178 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLUMN_in_moveFromOld180 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveFromOld182 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_PIECE_in_moveFromOld186 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLUMN_in_moveFromOld188 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_PIECE_in_moveFromOld192 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveFromOld194 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_COLUMN_in_moveFromOld198 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveFromOld200 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_COLUMN_in_moveFromOld204 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_ROW_in_moveFromOld208 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_PIECE_in_moveFromOld212 = new BitSet(new long[]{0x0000000000004220L});
	public static final BitSet FOLLOW_COLUMN_in_moveFromOld225 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveFromOld227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIECE_in_moveFrom238 = new BitSet(new long[]{0x0000000000006222L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom240 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_ROW_in_moveFrom243 = new BitSet(new long[]{0x0000000000004202L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom263 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo280 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveTo286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check300 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_PLUS_in_check302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion317 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_PIECE_in_promotion319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule330 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_MINUS_in_castleRule332 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule334 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_MINUS_in_castleRule337 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_startRule356 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_startRule359 = new BitSet(new long[]{0x00000000000015C0L});
	public static final BitSet FOLLOW_enPassant_in_startRule362 = new BitSet(new long[]{0x0000000000001500L});
	public static final BitSet FOLLOW_promotion_in_startRule366 = new BitSet(new long[]{0x0000000000001500L});
	public static final BitSet FOLLOW_check_in_startRule371 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_checkmate_in_startRule375 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_castleRule_in_startRule383 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule387 = new BitSet(new long[]{0x0000000000000832L});
}
