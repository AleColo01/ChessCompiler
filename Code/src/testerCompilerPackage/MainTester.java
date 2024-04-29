package testerCompilerPackage;

import java.io.IOException;

import chessPackage.Chessboard;


public class MainTester {

	public static void main(String[] args) throws IOException {
		final String GREENBACK = "\033[42m";
		final String RESET = "\033[0m"; 
		
		//String fileIn = ".\\res\\input.file";
		//String fileIn = ".\\res\\input_TAKE_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\res\\input_PREAMBLE_NOT_POSSIBLE_ERROR.file";
		//String fileIn = ".\\res\\input_PREAMBLE_DRAW_ERROR.file";
		//String fileIn = ".\\res\\input_CASTLE_ERROR.file";
		//String fileIn = ".\\res\\input_STARTING_KING_CHECK_ERROR.file";
		String fileIn = ".\\res\\input_ENPASSANT_ERROR.file";
		//String fileIn = ".\\res\\input_MOVE_NOT_UNIQUE_ERROR.file";
		//String fileIn = ".\\res\\input_CHECK_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\res\\input_CHECKMATE_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\res\\inputTest.file";
		
		ChessGrammarLexerTester lex = new ChessGrammarLexerTester();
		ChessGrammarParserTester par = new ChessGrammarParserTester();
		
		System.out.println("-- LEXER --");
		System.out.println("");
		lex.test(fileIn);
		System.out.println("\n\n");
		System.out.println("-- PARSER --");
		System.out.println("");
		par.test(fileIn);
		
		if(par.startChessboard) {
			System.out.println(GREENBACK+ "Avvio Scacchiera..." + RESET);
			Chessboard.mainMethod(fileIn);
		}
	}

}
