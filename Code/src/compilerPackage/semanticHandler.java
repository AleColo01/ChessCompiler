package compilerPackage;
import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import compilerPackage.util.Variable;

public class semanticHandler {
	// ****** codici per i messaggi d'errore
	public static int LEXICAL_ERROR 		= 0;
	public static int SYNTAX_ERROR 			= 1;
	public static int TAKE_NOT_CORRECT_ERROR = 11; //indicatore x o : non corretto 
	public static int MOVE_NOT_UNIQUE_ERROR = 12; //la mossa è attuabili da più di un pezzo o nessuno 
	public static int KING_IN_CHECK_ERROR = 13; //la mossa lascia il re in scacco 
	public static int PROMOTION_ERROR = 14; //la promozione non è disponibile OK
	public static int CHECK_NOT_CORRECT_ERROR = 15; //indicatore scacco sbagliato 
	public static int CHECKMATE_NOT_CORRECT_ERROR = 16; //indicatore scacco matto sbagliato 
	public static int ENPASSANT_ERROR = 17; //indicatore enpassant errato 
	public static int CASTLE_ERROR = 18; //arrocco non possibile 
	public static int TURN_NUMBER_ERROR = 19; //il numero di turno indicato non è corretto OK
	public static int PREAMBLE_NOT_POSSIBLE_ERROR = 20; //il prembolo è sbagliato OK
	public static int PREAMBLE_DRAW_ERROR = 21; //il preambolo parte da una situazione patta 
	public static int STARTING_KING_CHECK_ERROR = 22; //il re di chi non inizia è in scacco 
	public static int STARTING_TURN_ERROR = 23; //il colore di chi iniza non è corretto 
	public static int IMPOSSIBLE_MOVE_ERROR = 24; //la mossa è attuabili da più di un pezzo o nessuno OK 
	
	public static int FIRST_WARNING = 100;
	public static int NOTATION_WARNING = 101; //presente notazione superflua OK
	
	// ****** attributi semantici globali
	Hashtable<String, Variable> symbolTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	StringBuffer translation;
	
	// ****** costrutture
	public semanticHandler () {
		symbolTable = new Hashtable<String, Variable> (103);
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
		translation = new StringBuffer ();
	}
	
// *********************** metodi di pubblico interesse
	public String getTranslation () {
		return translation.toString();
	}

	public boolean hasErrors () {
		return (errors.size()!=0);
	}
	public ArrayList<String> getErrors () {
		return errors;
	}

	public boolean hasWarnings () {
		return (warnings.size()!=0);
	}
	public ArrayList<String> getWarnings () {
		return warnings;
	}
	public int getNWarnings () {
		return warnings.size();
	}

// *********************** gestione degli errori
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		if (tk.getType() == chessGrammarLexer.ERROR) 
			errors.add("Errore Lessicale in " + coors + ":\t" +msg+"\t"+tk.getText());
		else
			errors.add("Errore Sintattico in " + coors + ":\t" +msg+"\t"+tk.getText());
	}
	
	// gestore gli errori semantici
	void addError (int errCode, Token tk) {
		String msg = "";
		if(tk!=null) {
			String str = tk.getText();
			String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
			msg = "Errore Semantico in " + coors + ":\t";
		}
		
		if (errCode == TAKE_NOT_CORRECT_ERROR)
			msg += "Controlla la mangiata";
 		else if (errCode == MOVE_NOT_UNIQUE_ERROR)
 			msg += "Non è possibile definire il pezzo che deve compiere la mossa";
 		else if(errCode == KING_IN_CHECK_ERROR)
 			msg += "La mossa lascia il re in scacco";
 		else if(errCode == PROMOTION_ERROR)
 			msg += "la promozione non è disponibile";
 		else if(errCode == CHECK_NOT_CORRECT_ERROR)
 			msg += "Indicatore scacco sbagliato";
 		else if(errCode == CHECKMATE_NOT_CORRECT_ERROR)
 			msg += "Indicatore scacco matto sbagliato";
 		else if(errCode == ENPASSANT_ERROR)
 			msg += "Indicatore enpassant errato";
 		else if(errCode == CASTLE_ERROR)
 			msg += "Arrocco non possibile";
 		else if(errCode == TURN_NUMBER_ERROR)
 			msg += "Il numero di turno indicato non è correto";
 		else if(errCode == PREAMBLE_NOT_POSSIBLE_ERROR)
 			msg += "Il prembolo è sbagliato";
 		else if(errCode == PREAMBLE_DRAW_ERROR)
 			msg += "Il preambolo parte da una situazione patta";
 		else if(errCode == STARTING_KING_CHECK_ERROR)
 			msg += "Il re di chi non inizia è in scacco";
 		else if(errCode == STARTING_TURN_ERROR)
 			msg += "Il colore di chi iniza non è corretto";
 		else if(errCode == IMPOSSIBLE_MOVE_ERROR)
 			msg += "Nessun pezzo può compiere questa mossa";
		
 		errors.add(msg);
	}
	
	
	void addWarning (int warnCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		String msg = "Warning in " + coors + ":\t";
		
		if (warnCode == NOTATION_WARNING)
			msg += "La notazione può essere abbreviata ulteriormente";

		warnings.add (msg);
	}

}
