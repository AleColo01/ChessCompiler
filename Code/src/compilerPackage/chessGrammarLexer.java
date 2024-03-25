// $ANTLR 3.5.1 D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-26 00:11:24

package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class chessGrammarLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public chessGrammarLexer() {} 
	public chessGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public chessGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g"; }

	// $ANTLR start "PIECE"
	public final void mPIECE() throws RecognitionException {
		try {
			int _type = PIECE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:24:7: ( ( 'R' | 'B' | 'N' | 'Q' | 'K' | 'P' ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='K'||input.LA(1)=='N'||(input.LA(1) >= 'P' && input.LA(1) <= 'R') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PIECE"

	// $ANTLR start "COLUMN"
	public final void mCOLUMN() throws RecognitionException {
		try {
			int _type = COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:25:9: ( 'a' .. 'h' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'h') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLUMN"

	// $ANTLR start "ROW"
	public final void mROW() throws RecognitionException {
		try {
			int _type = ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:26:6: ( '1' .. '8' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '8') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROW"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:27:7: ( '-' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:27:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:28:6: ( '+' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:28:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:29:8: ( '=' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:29:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "HASH"
	public final void mHASH() throws RecognitionException {
		try {
			int _type = HASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:30:6: ( '#' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:30:8: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASH"

	// $ANTLR start "TAKE"
	public final void mTAKE() throws RecognitionException {
		try {
			int _type = TAKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:31:6: ( ( 'x' | ':' ) )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
			{
			if ( input.LA(1)==':'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAKE"

	// $ANTLR start "CASTLE"
	public final void mCASTLE() throws RecognitionException {
		try {
			int _type = CASTLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:32:8: ( 'O' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:32:10: 'O'
			{
			match('O'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASTLE"

	// $ANTLR start "EP"
	public final void mEP() throws RecognitionException {
		try {
			int _type = EP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:33:4: ( ' ep' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:33:6: ' ep'
			{
			match(" ep"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EP"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:34:5: ( ( '0' .. '9' )+ )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:34:7: ( '0' .. '9' )+
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:34:7: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			int _type = SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:35:7: ( ' ' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:35:9: ' '
			{
			match(' '); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:36:7: ( '.' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:36:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:9: ( ( '\\r' )? '\\n' )
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:11: ( '\\r' )? '\\n'
			{
			// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:11: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:37:11: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:8: ( PIECE | COLUMN | ROW | MINUS | PLUS | EQUALS | HASH | TAKE | CASTLE | EP | INT | SPACE | POINT | NEWLINE )
		int alt3=14;
		switch ( input.LA(1) ) {
		case 'B':
		case 'K':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
			{
			alt3=1;
			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
			{
			alt3=2;
			}
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
			{
			int LA3_3 = input.LA(2);
			if ( ((LA3_3 >= '0' && LA3_3 <= '9')) ) {
				alt3=11;
			}

			else {
				alt3=3;
			}

			}
			break;
		case '-':
			{
			alt3=4;
			}
			break;
		case '+':
			{
			alt3=5;
			}
			break;
		case '=':
			{
			alt3=6;
			}
			break;
		case '#':
			{
			alt3=7;
			}
			break;
		case ':':
		case 'x':
			{
			alt3=8;
			}
			break;
		case 'O':
			{
			alt3=9;
			}
			break;
		case ' ':
			{
			int LA3_10 = input.LA(2);
			if ( (LA3_10=='e') ) {
				alt3=10;
			}

			else {
				alt3=12;
			}

			}
			break;
		case '0':
		case '9':
			{
			alt3=11;
			}
			break;
		case '.':
			{
			alt3=13;
			}
			break;
		case '\n':
		case '\r':
			{
			alt3=14;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:10: PIECE
				{
				mPIECE(); 

				}
				break;
			case 2 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:16: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 3 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:23: ROW
				{
				mROW(); 

				}
				break;
			case 4 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:27: MINUS
				{
				mMINUS(); 

				}
				break;
			case 5 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:33: PLUS
				{
				mPLUS(); 

				}
				break;
			case 6 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:38: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 7 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:45: HASH
				{
				mHASH(); 

				}
				break;
			case 8 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:50: TAKE
				{
				mTAKE(); 

				}
				break;
			case 9 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:55: CASTLE
				{
				mCASTLE(); 

				}
				break;
			case 10 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:62: EP
				{
				mEP(); 

				}
				break;
			case 11 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:65: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:69: SPACE
				{
				mSPACE(); 

				}
				break;
			case 13 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:75: POINT
				{
				mPOINT(); 

				}
				break;
			case 14 :
				// D:\\Unibg\\Linguaggi formali e compilatori\\Progetto Scacchi\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:81: NEWLINE
				{
				mNEWLINE(); 

				}
				break;

		}
	}



}
