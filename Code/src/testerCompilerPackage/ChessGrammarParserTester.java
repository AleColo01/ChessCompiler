package testerCompilerPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.chessGrammarLexer;
import compilerPackage.chessGrammarParser;
import compilerPackage.semanticHandler;

import org.antlr.runtime.*;

public class ChessGrammarParserTester {
	boolean startChessboard = true;

	public void test(String file) throws IOException {

	  	String fileIn = file;
	  	Token tk;
	  	int i;

		try {
			System.out.println ("Test ANTLR parser\n");

			chessGrammarLexer lexer = new chessGrammarLexer (
									new ANTLRReaderStream(
											new FileReader(fileIn)	)	); 
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			chessGrammarParser parser = new chessGrammarParser(tokens);
			
			parser.startRule();
		    
		    semanticHandler sh = parser.getHandler();
		    
		    if (!sh.hasErrors())
		    	System.out.println ("Parsing con ANTLR terminato con successo\n\n");
		    else {    	
		    	System.out.println ("Error: " + sh.getErrors().get(0));		   
		    	startChessboard = false;
		    	System.out.println ("\nParsing ANTLR abortito\n\n");
		    }

		    if (sh.hasWarnings()) {
			    System.out.println ("Warning: \n" );
		    	for (int n = 0; n<sh.getNWarnings(); n++)	    	
		    		System.out.println ((n+1) + " - " + sh.getWarnings().get(n));		    		    	
		    }
		    
			

		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}
	}
  	
}