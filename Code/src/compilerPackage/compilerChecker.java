package compilerPackage;
import chessPackage.Checker;
import chessPackage.ChessboardPanel;

public class compilerChecker extends Checker {
	public ChessboardPanel cp;
	public char turn = 'W'; 
	
	private char piece; 
	private int rowTo; 
	private int colTo;
	private int rowFrom; 
	private int colFrom; 
	private char take; // x : to take, - to divide in extended notation
	private boolean castle;
	private char promotion;
	private boolean enpassant;
	private int checks;
	private boolean checkMate;
	
	public compilerChecker() {
        	String[][] initialBoard = {
                    {"RB", "NB", "BB", "QB", "KB", "BB", "NB", "RB"},
                    {"PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB"},
                    {"", "", "", "", "", "", "", ""},
                    {"", "", "", "", "", "", "", ""},
                    {"", "", "", "", "", "", "", ""},
                    {"", "", "", "", "", "", "", ""},
                    {"PW", "PW", "PW", "PW", "PW", "PW", "PW", "PW"},
                    {"RW", "NW", "BW", "QW", "KW", "BW", "NW", "RW"}
            };
        
       cp = new ChessboardPanel(initialBoard);
       reset();
	}

	/*
	 * Ad ogni mossa controllare:
	 * ??- mantenere sempre la stessa dicitura
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
		if(!isUnique()) flagValid = false;
		
		//il proprio re non sia sotto scacco
		if(super.giveupKing(cp, turn, piece, rowFrom, colFrom, rowTo, colTo)) flagValid = false;
		
		//indicatore di promozione corretto e valido
		if(!ispromotionValid()) flagValid = false;
		
		//indicatore numero di scacco corretto
		if( countChecks() != checks ) flagValid = false;
		
		//indicatore scacco matto corretto
		if( checks > 0 && canKingMove() ) flagValid = false;
		
		//RESETTA TUTTO
		reset();
		turn = super.oppositeTurn(turn);
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
	
	private boolean ispromotionValid(){
		if(piece != 'P') return false;
		if(promotion != 'Q' && promotion != 'R' && promotion != 'B' && promotion != 'N') return false;
		if(turn == 'B' && rowTo != 7) return false;
		if(turn == 'W' && rowTo != 0) return false;
		return true;
	}
	
	private int countChecks() {
    	//get enemy king position
    	int pos[] = new int[2];
    	pos = super.kingPosition(cp, oppositeTurn(turn));
    	int kingRow = pos[0];
    	int kingCol = pos[1];
    	
		int checks = 0;
		for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
        		if(!cp.getBoard()[r][c].equals("") && cp.getBoard()[r][c].charAt(1)==turn && canTake(cp, turn, cp.getBoard()[r][c].charAt(0), r, c, kingRow, kingCol, false)) {
        			checks++;
        		}
            }
        }		
		return checks;
	}
	
	private boolean canKingMove(){
    	//get ally king position
    	int pos[] = new int[2];
    	pos = super.kingPosition(cp, turn);
    	int kingRow = pos[0];
    	int kingCol = pos[1];
    	
    	int startingR = -1;
    	int finalR = 1;
    	int startingC = -1;
    	int finalC = 1;
    	
    	if(kingRow == 0) startingR = 0;
    	if(kingRow == 7) finalR = 0;
    	if(kingCol == 0) startingC = 0;
    	if(kingCol == 7) finalC = 0;
    	
		for (int r = kingRow + startingR; r <= kingRow + finalR; r++) {
            for (int c = kingCol + startingC; c <= kingCol + finalC; c++) {
        		if(canReach(cp, turn, 'K', kingRow, kingCol, r, c, false)) {
        			return true;
        		}
            }
        }	
		
		return false;
	}

	
	private void reset() {
		piece = 0; 
		rowFrom = -1; 
		colFrom = -1; 
		rowTo = -1; 
		colTo = -1; 
		take = 0; // x : to take, - to divide in extended notation
		castle = false;
		promotion = 0;
		enpassant = false;
		checks = 0;
		checkMate = false;
	}
    
}
