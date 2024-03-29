package compilerPackage;
import org.antlr.runtime.Token;

import chessPackage.Checker;
import chessPackage.ChessboardPanel;

public class compilerChecker extends Checker {
	public ChessboardPanel cp;
	private int preambleCount = 0;
	public char turn = 'W'; 
	public int actualTurn = 0;
	int wKing=0, bKing=0;
	
	//resetted each turn
	private char piece; 
	private int rowTo; 
	private int colTo;
	private int rowFrom; 
	private int colFrom; 
	private char take; // x : to take, - to divide in extended notation
	private String castle;
	private char promotion;
	private boolean enpassant;
	private int checks;
	private boolean checkMate;
	private int turnNumber;
	private int[] wKingPos = new int[2];
	private int[] bKingPos = new int[2];
	
	//notation
	private boolean missingCol;
	private boolean missingRow;
	
	//past moves
	private String lastMove = "";
	
	//moved piece for castle
	//TODO check if they are moved and change this
	private boolean movedKB = false; //king black
	private boolean movedRBlong = false; //rook black for long castle
	private boolean movedRBshort = false; //rook black for short castle
	private boolean movedKW = false; //king white
	private boolean movedRWlong = false;//rook white for long castle
	private boolean movedRWshort = false;//rook white for short castle
	

	
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
	
	public boolean processMove(){
		boolean flagValid = true;
		
		//CALCOLA INFO MANCANTI
		if (colFrom == -1) missingCol = true;
		if (rowFrom == -1) missingRow = true;
		
		//eccezione con pedino che mangia (exf4) in cui la e è superflua ma mandatoria
		if((take == 'x' || take == ':') && piece == 0) {
			if(!missingCol && missingRow) missingCol = false;
		}
		
		if(piece == 0 && castle.equals("")) {
			piece = 'P';
		}
		
		int[] res = super.calculateMissingInfo(colFrom, rowFrom, colTo, rowTo, piece, turn, cp);
		colFrom = res[1];
		rowFrom = res[0];	
		
		//CALCOLA TUTTE LE CORRETTE IMPOSTAZIONI
		
		//indicatore di mangiate corretto
		if(take == 'x' || take == ':') {
			if(!checkTake() || cp.getBoard()[rowTo][colTo].equals("")) flagValid = false;
		}
			
		//non devo avere dubbi su quale pezzo muovere
		if(!isUnique()) flagValid = false;
		
		//il proprio re non sia sotto scacco
		if(super.giveupKing(cp, turn, piece, rowFrom, colFrom, rowTo, colTo)) flagValid = false;

		//indicatore di promozione corretto e valido
		if(promotion!=0 && !ispromotionValid()) flagValid = false;
		
		//indicatore numero di scacco corretto
    	int pos[] = new int[2];
    	pos = super.kingPosition(cp, oppositeTurn(turn));
    	int kingRow = pos[0];
    	int kingCol = pos[1];
		if(!checkMate && countChecks(turn,kingRow,kingCol) != checks ) flagValid = false;
		
		//indicatore scacco matto corretto
		if(checkMate && countChecks(turn,kingRow,kingCol) > 0 && canKingMove() ) flagValid = false;
		
		//indicatore en passant corretto e valido
		if (!isenpassantValid()) flagValid = false;
		
		//indicatore castle
		if (!castle.equals("") && !iscastleValid()) flagValid = false;
		
		//no notazione superflua (no indicare colonne o righe non necessarie)
		if ( !isnotationCorrect()) flagValid = false;
		
		if(flagValid)
			updateChessboard();
		
		//RESETTA TUTTE LE VARIABILI
		reset();
		turn = super.oppositeTurn(turn);
		lastMove = piece+""+colFrom+""+rowFrom+"-"+colTo+""+rowTo;
		return flagValid;
	}
	
	private void updateChessboard() {
		if(!castle.equals(""))
			handleCastling();
		else {
			cp.getBoard()[rowFrom][colFrom] = "";
	    	if (promotion != 0) cp.getBoard()[rowTo][colTo] = promotion + "" + turn;
	        else cp.getBoard()[rowTo][colTo] = piece + "" + turn;
		}
		
		//STAMPA SCACCHIERA
//		for (int r = 0; r < 8; r++) {
//            for (int c = 0; c < 8; c++) {
//            	System.out.print(cp.getBoard()[r][c]);
//            	System.out.print(" | ");
//            }
//            System.out.println("");
//        }	
	}
	
	
	
	 private void handleCastling() {
	        if (castle.equals("O-O")) { //short castle
	            if (turn == 'W') { // white side
	                cp.getBoard()[7 - 0][4] = "";
	                cp.getBoard()[7 - 0][6] = "KW";
	                cp.getBoard()[7 - 0][7] = "";
	                cp.getBoard()[7 - 0][5] = "RW";
	            } else { // black side
	            	cp.getBoard()[7 - 7][4] = "";
	            	cp.getBoard()[7 - 7][6] = "KB";
	            	cp.getBoard()[7 - 7][7] = "";
	            	cp.getBoard()[7 - 7][5] = "RB";
	            }
	            return;
	        } else if (castle.equals("O-O-O")) { //long castle
	            if (turn == 'W') { // white side
	            	cp.getBoard()[7 - 0][4] = "";
	            	cp.getBoard()[7 - 0][2] = "KW";
	            	cp.getBoard()[7 - 0][0] = "";
	            	cp.getBoard()[7 - 0][3] = "RW";
	            } else { // black side
	            	cp.getBoard()[7 - 7][4] = "";
	            	cp.getBoard()[7 - 7][2] = "KB";
	            	cp.getBoard()[7 - 7][0] = "";
	            	cp.getBoard()[7 - 7][3] = "RB";
	            }
	        }
	    }
	 
	private boolean isnotationCorrect(){
		boolean flagValidC = false;
		boolean flagValidR = false;
		
		if(!missingCol) {
            for (int c = 0; c < 8; c++) {
        		if(c!=colFrom && !cp.getBoard()[rowFrom][c].equals("") && cp.getBoard()[rowFrom][c].charAt(1)==piece && cp.getBoard()[rowFrom][c].charAt(1)==turn && (canTake(cp, turn, piece, rowFrom, c, rowTo, colTo, true) || canReach(cp, turn, piece, rowFrom, c, rowTo, colTo, true))) {
        			flagValidC = true;
        		}
            }
		}else {
			flagValidC = true;
		}
		
		
		if(!missingRow) {
            for (int r = 0; r < 8; r++) {
        		if(r!=rowFrom && !cp.getBoard()[r][colFrom].equals("") && cp.getBoard()[r][colFrom].charAt(1)==piece && cp.getBoard()[r][colFrom].charAt(1)==turn && (canTake(cp, turn, piece, r, colFrom, rowTo, colTo, true) || canReach(cp, turn, piece, r, colFrom, rowTo, colTo, true))) {
        			flagValidR = true;
        		}
            }
		}else{
			flagValidR = true;
		}
		return (flagValidC && flagValidR);
	}
	
	private boolean iscastleValid() {
		boolean flagValid = false;
        if (turn == 'B' && countChecks(oppositeTurn(turn),0,4)==0) { //Black
    		cp.getBoard()[0][4] = "";
    		//long castle
    		if(castle.equals("long")) {
    			if(!movedKB && !movedRBlong 
    					&& cp.getBoard()[0][1].equals("") 
    					&& cp.getBoard()[0][2].equals("")
    					&& cp.getBoard()[0][3].equals("")) {
    				flagValid = true;
    			}
    		}
    		//short castle
    		else if(castle.equals("short")) {
    			if(!movedKB && !movedRBshort 
    					&& cp.getBoard()[0][5].equals("") && countChecks(oppositeTurn(turn),0,5)==0 
    					&& cp.getBoard()[0][6].equals("") && countChecks(oppositeTurn(turn),0,6)==0) {
    				flagValid = true;	
    			}	
    		}
    		cp.getBoard()[0][4] = "KB";
        }
        if (turn == 'W' && countChecks(oppositeTurn(turn),7,4)==0) { //White
    		cp.getBoard()[7][4] = "";
    		//long castle
    		if(castle.equals("long")) {
    			if(!movedKW && !movedRWlong     					
    					&& cp.getBoard()[7][1].equals("") && countChecks(oppositeTurn(turn),7,1)==0
    					&& cp.getBoard()[7][2].equals("") && countChecks(oppositeTurn(turn),7,2)==0
    					&& cp.getBoard()[7][3].equals("") && countChecks(oppositeTurn(turn),7,3)==0 ) {
    				flagValid = true;
    			}
    		}
    		//short castle
    		else if(castle.equals("short")) {
    			if(!movedKW && !movedRWshort 					
    					&& cp.getBoard()[7][5].equals("") && countChecks(oppositeTurn(turn),7,5)==0 
    					&& cp.getBoard()[7][6].equals("") && countChecks(oppositeTurn(turn),7,6)==0) {
    				flagValid = true;
    			}	
    		}
    		cp.getBoard()[7][4] = "KW";
        }
		return flagValid;
	}

	private boolean isenpassantValid() {
		if(enpassant && piece!='P') return false;
		if(!enpassant) return true;
		
		if(piece == 'P') {
            //accepted only if it's capturing a piece diagonally by one cell
            if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 1) {
            	//if it's not capturing it's false
                if (!cp.getBoard()[rowTo][colTo].equals(""))  {
                	return false;
                }
                char colonna = (char) ('a' + colTo);
                if (turn == 'B') { //Black
                    //EN PASSANT: check if last move was a pawn moving through that cell
                    if(lastMove.equals("P"+colonna+"2-"+colonna+"4")) {
                    	return true;
                    }
                }
                if (turn == 'W') { //White
                  //EN PASSANT: check if last move was a pawn moving through that cell
                    if(lastMove.equals("P"+colonna+"7-"+colonna+"5")) {
                    	return true;
                    }
                }
                //If it's empty it's not capturing anything
                if (cp.getBoard()[rowTo][colTo].equals("")) return false;
            }  
		}
		return false;
	}

	private boolean checkTake(){
		return super.canTake(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, true);
	}
	
	private boolean isUnique() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
            	if(cp.getBoard()[r][c].equals("" + piece + turn) 
            			&& (super.canTake(cp, turn, piece, r, c, rowTo, colTo, true) || super.canReach(cp, turn, piece, r, c, rowTo, colTo, true)) 
            			&& (r!=rowFrom || c!=colFrom)) { 
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
	
	private int countChecks(char turn, int kingRow, int kingCol) {
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

	public boolean isTurnCorrect() {
		actualTurn = actualTurn + 1;
		if(actualTurn != turnNumber) {
			return false;
		}
		return true;
	}
	
	
	private void reset() {
		piece = 0; 
		rowFrom = -1; 
		colFrom = -1; 
		rowTo = -1; 
		colTo = -1; 
		take = 0; // x : to take, - to divide in extended notation
		castle = "";
		promotion = 0;
		enpassant = false;
		checks = 0;
		checkMate = false;
		missingCol = false;
		missingRow = false;
		turnNumber=0;
	}
	
	//Metodo per guardare se il turno è corretto
	public void setTurnNumber(Token t) {
		turnNumber = Integer.parseInt(t.getText());
	}
	
	//SET-GET METHODS
	public void setColTo(Token t) {
		colTo = t.getText().charAt(0) - 'a';
	}
	
	public void setRowTo(Token t) {
		int rowToTemp = 7 - (Integer.parseInt(t.getText()) - 1);
		if(rowToTemp >= 0 || rowToTemp <= 7 ) rowTo = rowToTemp;
	}
	
	public void setColFrom(Token t) {
		colFrom = t.getText().charAt(0) - 'a';
	}
	
	public void setRowFrom(Token t) {
		rowFrom = 7 - (Integer.parseInt(t.getText()) - 1);
	}
	
	public void setPiece(Token t) {
		piece = t.getText().charAt(0);
	}
	
	public void setPromotion(Token t) {
		promotion = t.getText().charAt(0);
	}
	
	public void setTake(Token t) {
		take = t.getText().charAt(0);
	}
	
	public void setEnpassant() {
		enpassant = true;
	}
	
	public void setCheckMate() {
		checkMate = true;
	}
	
	public void setChecks() {
		checks =checks + 1;
	}
	
	public void setCastle(int i) {
		if(i==1)
			castle="O-O";
		else
			castle="O-O-O";
	}
	
	public void setPrambleStartTurn(Token t) {
		if(preambleCount==0) {
			if(t.getText().equals("black")) {
				turn='B';
				preambleCount++;
				setChessboardEmpty();
			}
		}
	}
	
	private void setChessboardEmpty() {
		for (int r = 0; r < 8; r++) {
	        for (int c = 0; c < 8; c++) {
	        	cp.getBoard()[r][c]="";
	        }
	    }
	}
	
	
	//CHECKS OF PREAMBLE
	//chiamata ad ogni pezzo piazzato nel preambolo
	public boolean checkPreamblePlacement(Token p,Token t,Token r, Token c) {
		int row = 8 - Integer.parseInt(r.getText());
		int col = c.getText().charAt(0) - 'a';
		if(cp.getBoard()[row][col].equals("")) {
			cp.getBoard()[row][col]=""+p.getText()+t.getText().toUpperCase().charAt(0);
			return true;
		}
		return false;
	}
	
	
	//Chiamata alla fine di entrambi i preamboli
	public boolean checkChessboard() {
		
    //Non c'è situazione di stallo (controlla anche che ci siano esattamente due re)
		if(isDraw()) return false;
		
	//Only one king for player
		if(wKing!=1 || bKing!=1) return true;
				
	 //Il re che non parte non deve essere in scacco
        if(oppositekingIsInCheck(turn)) return false;
        
        return true;
	}
	

	
	private boolean isDraw() {
		int wKnight=0, bKnight=0, wBishop=0, bBishop=0,wBishop_ws=0, wBishop_bs=0,bBishop_ws=0, bBishop_bs=0, noDrawPiece=0, totalPiece=0, canMovePiece=0;
		
		for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
            	if(!(cp.getBoard()[r][c].equals(""))) {
	            	if(cp.getBoard()[r][c].equals("KW")) { 
	            		wKing++;
	            	//Memorizing white kings position
	            		wKingPos[0]=r;
	            		wKingPos[1]=c;
	            	}
	            	else if(cp.getBoard()[r][c].equals("KB")) { 
	            		bKing++;
	            	//Memorizing black kings position
	            		bKingPos[0]=r;
	        			bKingPos[1]=c;
	            	}
	            	else if(cp.getBoard()[r][c].equals("WN")) wKnight++;
	            	else if(cp.getBoard()[r][c].equals("BN")) bKnight++;
	            	else if(cp.getBoard()[r][c].equals("BW")) { 
	            		wBishop++;
	            		if(isWhiteSquare(r+1,c+1)) wBishop_ws++;
	            		else wBishop_bs++;}
	            	else if(cp.getBoard()[r][c].equals("BB")) { 
	            		bBishop++;
	            		if(isWhiteSquare(r+1,c+1)) bBishop_ws++;
	            		else bBishop_bs++;}
	            	else
	            		noDrawPiece++;
	            	totalPiece++;
	            	if(canMovePiece==0 && cp.getBoard()[r][c].charAt(1)==turn && canMove(cp.getBoard()[r][c].charAt(0),cp.getBoard()[r][c].charAt(1),r,c))
	            		canMovePiece++;
            	}
            }
        }	
				
		if(canMovePiece==0)	return true;
		
		//King vs King
        if (totalPiece == 2) {
            return true;
        }

        if(noDrawPiece == 0) {
        	//King and knight vs king
	        if (wBishop == 0 && bBishop == 0 && ((wKnight == 1 && bKnight == 0) || (wKnight == 0 && bKnight == 1))) 
	            return true;
	        
        	if(wKnight == 0 && bKnight == 0) {
		        //King and bishop vs king
		        if ((wBishop == 1 && bBishop == 0) || (wBishop == 0 && bBishop == 1)) {
		        	return true;
		        }
		
		        //King and bishop vs king with bishop of the same color of the other player
		        if (wBishop==1 && bBishop==1 && ((wBishop_ws == 1 && bBishop_ws == 1) || (wBishop_bs == 1 && bBishop_bs == 1))) 
		            return true;
        	}
        }
        
        //There isn't draw situation
        return false;
	}
	
	//Check if the king is on check
	private boolean oppositekingIsInCheck(char turn) {
		for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
            	if(!(cp.getBoard()[r][c].equals("")) && cp.getBoard()[r][c].charAt(1)==turn) {
            		if(turn=='W' && super.canTake(cp, turn, cp.getBoard()[r][c].charAt(0), r, c, bKingPos[0], bKingPos[1], true)) 
            			return true;
            		else if(turn=='B' && super.canTake(cp, turn, cp.getBoard()[r][c].charAt(0), r, c, wKingPos[0], wKingPos[1], true)) 
            			return true;
            	}
            }
		}
		return false;
	}
	
	
	private boolean isWhiteSquare(int row, int col) {
        return (row + col) % 2 == 0;
    }
	
	public boolean canMove(char piece, char turn, int rowFrom, int colFrom) {
		for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
            	if(super.canReach(cp, turn, piece, rowFrom, colFrom, r, c, true))
            		return true;
            }
		}
		return false;
	}

	//check correct starting turn
		public boolean checkCorrectStartingTurn(){
			return (turn == 'B');
		}
		
}