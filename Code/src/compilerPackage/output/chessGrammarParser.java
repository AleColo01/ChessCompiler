// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-23 00:26:22

package compilerPackage.output;
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
	@Override public String getGrammarFileName() { return "D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g"; }


	compilerChecker cc = new compilerChecker();



	// $ANTLR start "moveFrom"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:1: moveFrom : ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) );
	public final void moveFrom() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:2: ( ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? ) | ( COLUMN TAKE ) )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:5: ( PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:6: PIECE ( COLUMN )? ( ROW )? ( TAKE | MINUS )?
					{
					match(input,PIECE,FOLLOW_PIECE_in_moveFrom184); 
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: ( COLUMN )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:12: COLUMN
							{
							match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom186); 
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ( ROW )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ROW) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:20: ROW
							{
							match(input,ROW,FOLLOW_ROW_in_moveFrom189); 
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:38:25: ( TAKE | MINUS )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==MINUS||LA3_0==TAKE) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:39:5: ( COLUMN TAKE )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:39:5: ( COLUMN TAKE )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:39:6: COLUMN TAKE
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:1: moveTo : c= COLUMN r= ROW ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:8: (c= COLUMN r= ROW )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:43:2: c= COLUMN r= ROW
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo226); 
			r=(Token)match(input,ROW,FOLLOW_ROW_in_moveTo232); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:10: ( EP )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant239); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:7: ( PLUS ( PLUS )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check246); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:14: ( PLUS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PLUS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:14: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check248); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:11: ( HASH )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate256); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: promotion : EQUALS PIECE ;
	public final void promotion() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:11: ( EQUALS PIECE )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:13: EQUALS PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion263); 
			match(input,PIECE,FOLLOW_PIECE_in_promotion265); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:13: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule276); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule278); 
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule280); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:33: ( MINUS CASTLE )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==MINUS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:34: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule283); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule285); 
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



	// $ANTLR start "startRuleOld"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:1: startRuleOld : ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )* ;
	public final void startRuleOld() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:2: ( ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )* )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )*
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= CASTLE && LA11_0 <= COLUMN)||LA11_0==PIECE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) NEWLINE
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==COLUMN||LA10_0==PIECE) ) {
						alt10=1;
					}
					else if ( (LA10_0==CASTLE) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:6: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
							{
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:6: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
							{
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: ( moveFrom )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==PIECE) ) {
								alt7=1;
							}
							else if ( (LA7_0==COLUMN) ) {
								int LA7_2 = input.LA(2);
								if ( (LA7_2==TAKE) ) {
									alt7=1;
								}
							}
							switch (alt7) {
								case 1 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: moveFrom
									{
									pushFollow(FOLLOW_moveFrom_in_startRuleOld302);
									moveFrom();
									state._fsp--;

									}
									break;

							}

							pushFollow(FOLLOW_moveTo_in_startRuleOld305);
							moveTo();
							state._fsp--;

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:24: ( enPassant | promotion )?
							int alt8=3;
							int LA8_0 = input.LA(1);
							if ( (LA8_0==EP) ) {
								alt8=1;
							}
							else if ( (LA8_0==EQUALS) ) {
								alt8=2;
							}
							switch (alt8) {
								case 1 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:25: enPassant
									{
									pushFollow(FOLLOW_enPassant_in_startRuleOld308);
									enPassant();
									state._fsp--;

									}
									break;
								case 2 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:37: promotion
									{
									pushFollow(FOLLOW_promotion_in_startRuleOld312);
									promotion();
									state._fsp--;

									}
									break;

							}

							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:49: ( check | checkmate )?
							int alt9=3;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==PLUS) ) {
								alt9=1;
							}
							else if ( (LA9_0==HASH) ) {
								alt9=2;
							}
							switch (alt9) {
								case 1 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:50: check
									{
									pushFollow(FOLLOW_check_in_startRuleOld317);
									check();
									state._fsp--;

									}
									break;
								case 2 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:58: checkmate
									{
									pushFollow(FOLLOW_checkmate_in_startRuleOld321);
									checkmate();
									state._fsp--;

									}
									break;

							}

							}

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:74: castleRule
							{
							pushFollow(FOLLOW_castleRule_in_startRuleOld329);
							castleRule();
							state._fsp--;

							}
							break;

					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRuleOld333); 
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
	// $ANTLR end "startRuleOld"



	// $ANTLR start "startRule"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:1: startRule : ( move NEWLINE )* EOF ;
	public final void startRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:5: ( ( move NEWLINE )* EOF )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:7: ( move NEWLINE )* EOF
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:7: ( move NEWLINE )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= CASTLE && LA12_0 <= COLUMN)||LA12_0==PIECE) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:8: move NEWLINE
					{
					pushFollow(FOLLOW_move_in_startRule350);
					move();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_startRule352); 
					}
					break;

				default :
					break loop12;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_startRule361); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule );
	public final void move() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:5: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:7: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:7: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:8: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:8: ( moveFrom )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:8: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move378);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move381);
					moveTo();
					state._fsp--;

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:25: ( enPassant | promotion )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:26: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move384);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:38: promotion
							{
							pushFollow(FOLLOW_promotion_in_move388);
							promotion();
							state._fsp--;

							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:50: ( check | checkmate )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:51: check
							{
							pushFollow(FOLLOW_check_in_move393);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:59: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move397);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:74: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move404);
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
	public static final BitSet FOLLOW_COLUMN_in_moveTo226 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ROW_in_moveTo232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check246 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_PLUS_in_check248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion263 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_PIECE_in_promotion265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule276 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_MINUS_in_castleRule278 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule280 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_MINUS_in_castleRule283 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_startRuleOld302 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_startRuleOld305 = new BitSet(new long[]{0x00000000000015C0L});
	public static final BitSet FOLLOW_enPassant_in_startRuleOld308 = new BitSet(new long[]{0x0000000000001500L});
	public static final BitSet FOLLOW_promotion_in_startRuleOld312 = new BitSet(new long[]{0x0000000000001500L});
	public static final BitSet FOLLOW_check_in_startRuleOld317 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_checkmate_in_startRuleOld321 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_castleRule_in_startRuleOld329 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_startRuleOld333 = new BitSet(new long[]{0x0000000000000832L});
	public static final BitSet FOLLOW_move_in_startRule350 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_startRule352 = new BitSet(new long[]{0x0000000000000830L});
	public static final BitSet FOLLOW_EOF_in_startRule361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move378 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_move381 = new BitSet(new long[]{0x00000000000011C2L});
	public static final BitSet FOLLOW_enPassant_in_move384 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_promotion_in_move388 = new BitSet(new long[]{0x0000000000001102L});
	public static final BitSet FOLLOW_check_in_move393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move404 = new BitSet(new long[]{0x0000000000000002L});
}
