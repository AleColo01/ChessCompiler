package myPackage;

import java.io.IOException;

public class MainTester {

	public static void main(String[] args) throws IOException {
		String fileIn = ".\\res\\input.file";
		
		SimpleCalcLexerTester lex = new SimpleCalcLexerTester();
		SimpleCalcParserTester par = new SimpleCalcParserTester();
		
		System.out.println("-- LEXER --");
		System.out.println("");
		lex.test(fileIn);
		
		System.out.println("-- PARSER --");
		System.out.println("");
		par.test(fileIn);

	}

}
