package testerCompilerPackage;

import java.io.IOException;

import chessPackage.Chessboard;


public class MainTester {

	public static void main(String[] args) throws IOException {
		String fileIn = ".\\res\\input.file";
		
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
			Chessboard.mainMethod();
		}
	}

}
