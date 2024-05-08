package compilerPackage;
import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

public class semanticHandler {
	// codici per i messaggi d'errore
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int TAKE_NOT_CORRECT_ERROR = 11; //indicatore x o : non corretto 
	public static int MOVE_NOT_UNIQUE_ERROR = 12; //la mossa è attuabili da più di un pezzo o nessuno 
	public static int KING_IN_CHECK_ERROR = 13; //la mossa lascia il re in scacco 
	public static int PROMOTION_ERROR = 14; //la promozione non è disponibile 
	public static int CHECK_NOT_CORRECT_ERROR = 15; //indicatore scacco sbagliato 
	public static int CHECKMATE_NOT_CORRECT_ERROR = 16; //indicatore scacco matto sbagliato 
	public static int ENPASSANT_ERROR = 17; //indicatore enpassant errato 
	public static int CASTLE_ERROR = 18; //arrocco non possibile 
	public static int TURN_NUMBER_ERROR = 19; //il numero di turno indicato non è corretto 
	public static int PREAMBLE_NOT_POSSIBLE_ERROR = 20; //il prembolo è sbagliato 
	public static int PREAMBLE_DRAW_ERROR = 21; //il preambolo parte da una situazione patta 
	public static int STARTING_KING_CHECK_ERROR = 22; //il re di chi non inizia è in scacco 
	public static int STARTING_TURN_ERROR = 23; //il colore di chi iniza non è corretto 
	public static int IMPOSSIBLE_MOVE_ERROR = 24; //la mossa è attuabili da più di un pezzo o nessuno 
	public static int LAST_TURN_ERROR = 25; //la partita era già finita al turno precedente
	
	public static int FIRST_WARNING = 100;
	public static int NOTATION_WARNING = 101; //presente notazione superflua 
	
	// attributi semantici globali
	ArrayList<String> errors;
	ArrayList<String> warnings;
	StringBuffer translation;
	
	// costrutture
	public semanticHandler () {
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
		translation = new StringBuffer ();
	}
	
	// metodi di pubblico interesse
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

	// gestione degli errori
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		errors.add("Errore Lessicale in " + coors + ":\t" +msg+"\t"+tk.getText());
	}
	
	// gestore gli errori semantici
	void addError (int errCode, Token tk, char c, int turn) {
		String color = "bianco";
		if (c == 'B') color = "nero";
		
		//messaggio da stampare
		String msg = "";
		if(tk!=null) {
			String str = tk.getText();
			String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
			msg = "Errore Semantico al turno "+ turn + " del giocatore " + color +":\t";
		}
		else {
			msg = "Errore Semantico:\t";
		}
		
		if (errCode == TAKE_NOT_CORRECT_ERROR)
			msg += "La mossa in presa in non è corretta (TAKE_NOT_CORRECT_ERROR)";
 		else if (errCode == MOVE_NOT_UNIQUE_ERROR)
 			msg += "Non è possibile definire il pezzo che deve compiere la mossa (MOVE_NOT_UNIQUE_ERROR)";
 		else if(errCode == KING_IN_CHECK_ERROR)
 			msg += "La mossa lascia il proprio re in scacco (KING_IN_CHECK_ERROR)";
 		else if(errCode == PROMOTION_ERROR)
 			msg += "Errore nella promozione (PROMOTION_ERROR)";
 		else if(errCode == CHECK_NOT_CORRECT_ERROR)
 			msg += "Indicatore di scacco a re sbagliato (CHECK_NOT_CORRECT_ERROR)";
 		else if(errCode == CHECKMATE_NOT_CORRECT_ERROR)
 			msg += "Indicatore scacco matto sbagliato (CHECKMATE_NOT_CORRECT_ERROR)";
 		else if(errCode == ENPASSANT_ERROR)
 			msg += "Indicatore enpassant errato (ENPASSANT_ERROR)";
 		else if(errCode == CASTLE_ERROR)
 			msg += "Arrocco non possibile (CASTLE_ERROR)";
 		else if(errCode == TURN_NUMBER_ERROR)
 			msg += "Il numero di turno indicato non è corretto (TURN_NUMBER_ERROR)";
 		else if(errCode == PREAMBLE_NOT_POSSIBLE_ERROR)
 			msg += "Il prembolo non è formulato correttamente (PREAMBLE_NOT_POSSIBLE_ERROR)";
 		else if(errCode == PREAMBLE_DRAW_ERROR)
 			msg += "Il preambolo parte da una situazione di partita patta (PREAMBLE_DRAW_ERROR)";
 		else if(errCode == STARTING_KING_CHECK_ERROR)
 			msg += "Il re del secondo giocatore parte da una situazione di scacco (STARTING_KING_CHECK_ERROR)";
 		else if(errCode == STARTING_TURN_ERROR)
 			msg += "Il colore di chi iniza non è corretto (STARTING_TURN_ERROR)";
 		else if(errCode == IMPOSSIBLE_MOVE_ERROR)
 			msg += "Nessun pezzo può compiere questa mossa (IMPOSSIBLE_MOVE_ERROR)";
 		else if(errCode == LAST_TURN_ERROR)
 			msg += "La partita era già terminata al turno precedente (LAST_TURN_ERROR)";
		
 		errors.add(msg);
	}
	
	//WARNING PER NOTAZIONE NON COMPLETAMENTE ABBREVIATA
	void addWarning (int warnCode, Token tk, char c, int turn) {
		String color = "bianco";
		if (c == 'B') color = "nero";
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		String msg = "Warning al turno "+ turn + " del giocatore " + color +":\t";
		
		if (warnCode == NOTATION_WARNING)
			msg += "La notazione può essere abbreviata ulteriormente";

		warnings.add (msg);
	}

}
