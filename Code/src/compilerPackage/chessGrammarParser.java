// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-27 11:54:58

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
		"HASH", "INT", "MINUS", "NEWLINE", "PIECE", "PLUS", "POINT", "ROW", "SPACE", 
		"TAB", "TAKE"
	};
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int COLUMN=5;
	public static final int EP=6;
	public static final int EQUALS=7;
	public static final int HASH=8;
	public static final int INT=9;
	public static final int MINUS=10;
	public static final int NEWLINE=11;
	public static final int PIECE=12;
	public static final int PLUS=13;
	public static final int POINT=14;
	public static final int ROW=15;
	public static final int SPACE=16;
	public static final int TAB=17;
	public static final int TAKE=18;

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



	// $ANTLR start "moveFrom"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:10: ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:3: p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom220); 
					cc.setPiece(p);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:43:2: (c= COLUMN )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:43:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom228); 
							cc.setColFrom(c);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:2: (r= ROW )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ROW) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:3: r= ROW
							{
							r=(Token)match(input,ROW,FOLLOW_ROW_in_moveFrom238); 
							cc.setRowFrom(r);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:2: ( (t= TAKE |t= MINUS ) )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==MINUS||LA4_0==TAKE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:3: (t= TAKE |t= MINUS )
							{
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:3: (t= TAKE |t= MINUS )
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
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom249); 
									}
									break;
								case 2 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom255); 
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:2: ( (c= COLUMN t= TAKE ) )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:2: ( (c= COLUMN t= TAKE ) )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:3: (c= COLUMN t= TAKE )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:3: (c= COLUMN t= TAKE )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom271); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom275); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:1: moveTo : c= COLUMN r= ROW ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:8: (c= COLUMN r= ROW )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:2: c= COLUMN r= ROW
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo291); 
			cc.setColTo(c);
			r=(Token)match(input,ROW,FOLLOW_ROW_in_moveTo298); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:10: ( EP )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant307); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:7: ( PLUS ( PLUS )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check316); 
			cc.setChecks();
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:3: ( PLUS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PLUS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check323); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:11: ( HASH )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate338); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:11: ( EQUALS p= PIECE )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion347); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion351); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:2: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule365); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule369); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule374); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:63:2: ( MINUS CASTLE )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MINUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:63:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule379); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule381); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:1: startRule : ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:69:5: ( ( turn ( NEWLINE | EOF ) )* )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:69:7: ( turn ( NEWLINE | EOF ) )*
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:69:7: ( turn ( NEWLINE | EOF ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==INT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:69:8: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule405);
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



	// $ANTLR start "turn"
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:1: turn : value= INT POINT SPACE move TAB move ;
	public final void turn() throws RecognitionException {
		Token value=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:5: (value= INT POINT SPACE move TAB move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:72:8: value= INT POINT SPACE move TAB move
			{
			value=(Token)match(input,INT,FOLLOW_INT_in_turn434); 
			match(input,POINT,FOLLOW_POINT_in_turn436); 
			match(input,SPACE,FOLLOW_SPACE_in_turn438); 
			pushFollow(FOLLOW_move_in_turn440);
			move();
			state._fsp--;

			match(input,TAB,FOLLOW_TAB_in_turn442); 
			pushFollow(FOLLOW_move_in_turn444);
			move();
			state._fsp--;

			cc.setTurnNumber(value);
			    					      cc.isTurnCorrect();
			    					      System.out.println("ciao");
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:76:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:9: ( moveFrom )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move464);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move467);
					moveTo();
					state._fsp--;

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:26: ( enPassant | promotion )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move470);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move474);
							promotion();
							state._fsp--;

							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:51: ( check | checkmate )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:52: check
							{
							pushFollow(FOLLOW_check_in_move479);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move483);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:77:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move490);
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



	public static final BitSet FOLLOW_PIECE_in_moveFrom220 = new BitSet(new long[]{0x0000000000048422L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom228 = new BitSet(new long[]{0x0000000000048402L});
	public static final BitSet FOLLOW_ROW_in_moveFrom238 = new BitSet(new long[]{0x0000000000040402L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom271 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo291 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ROW_in_moveTo298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check316 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_PLUS_in_check323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion347 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_PIECE_in_promotion351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule365 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_MINUS_in_castleRule369 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule374 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_MINUS_in_castleRule379 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_in_startRule405 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_set_in_startRule407 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_INT_in_turn434 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_POINT_in_turn436 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SPACE_in_turn438 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_move_in_turn440 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TAB_in_turn442 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_move_in_turn444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move464 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_move467 = new BitSet(new long[]{0x00000000000021C2L});
	public static final BitSet FOLLOW_enPassant_in_move470 = new BitSet(new long[]{0x0000000000002102L});
	public static final BitSet FOLLOW_promotion_in_move474 = new BitSet(new long[]{0x0000000000002102L});
	public static final BitSet FOLLOW_check_in_move479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move490 = new BitSet(new long[]{0x0000000000000002L});
}
