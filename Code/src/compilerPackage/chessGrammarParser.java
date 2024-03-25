// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-26 00:11:24

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
		"TAKE"
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
	public static final int TAKE=17;

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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:40:1: moveFrom : ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) );
	public final void moveFrom() throws RecognitionException {
		Token p=null;
		Token c=null;
		Token r=null;
		Token t=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:40:10: ( (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? ) | ( (c= COLUMN t= TAKE ) ) )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:2: (p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:41:3: p= PIECE (c= COLUMN )? (r= ROW )? ( (t= TAKE |t= MINUS ) )?
					{
					p=(Token)match(input,PIECE,FOLLOW_PIECE_in_moveFrom211); 
					cc.setPiece(p);
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:2: (c= COLUMN )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:42:3: c= COLUMN
							{
							c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom219); 
							cc.setColFrom(c);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:43:2: (r= ROW )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ROW) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:43:3: r= ROW
							{
							r=(Token)match(input,ROW,FOLLOW_ROW_in_moveFrom229); 
							cc.setRowFrom(r);
							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:2: ( (t= TAKE |t= MINUS ) )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==MINUS||LA4_0==TAKE) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:3: (t= TAKE |t= MINUS )
							{
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:3: (t= TAKE |t= MINUS )
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
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:4: t= TAKE
									{
									t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom240); 
									}
									break;
								case 2 :
									// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:44:13: t= MINUS
									{
									t=(Token)match(input,MINUS,FOLLOW_MINUS_in_moveFrom246); 
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:2: ( (c= COLUMN t= TAKE ) )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:2: ( (c= COLUMN t= TAKE ) )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:3: (c= COLUMN t= TAKE )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:3: (c= COLUMN t= TAKE )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:4: c= COLUMN t= TAKE
					{
					c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveFrom262); 
					t=(Token)match(input,TAKE,FOLLOW_TAKE_in_moveFrom266); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:1: moveTo : c= COLUMN r= ROW ;
	public final void moveTo() throws RecognitionException {
		Token c=null;
		Token r=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:8: (c= COLUMN r= ROW )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:2: c= COLUMN r= ROW
			{
			c=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_moveTo282); 
			cc.setColTo(c);
			r=(Token)match(input,ROW,FOLLOW_ROW_in_moveTo289); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:52:1: enPassant : EP ;
	public final void enPassant() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:52:10: ( EP )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:52:12: EP
			{
			match(input,EP,FOLLOW_EP_in_enPassant298); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:1: check : PLUS ( PLUS )? ;
	public final void check() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:7: ( PLUS ( PLUS )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:9: PLUS ( PLUS )?
			{
			match(input,PLUS,FOLLOW_PLUS_in_check307); 
			cc.setChecks();
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:3: ( PLUS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PLUS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_check314); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:1: checkmate : HASH ;
	public final void checkmate() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:11: ( HASH )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:13: HASH
			{
			match(input,HASH,FOLLOW_HASH_in_checkmate329); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:1: promotion : EQUALS p= PIECE ;
	public final void promotion() throws RecognitionException {
		Token p=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:11: ( EQUALS p= PIECE )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:13: EQUALS p= PIECE
			{
			match(input,EQUALS,FOLLOW_EQUALS_in_promotion338); 
			p=(Token)match(input,PIECE,FOLLOW_PIECE_in_promotion342); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:1: castleRule : CASTLE MINUS CASTLE ( MINUS CASTLE )? ;
	public final void castleRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:11: ( CASTLE MINUS CASTLE ( MINUS CASTLE )? )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:2: CASTLE MINUS CASTLE ( MINUS CASTLE )?
			{
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule356); 
			match(input,MINUS,FOLLOW_MINUS_in_castleRule360); 
			int i=1;
			match(input,CASTLE,FOLLOW_CASTLE_in_castleRule365); 
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:2: ( MINUS CASTLE )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MINUS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:3: MINUS CASTLE
					{
					match(input,MINUS,FOLLOW_MINUS_in_castleRule370); 
					match(input,CASTLE,FOLLOW_CASTLE_in_castleRule372); 
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:67:1: startRule : ( turn ( NEWLINE | EOF ) )* ;
	public final void startRule() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:5: ( ( turn ( NEWLINE | EOF ) )* )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:7: ( turn ( NEWLINE | EOF ) )*
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:7: ( turn ( NEWLINE | EOF ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==INT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:68:8: turn ( NEWLINE | EOF )
					{
					pushFollow(FOLLOW_turn_in_startRule396);
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:70:1: turn : ( (value+= INT )+ POINT SPACE move SPACE move ) ;
	public final void turn() throws RecognitionException {
		Token value=null;
		List<Object> list_value=null;

		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:5: ( ( (value+= INT )+ POINT SPACE move SPACE move ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:8: ( (value+= INT )+ POINT SPACE move SPACE move )
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:8: ( (value+= INT )+ POINT SPACE move SPACE move )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:9: (value+= INT )+ POINT SPACE move SPACE move
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:14: (value+= INT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==INT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:71:14: value+= INT
					{
					value=(Token)match(input,INT,FOLLOW_INT_in_turn426); 
					if (list_value==null) list_value=new ArrayList<Object>();
					list_value.add(value);
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,POINT,FOLLOW_POINT_in_turn429); 
			match(input,SPACE,FOLLOW_SPACE_in_turn431); 
			pushFollow(FOLLOW_move_in_turn433);
			move();
			state._fsp--;

			match(input,SPACE,FOLLOW_SPACE_in_turn435); 
			pushFollow(FOLLOW_move_in_turn437);
			move();
			state._fsp--;

			}

			cc.setTurnNumber(value);
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
	// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:73:1: move : ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) ;
	public final void move() throws RecognitionException {
		try {
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:5: ( ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:7: ( ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? ) | castleRule )
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
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:8: ( ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )? )
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:9: ( moveFrom )? moveTo ( enPassant | promotion )? ( check | checkmate )?
					{
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:9: ( moveFrom )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:9: moveFrom
							{
							pushFollow(FOLLOW_moveFrom_in_move458);
							moveFrom();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_moveTo_in_move461);
					moveTo();
					state._fsp--;

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:26: ( enPassant | promotion )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:27: enPassant
							{
							pushFollow(FOLLOW_enPassant_in_move464);
							enPassant();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:39: promotion
							{
							pushFollow(FOLLOW_promotion_in_move468);
							promotion();
							state._fsp--;

							}
							break;

					}

					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:51: ( check | checkmate )?
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
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:52: check
							{
							pushFollow(FOLLOW_check_in_move473);
							check();
							state._fsp--;

							}
							break;
						case 2 :
							// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:60: checkmate
							{
							pushFollow(FOLLOW_checkmate_in_move477);
							checkmate();
							state._fsp--;

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:74:75: castleRule
					{
					pushFollow(FOLLOW_castleRule_in_move484);
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



	public static final BitSet FOLLOW_PIECE_in_moveFrom211 = new BitSet(new long[]{0x0000000000028422L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom219 = new BitSet(new long[]{0x0000000000028402L});
	public static final BitSet FOLLOW_ROW_in_moveFrom229 = new BitSet(new long[]{0x0000000000020402L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_moveFrom246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveFrom262 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TAKE_in_moveFrom266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLUMN_in_moveTo282 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ROW_in_moveTo289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EP_in_enPassant298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_check307 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_PLUS_in_check314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_checkmate329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_promotion338 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_PIECE_in_promotion342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule356 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_MINUS_in_castleRule360 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule365 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_MINUS_in_castleRule370 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CASTLE_in_castleRule372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_turn_in_startRule396 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_set_in_startRule398 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_INT_in_turn426 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_POINT_in_turn429 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SPACE_in_turn431 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_move_in_turn433 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_SPACE_in_turn435 = new BitSet(new long[]{0x0000000000001030L});
	public static final BitSet FOLLOW_move_in_turn437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moveFrom_in_move458 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_moveTo_in_move461 = new BitSet(new long[]{0x00000000000021C2L});
	public static final BitSet FOLLOW_enPassant_in_move464 = new BitSet(new long[]{0x0000000000002102L});
	public static final BitSet FOLLOW_promotion_in_move468 = new BitSet(new long[]{0x0000000000002102L});
	public static final BitSet FOLLOW_check_in_move473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_checkmate_in_move477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castleRule_in_move484 = new BitSet(new long[]{0x0000000000000002L});
}
