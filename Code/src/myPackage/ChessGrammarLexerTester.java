package myPackage;

import java.io.FileReader;
import java.io.IOException;

import compilerPackage.chessGrammarLexer;
import compilerPackage.chessGrammarParser;

import org.antlr.runtime.*;

public class ChessGrammarLexerTester {
	
		public void test(String file) throws IOException{
		  	String fileIn = file;
			
		  	Token tk;
		  	int i;

			try {
				System.out.println ("Test ANTLR lexer");

				chessGrammarLexer lexer = new chessGrammarLexer (
										new ANTLRReaderStream(
												new FileReader(fileIn)	)	); 
				
				i = 1;
				
				while ((tk = lexer.nextToken()).getType() != chessGrammarLexer.EOF) {
					// recuper le informazioni relative ai token rilevati
					int line = tk.getLine();
					int col = tk.getCharPositionInLine()+1;
					int type = tk.getType();
					String text = tk.getText();

					// attivo questo controllo se voglio scartare i token nascosti
					if (tk.getChannel() != chessGrammarLexer.HIDDEN)
						// stampo le informazioni del token corrente
						System.out.println("Token " + i++ + ": "
								+ "(" + line + "," + col + ")\t\t" 
								+ "TokenType: " + type + "\t" + text);
				} 

			} catch (Exception e) {
				System.out.println ("Test ANTLR abortito");
				e.printStackTrace();
			}			
		}
  	
}