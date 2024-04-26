package testerCompilerPackage;

import java.io.IOException;

import chessPackage.Chessboard;


public class MainTester {

	public static void main(String[] args) throws IOException {
		//String fileIn = ".\\res\\input.file";
		//String fileIn = ".\\res\\input_TAKE_NOT_CORRECT_ERROR.file";
		//String fileIn = ".\\res\\input_PREAMBLE_NOT_POSSIBLE_ERROR.file";
		//String fileIn = ".\\res\\input_PREAMBLE_DRAW_ERROR.file";
		String fileIn = ".\\res\\input_CASTLE_ERROR.file";
		
		
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
			System.out.println("Avvio Scacchiera...");
			Chessboard.mainMethod(fileIn);
		}
	}

}
