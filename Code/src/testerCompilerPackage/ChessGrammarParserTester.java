package testerCompilerPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.chessGrammarLexer;
import compilerPackage.chessGrammarParser;

import org.antlr.runtime.*;

public class ChessGrammarParserTester {

	public void test(String file) throws IOException {

	  	String fileIn = file;
	  	Token tk;
	  	int i;

		try {
			System.out.println ("Test ANTLR parser");

			chessGrammarLexer lexer = new chessGrammarLexer (
									new ANTLRReaderStream(
											new FileReader(fileIn)	)	); 
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			chessGrammarParser parser = new chessGrammarParser(tokens);
		    parser.startRule();
			System.out.println ("\nParsing ANTLR terminato con successo\n\n");

		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}

	}
  	
}