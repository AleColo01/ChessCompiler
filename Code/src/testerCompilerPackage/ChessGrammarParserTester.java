package testerCompilerPackage;

import java.io.FileReader;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;

import compilerPackage.chessGrammarLexer;
import compilerPackage.chessGrammarParser;
import compilerPackage.semanticHandler;

import org.antlr.runtime.*;

public class ChessGrammarParserTester {
	boolean startChessboard = true;
	JTextArea textArea;
	
	public ChessGrammarParserTester(){
		textArea = null;

	}
	
	public ChessGrammarParserTester(JTextArea ta){
		textArea = ta;
		Font font = new Font("Arial", Font.BOLD, 12); 
		textArea.setFont(font); 
		textArea.setForeground(Color.BLACK); 
	}

	public void test(String file) throws IOException {

	  	String fileIn = file;
	  	
	  	//For the color on console
	  	 final String RESET = "\033[0m"; 
	     final String RED = "\033[0;31m";
	     final String YELLOW = "\033[0;33m"; 
	     final String GREENBACK = "\033[42m";
	     final String REDBACK = "\033[41m";
	     
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
		    if(textArea != null) {
		    	textArea.append("Controllo file...\n\n");	    	
		    }
		    if (sh.hasWarnings()) {
		    	System.out.println(YELLOW);
		    	for (int n = 0; n<sh.getNWarnings(); n++)	{
		    		if(textArea != null) {
			    		textArea.append((n+1) + " - " + sh.getWarnings().get(n) + "\n");	 
			    	}
		    		System.out.println ((n+1) + " - " + sh.getWarnings().get(n));
		    	}
		    	System.out.println(RESET);
		    }
		    
		    if (!sh.hasErrors())
		    	System.out.println ("Parsing con ANTLR terminato con successo\n\n");
		    else {  
		    	startChessboard = false;
		    	System.out.println (RED+ sh.getErrors().get(0) + RESET);	
		    	if(textArea != null) {
		    		textArea.append(sh.getErrors().get(0) + "\n");
		    		textArea.append("\n\nParsing ANTLR abortito\n\n");
		    	}
		    	System.out.println (REDBACK+"\n\nParsing ANTLR abortito\n\n"+RESET);
		    }


		} catch (Exception e) {
			if(textArea != null) {
				textArea.setForeground(Color.RED); 
			}
			startChessboard = false;
			System.out.println (REDBACK+"\n\nTest ANTLR abortito"+RESET);
			e.printStackTrace();
		}
	}
  	
}