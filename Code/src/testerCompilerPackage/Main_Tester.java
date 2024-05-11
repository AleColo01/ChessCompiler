package testerCompilerPackage;

import java.io.IOException;

import chessPackage.Chessboard;


public class Main_Tester {

	public static void main(String[] args) throws IOException {
		final String GREENBACK = "\033[42m";
		final String RESET = "\033[0m"; 
		
		String fileIn = ".\\GameFiles\\input.file";
		//String fileIn = ".\\GameFiles\\input_TAKE_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_PREAMBLE_NOT_POSSIBLE_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_PREAMBLE_DRAW_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_CASTLE_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_STARTING_KING_CHECK_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_ENPASSANT_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_MOVE_NOT_UNIQUE_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_CHECK_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_CHECKMATE_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_PROMOTION_ERROR.file";
		//String fileIn = ".\\GameFiles\\input_KING_IN_CHECK_ERROR.file";
		//String fileIn = ".\\GameFiles\\inputTest.file";
		
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
