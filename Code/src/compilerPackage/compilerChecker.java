package compilerPackage;
import chessPackage.Checker;
import chessPackage.ChessboardPanel;

public class compilerChecker extends Checker {
	public ChessboardPanel cp;
	public char turn = 'B'; 
	
	private char piece; 
	private int rowTo; 
	private int colTo;
	private int rowFrom; 
	private int colFrom; 
	private char take; // x : to take, - to divide in extended notation
	private boolean castle;
	private String promotion;
	private boolean enpassant;
	private int checks;
	private boolean checkMate;
	
	public compilerChecker() {
        	String[][] initialBoard = {
                {"TN", "CN", "AN", "DN", "RN", "AN", "CN", "TN"},
                {"PN", "PN", "PN", "PN", "PN", "PN", "PN", "PN"},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB"},
                {"TB", "CB", "AB", "DB", "RB", "AB", "CB", "TB"}
            };
        
       cp = new ChessboardPanel(initialBoard);
       reset();
	}

	/*
	 * Ad ogni mossa controllare:
	 * ??- mantenere sempre la stessa dicitura
	 * - indicatore di scacco/scacco matto corretto
	 * - indicatore di promozione corretto e valido
	 * - indicatore castle
	 * - no notazione superflua (no indicare colonne o righe non necessarie)
	 * - indicatore en passant corretto e valido
	 */
	
	public boolean processMove(){
		boolean flagValid = true;
		//CALCOLA INFO MANCANTI
		if(piece == 0 && !castle) {
			piece = 'P';
		}
		
		int[] res = super.calculateMissingInfo(colFrom, rowFrom, colTo, rowTo, piece, turn, cp);
		colFrom = res[1];
		rowFrom = res[0];	
		//CALCOLA TUTTE LE CORRETTE IMPOSTAZIONI
		
		//indicatore di mangiate corretto
		if(take == 'x' || take == ':') {
			if(!checkTake()) flagValid = false;
		}
		
		//non devo avere dubbi su quale pezzo muovere
		if(!isUnique()) flagValid =  false;
		
		//il proprio re non sia sotto scacco
		//if(super.giveupKing()) return false;
		
		//RESETTA TUTTO
		reset();
		turn = oppositeTurn();
		return flagValid;
	}
	
	private boolean checkTake(){
		return super.canTake(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, true);
	}
	
	private boolean isUnique() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
            	if(cp.getBoard()[r][c].equals("" + piece + turn) 
            			&& (super.canTake(cp, turn, piece, r, c, rowTo, colTo, true) || super.canReach(cp, turn, piece, r, c, rowTo, colTo, true)) 
            			&& (r!=rowFrom || c!=rowFrom)) { 
            		return false;
            	}
            }
        }
		return true;
	}
	
	private char oppositeTurn() {
		if (turn == 'B') return 'N';
		else return 'B';
		
	}
	
	private void reset() {
		piece = 0; 
		rowFrom = -1; 
		colFrom = -1; 
		rowTo = -1; 
		colTo = -1; 
		take = 0; // x : to take, - to divide in extended notation
		castle = false;
		promotion = "";
		enpassant = false;
		checks = 0;
		checkMate = false;
	}
    
}
