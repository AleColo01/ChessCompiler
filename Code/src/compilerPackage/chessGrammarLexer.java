// $ANTLR 3.5.1 C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g 2024-03-29 15:27:18

package compilerPackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class chessGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CASTLE=4;
	public static final int CLOSE=5;
	public static final int COLUMN=6;
	public static final int EP=7;
	public static final int EQUALS=8;
	public static final int ERROR_TOKEN=9;
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
	@Override public String getGrammarFileName() { return "C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g"; }

	// $ANTLR start "PIECE"
	public final void mPIECE() throws RecognitionException {
		try {
			int _type = PIECE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:45:7: ( ( 'R' | 'B' | 'N' | 'Q' | 'K' | 'P' ) )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:46:9: ( 'a' .. 'h' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:6: ( ( '0' .. '9' )+ )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:8: ( '0' .. '9' )+
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:47:8: ( '0' .. '9' )+
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
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
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

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:7: ( '-' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:48:9: '-'
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:6: ( '+' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:49:8: '+'
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:8: ( '=' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:50:10: '='
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:51:6: ( '#' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:51:8: '#'
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:52:6: ( ( 'x' | ':' ) )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:8: ( 'O' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:53:10: 'O'
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:4: ( ' ep' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:54:6: ' ep'
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

	// $ANTLR start "TAB"
	public final void mTAB() throws RecognitionException {
		try {
			int _type = TAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:5: ( '\\t' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:55:7: '\\t'
			{
			match('\t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAB"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:7: ( '.' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:56:9: '.'
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
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:9: ( ( '\\r' )? '\\n' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:11: ( '\\r' )? '\\n'
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:11: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:57:11: '\\r'
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

	// $ANTLR start "OPEN"
	public final void mOPEN() throws RecognitionException {
		try {
			int _type = OPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:6: ( '[' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:58:8: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN"

	// $ANTLR start "CLOSE"
	public final void mCLOSE() throws RecognitionException {
		try {
			int _type = CLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:7: ( ']' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:59:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE"

	// $ANTLR start "TURN"
	public final void mTURN() throws RecognitionException {
		try {
			int _type = TURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:6: ( ( 'white' | 'black' ) )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:8: ( 'white' | 'black' )
			{
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:8: ( 'white' | 'black' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='w') ) {
				alt3=1;
			}
			else if ( (LA3_0=='b') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:9: 'white'
					{
					match("white"); 

					}
					break;
				case 2 :
					// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:60:19: 'black'
					{
					match("black"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TURN"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:4: ( ';' )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:61:6: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "ERROR_TOKEN"
	public final void mERROR_TOKEN() throws RecognitionException {
		try {
			int _type = ERROR_TOKEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:13: ( . )
			// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:62:15: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TOKEN"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:8: ( PIECE | COLUMN | INT | MINUS | PLUS | EQUALS | HASH | TAKE | CASTLE | EP | TAB | POINT | NEWLINE | OPEN | CLOSE | TURN | SC | ERROR_TOKEN )
		int alt4=18;
		int LA4_0 = input.LA(1);
		if ( (LA4_0=='B'||LA4_0=='K'||LA4_0=='N'||(LA4_0 >= 'P' && LA4_0 <= 'R')) ) {
			alt4=1;
		}
		else if ( (LA4_0=='b') ) {
			int LA4_2 = input.LA(2);
			if ( (LA4_2=='l') ) {
				alt4=16;
			}

			else {
				alt4=2;
			}

		}
		else if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
			alt4=3;
		}
		else if ( (LA4_0=='-') ) {
			alt4=4;
		}
		else if ( (LA4_0=='+') ) {
			alt4=5;
		}
		else if ( (LA4_0=='=') ) {
			alt4=6;
		}
		else if ( (LA4_0=='#') ) {
			alt4=7;
		}
		else if ( (LA4_0==':'||LA4_0=='x') ) {
			alt4=8;
		}
		else if ( (LA4_0=='O') ) {
			alt4=9;
		}
		else if ( (LA4_0==' ') ) {
			int LA4_10 = input.LA(2);
			if ( (LA4_10=='e') ) {
				alt4=10;
			}

			else {
				alt4=18;
			}

		}
		else if ( (LA4_0=='\t') ) {
			alt4=11;
		}
		else if ( (LA4_0=='.') ) {
			alt4=12;
		}
		else if ( (LA4_0=='\r') ) {
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='\n') ) {
				alt4=13;
			}

			else {
				alt4=18;
			}

		}
		else if ( (LA4_0=='\n') ) {
			alt4=13;
		}
		else if ( (LA4_0=='[') ) {
			alt4=14;
		}
		else if ( (LA4_0==']') ) {
			alt4=15;
		}
		else if ( (LA4_0=='w') ) {
			int LA4_17 = input.LA(2);
			if ( (LA4_17=='h') ) {
				alt4=16;
			}

			else {
				alt4=18;
			}

		}
		else if ( (LA4_0=='a'||(LA4_0 >= 'c' && LA4_0 <= 'h')) ) {
			alt4=2;
		}
		else if ( (LA4_0==';') ) {
			alt4=17;
		}
		else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\b')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\u001F')||(LA4_0 >= '!' && LA4_0 <= '\"')||(LA4_0 >= '$' && LA4_0 <= '*')||LA4_0==','||LA4_0=='/'||LA4_0=='<'||(LA4_0 >= '>' && LA4_0 <= 'A')||(LA4_0 >= 'C' && LA4_0 <= 'J')||(LA4_0 >= 'L' && LA4_0 <= 'M')||(LA4_0 >= 'S' && LA4_0 <= 'Z')||LA4_0=='\\'||(LA4_0 >= '^' && LA4_0 <= '`')||(LA4_0 >= 'i' && LA4_0 <= 'v')||(LA4_0 >= 'y' && LA4_0 <= '\uFFFF')) ) {
			alt4=18;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}

		switch (alt4) {
			case 1 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:10: PIECE
				{
				mPIECE(); 

				}
				break;
			case 2 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:16: COLUMN
				{
				mCOLUMN(); 

				}
				break;
			case 3 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:23: INT
				{
				mINT(); 

				}
				break;
			case 4 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:27: MINUS
				{
				mMINUS(); 

				}
				break;
			case 5 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:33: PLUS
				{
				mPLUS(); 

				}
				break;
			case 6 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:38: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 7 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:45: HASH
				{
				mHASH(); 

				}
				break;
			case 8 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:50: TAKE
				{
				mTAKE(); 

				}
				break;
			case 9 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:55: CASTLE
				{
				mCASTLE(); 

				}
				break;
			case 10 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:62: EP
				{
				mEP(); 

				}
				break;
			case 11 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:65: TAB
				{
				mTAB(); 

				}
				break;
			case 12 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:69: POINT
				{
				mPOINT(); 

				}
				break;
			case 13 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:75: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 14 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:83: OPEN
				{
				mOPEN(); 

				}
				break;
			case 15 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:88: CLOSE
				{
				mCLOSE(); 

				}
				break;
			case 16 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:94: TURN
				{
				mTURN(); 

				}
				break;
			case 17 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:99: SC
				{
				mSC(); 

				}
				break;
			case 18 :
				// C:\\Documenti\\UniBG\\Materie\\Linguaggi Formali\\Progetto\\ChessCompiler\\Code\\src\\compilerPackage\\chessGrammar.g:1:102: ERROR_TOKEN
				{
				mERROR_TOKEN(); 

				}
				break;

		}
	}



}
