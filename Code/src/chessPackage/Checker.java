package chessPackage;

public class Checker {
	private String lastMove = "";
	
    public Checker() {}

    public boolean movePiece(ChessboardPanel chessboardPanel, String move, char turn) {
    	/*
    	 * CASTLING: see handleCastling
    	 */
        if (move.equals("O-O") || move.equals("O-O-O")) {
            handleCastling(chessboardPanel, move, turn);
            return true;
        }

    	/*
    	 * REMOVE CHECKS: move is not influenced by checks
    	 */
        while (move.endsWith("+") || move.endsWith("#")) {
            move = move.substring(0, move.length() - 1);
        }

    	/*
    	 * ADD PIECE if not explicit
    	 */
        char[] Pieces = {'P', 'R', 'N', 'B', 'Q', 'K'};

        boolean checkChar = false;
        for (char c : Pieces) {
            if (c == move.charAt(0)) {
                checkChar = true;
                break;
            }
        }
        if (!checkChar) {
            move = "P" + move;
        }

    	/*
    	 * SAVE PROMOTION 
    	 */
        char promoted = '_';
        if (move.charAt(move.length() - 2) == '=') {
            promoted = move.charAt(move.length() - 1);
            move = move.substring(0, move.length() - 2);
        }

    	/*
    	 * REMOVE EN PASSANT: not necessary
    	 */
        if (move.endsWith("ep")) {
            move = move.substring(0, move.length() - 3);
        }

    	/*
    	 * GET GIVEN INFO ABOUT MOVE: piece, starting and destination
    	 */
        char pieceType = '_';
        char fromCol = '_';
        char fromRow = '_';
        char toCol = '_';
        char toRow = '_';
        if (move.length() == 6) { //long notation (all info)
            fromCol = move.charAt(1);
            fromRow = move.charAt(2);
            toCol = move.charAt(4);
            toRow = move.charAt(5);
        } else {
            if (move.length() == 3) { //short notation (piece and destination)
                pieceType = move.charAt(0);
                toCol = move.charAt(1);
                toRow = move.charAt(2);
            } else if (move.length() == 4) { //short notation (piece and destination + one starting info)
                pieceType = move.charAt(0);
                if (Character.isDigit(move.charAt(1))) {
                    fromRow = move.charAt(1);
                } else if (move.charAt(1) != 'x' && move.charAt(1) != ':') {
                    fromCol = move.charAt(1);
                }
                toCol = move.charAt(2);
                toRow = move.charAt(3);
            } else if (move.length() == 5) { 
                pieceType = move.charAt(0);
                if (move.charAt(2) == 'x' || move.charAt(2) == ':') { //short notation (piece and destination + one starting info)
                    fromCol = move.charAt(1);
                } else {					//short notation (full info)
                    fromCol = move.charAt(1);
                    fromRow = move.charAt(2);
                }
                toCol = move.charAt(3);
                toRow = move.charAt(4);
            }
        }

        
    	/*
    	 * CALCULATE MISSING INFO ( rowFrom and colFrom )
    	 */
        int fromColIndex = -1;
        int fromRowIndex = -1;
        int toColIndex = -1;
        int toRowIndex = -1;
        if (fromCol != '_') fromColIndex = fromCol - 'a';
        if (fromRow != '_') fromRowIndex = 7 - (Character.getNumericValue(fromRow) - 1);
        if (toCol != '_') toColIndex = toCol - 'a';
        if (toRow != '_') toRowIndex = 7 - (Character.getNumericValue(toRow) - 1);

        int[] res = calculateMissingInfo(fromColIndex,fromRowIndex,toColIndex,toRowIndex,pieceType,turn,chessboardPanel);
        
        fromColIndex = res[1];
        fromRowIndex = res[0];
        
    	/*
    	 * PRINT INVALID MOVE
    	 */
        if (fromColIndex == -1 || fromRowIndex == -1) {
        	String name = "black";
        	if(turn == 'W') name = "white";
            System.out.println("Invalid move by " + name + ": " + move);
            return false;
        }

        chessboardPanel.getBoard()[fromRowIndex][fromColIndex] = "";
        if (promoted != '_') chessboardPanel.getBoard()[toRowIndex][toColIndex] = promoted + "" + turn;
        else chessboardPanel.getBoard()[toRowIndex][toColIndex] = pieceType + "" + turn;

        chessboardPanel.repaint();
        
    	/*
    	 * SAVE LAST MOVE
    	 */
        if (fromColIndex != -1) fromCol = (char) ('a' + fromColIndex);
        if (toColIndex != -1) toCol = (char) ('a' + toColIndex);
        if (fromRowIndex != -1) fromRow = (char) ('8' - fromRowIndex);
        if (toRowIndex != -1) toRow = (char) ('8' - toRowIndex);
        lastMove = pieceType+""+fromCol+""+fromRow+"-"+toCol+""+toRow;
        
        return true;
    }

	/*
	 * HANDLE CASTLING 
	 */
    public void handleCastling(ChessboardPanel chessboardPanel, String move, char turn) {
        if (move.equals("O-O")) { //short castle
            if (turn == 'W') { // white side
                chessboardPanel.getBoard()[7 - 0][4] = "";
                chessboardPanel.getBoard()[7 - 0][6] = "KW";
                chessboardPanel.getBoard()[7 - 0][7] = "";
                chessboardPanel.getBoard()[7 - 0][5] = "RW";
            } else { // black side
                chessboardPanel.getBoard()[7 - 7][4] = "";
                chessboardPanel.getBoard()[7 - 7][6] = "KB";
                chessboardPanel.getBoard()[7 - 7][7] = "";
                chessboardPanel.getBoard()[7 - 7][5] = "RB";
            }
            chessboardPanel.repaint();
            return;
        } else if (move.equals("O-O-O")) { //long castle
            if (turn == 'W') { // white side
                chessboardPanel.getBoard()[7 - 0][4] = "";
                chessboardPanel.getBoard()[7 - 0][2] = "KW";
                chessboardPanel.getBoard()[7 - 0][0] = "";
                chessboardPanel.getBoard()[7 - 0][3] = "RW";
            } else { // black side
                chessboardPanel.getBoard()[7 - 7][4] = "";
                chessboardPanel.getBoard()[7 - 7][2] = "KB";
                chessboardPanel.getBoard()[7 - 7][0] = "";
                chessboardPanel.getBoard()[7 - 7][3] = "RB";
            }
            chessboardPanel.repaint();
            return;
        }
    }

	/*
	 * Check if with the current chessboard, the selected piece can move to the destination.
	 */
    public boolean canReach(ChessboardPanel chessboardPanel, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo, boolean checkGiveupKing) {
    	//if the ally king is checked after this move, it is invalid
    	if(piece != 'K' && checkGiveupKing && giveupKing(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo)) return false;
        
    	boolean accepted = false;
        switch (piece) {
            case 'P': //PAWN
            	//Black can only move down
                if (turn == 'B' && rowTo <= rowFrom) { 
                    return false;
                }
                //White can only move up
                if (turn == 'W' && rowTo >= rowFrom) { 
                    return false;
                }
                //Move forward by one step
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 0 && chessboardPanel.getBoard()[rowTo][colTo].equals("")) {
                    accepted = true;
                }
               //Move forward by two steps, only first move of each piece
                if (Math.abs(rowTo - rowFrom) == 2 && Math.abs(colTo - colFrom) == 0 && chessboardPanel.getBoard()[rowTo][colTo].equals("")) {
                    if (turn == 'B' && rowFrom != 1) {
                        return false;
                    }
                    if (turn == 'W' && rowFrom != 6) {
                        return false;
                    }
                    //check if no piece is in between cellFrom and cellTo
                    if (rowTo > rowFrom) {
                        if (chessboardPanel.getBoard()[rowTo - 1][colTo].equals("")) {
                            accepted = true;
                        }
                    } else {
                        if (chessboardPanel.getBoard()[rowTo + 1][colTo].equals("")) {
                            accepted = true;
                        }
                    }

                }
                break;
            case 'R': //ROOK
            	//If the tower is moving vertically, check noone is in between
                if (Math.abs(rowTo - rowFrom) == 0 && colTo != colFrom) {
                	int startCol, endCol;
                	if (colTo > colFrom) {
                	    startCol = colFrom + 1;
                	    endCol = colTo - 1;
                	} else {
                	    startCol = colTo + 1;
                	    endCol = colFrom - 1;
                	}

                	for (int c = startCol; c <= endCol; c++) {
                	    if (!chessboardPanel.getBoard()[rowTo][c].equals("")) {
                	        return false;
                	    }
                	}
                    accepted = true;
                }
                //If the tower is moving horizontally, check none is in between
                else if (Math.abs(colTo - colFrom) == 0 && rowTo != rowFrom) {
                	int startRow, endRow;
                	if (rowTo > rowFrom) {
                	    startRow = rowFrom + 1;
                	    endRow = rowTo - 1;
                	} else {
                	    startRow = rowTo + 1;
                	    endRow = rowFrom - 1;
                	}

                	for (int r = startRow; r <= endRow; r++) {
                	    if (!chessboardPanel.getBoard()[r][colTo].equals("")) {
                	        return false;
                	    }
                	}
                	accepted = true;
                }
                break;
            case 'N': //KNIGHT
            	//Can move in a L-shape in any direction
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 2) {
                    accepted = true;
                }
                if (Math.abs(rowTo - rowFrom) == 2 && Math.abs(colTo - colFrom) == 1) {
                    accepted = true;
                }
                break;
            case 'B': //BISHOP
            	//Can move only diagonally, check none is in between
            	if (Math.abs(rowTo - rowFrom) == Math.abs(colTo - colFrom)) {
            	    int rowDiff = rowTo - rowFrom;
            	    int colDiff = colTo - colFrom;

            	    int rowStep = (rowDiff > 0) ? 1 : -1;
            	    int colStep = (colDiff > 0) ? 1 : -1;

            	    for (int r = rowFrom + rowStep, c = colFrom + colStep; r != rowTo; r += rowStep, c += colStep) {
            	        if (!chessboardPanel.getBoard()[r][c].equals("")) {
            	            return false; 
            	        }
            	    }
            	    accepted = true;
            	}
                break;
            case 'Q':
            	//Move as a Tower, vertically
                if (Math.abs(rowTo - rowFrom) == 0 && colTo != colFrom) {
                    if (colTo > colFrom) {
                        for (int c = colFrom + 1; c <= colTo - 1; c++) {
                            if (!chessboardPanel.getBoard()[rowTo][c].equals("")) {
                                return false;
                            }
                        }
                    } else {
                        for (int c = colTo + 1; c <= colFrom - 1; c++) {
                            if (!chessboardPanel.getBoard()[rowTo][c].equals("")) {
                                return false;
                            }
                        }
                    }
                    accepted = true;
                }
            	//Move as a Tower, horizontally
                else if (Math.abs(colTo - colFrom) == 0 && rowTo != rowFrom) {
                    if (rowTo > rowFrom) {
                        for (int r = rowFrom + 1; r <= rowTo - 1; r++) {
                            if (!chessboardPanel.getBoard()[r][colTo].equals("")) {
                                return false;
                            }
                        }
                    } else {
                        for (int r = rowTo + 1; r <= rowFrom - 1; r++) {
                            if (!chessboardPanel.getBoard()[r][colTo].equals("")) {
                                return false;
                            }
                        }
                    }
                    accepted = true;
                }
                //Move as a bishop
                else if (Math.abs(rowTo - rowFrom) == Math.abs(colTo - colFrom)) {
                	int rowDiff = rowTo - rowFrom;
            	    int colDiff = colTo - colFrom;

            	    int rowStep = (rowDiff > 0) ? 1 : -1;
            	    int colStep = (colDiff > 0) ? 1 : -1;

            	    for (int r = rowFrom + rowStep, c = colFrom + colStep; r != rowTo; r += rowStep, c += colStep) {
            	        if (!chessboardPanel.getBoard()[r][c].equals("")) {
            	            return false; 
            	        }
            	    }
            	    accepted = true;
                }
                break;
            case 'K': //KING
                if (Math.abs(rowTo - rowFrom) <= 1 && Math.abs(colTo - colFrom) <= 1 && (Math.abs(rowTo - rowFrom) + Math.abs(colTo - colFrom)) > 0) {
                    //Check it doesn't move in a protected cell
                	for (int r = 0; r < 8; r++) {
                        for (int c = 0; c < 8; c++) {
                            if (chessboardPanel.getBoard()[r][c].endsWith(""+oppositeTurn(turn)) && canTake(chessboardPanel, oppositeTurn(turn), chessboardPanel.getBoard()[r][c].charAt(0), r, c, rowTo, colTo,true)) {
                                return false;
                            }
                        }
                    }
                    accepted = true;
                }
                break;
        }
        
        //If the move is correct, check that the destination is either empty or there is an enemy piece
        if (accepted) { 
            if (chessboardPanel.getBoard()[rowTo][colTo].equals("")) return true;
            else if (chessboardPanel.getBoard()[rowTo][colTo].endsWith(""+oppositeTurn(turn))) return true;
        }
        
        //If it gets here, this piece cannot reach this destination
        return false;
    }

    
    /*
     * This method checks whether the selected piece on the current chessboard can capture a piece at the destination.
     * Unlike the 'canReach' method, this method is necessary to handle Pawns differently. 
     * It's essential to separate this functionality because we only need to evaluate where pieces can capture, 
     * not move, in order to determine if the king is in check. 
     * Hence, combining everything into a single method is not feasible.
     */
    public boolean canTake(ChessboardPanel chessboardPanel, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo, boolean checkGiveupKing) {
    	//if the ally king is checked after this move, it is invalid
    	if(piece != 'K' && checkGiveupKing && giveupKing(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo)) return false;
    	//If it's not moving, it's invalid
        if (rowFrom == rowTo && colFrom == colTo) return false;
        
        switch (piece) {
            case 'P': //PAWN
                if (turn == 'B' && rowTo <= rowFrom) { //cannot move up
                    return false;
                }
                if (turn == 'W' && rowTo >= rowFrom) { //cannot move down
                    return false;
                }
                //accepted only if it's capturing a piece diagonally by one cell
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 1) {
                    char colonna = (char) ('a' + colTo);
                    if (turn == 'B') { //Black
                    	//normal capture
                        if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("B"))  {
                        	return true;
                        }
                        //EN PASSANT: check if last move was a pawn moving through that cell
                        if(lastMove.equals("P"+colonna+"2-"+colonna+"4")) {
                        	chessboardPanel.getBoard()[4][colTo] = "";
                        	return true;
                        }
                    }
                    if (turn == 'W') { //White
                    	//normal capture
                        if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("N"))              
                        	return true;
                      //EN PASSANT: check if last move was a pawn moving through that cell
                        if(lastMove.equals("P"+colonna+"7-"+colonna+"5")) {
                        	chessboardPanel.getBoard()[3][colTo] = "";
                        	return true;
                        }
                    }
                    //If it's empty it's not capturing anything
                    if (chessboardPanel.getBoard()[rowTo][colTo].equals("")) return false;
                }          
                break;
            //For everything else is the same as canReach
            case 'R':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'N':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'B':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'Q':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'K':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
        }
        return false;
    }
    
    //Check if this move will put the ally King is check by some enemy piece
    protected boolean giveupKing(ChessboardPanel chessboardPanel, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo) { 
    	
    	//get ally king position
    	int pos[] = new int[2];
    	pos = kingPosition(chessboardPanel,turn);
    	int kingRow = pos[0];
    	int kingCol = pos[1];
    	
    	//pretend to do the wanted move, to see what would happen.
    	//save old chessboard state.
    	String oldPosition = chessboardPanel.getBoard()[rowTo][colTo];
    	char oldTurn = chessboardPanel.getBoard()[rowFrom][colFrom].charAt(1);
    	chessboardPanel.getBoard()[rowFrom][colFrom] = "";
    	chessboardPanel.getBoard()[rowTo][colTo] = ""+piece+turn;
    	
        for (int r = 0; r < 8; r++) {
        	for (int c = 0; c < 8; c++) {
        		//check if any enemy piece can reach the ally king
        		if(!chessboardPanel.getBoard()[r][c].equals("") && chessboardPanel.getBoard()[r][c].charAt(1)!=turn && canTake(chessboardPanel, oppositeTurn(turn), chessboardPanel.getBoard()[r][c].charAt(0), r, c, kingRow, kingCol, false)) {
        	        //restore chessboard to old state
        			chessboardPanel.getBoard()[rowFrom][colFrom] = ""+piece+oldTurn;
                    chessboardPanel.getBoard()[rowTo][colTo] = oldPosition;
                	return true;	
                }
             }
        }
        //restore chessboard to old state
        chessboardPanel.getBoard()[rowFrom][colFrom] = ""+piece+oldTurn;
        chessboardPanel.getBoard()[rowTo][colTo] = oldPosition;
    	return false;
    }
    
    //Search for ally king position
    protected int[] kingPosition(ChessboardPanel chessboardPanel, char turn) {
    	int pos[] = new int[2];
         for (int r = 0; r < 8; r++) {
              for (int c = 0; c < 8; c++) {
            	  if(chessboardPanel.getBoard()[r][c].equals("K"+turn)) {
            		  pos[0]=r;
            		  pos[1]=c;
            		  return pos;
            	  }
              }
         }
         return pos;
    }
    
    //Return opposite turn color
    protected char oppositeTurn(char turn) {
    	if(turn == 'W')
    		return 'B';
    	else return 'W';
    }
    
    /*
     * Search with piece could actually do the move, assuming the missing information.
     * This method scans for the whole chessboard until a piece returns true to canReach or canTake
     */
    protected int[] calculateMissingInfo(int fromColIndex, int fromRowIndex, int toColIndex, int toRowIndex, char pieceType, char turn, ChessboardPanel chessboardPanel) {
    	if (fromColIndex == -1 && fromRowIndex == -1) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                	if (chessboardPanel.getBoard()[r][c].equals("" + pieceType + turn) 
                    		&& (canReach(chessboardPanel, turn, pieceType, r, c, toRowIndex, toColIndex, true) 
                    				|| canTake(chessboardPanel, turn, pieceType, r, c, toRowIndex, toColIndex, true)) ) {
                        fromColIndex = c;
                        fromRowIndex = r;
                        break;
                    }
                }
            }
            System.out.println("--");
        } else if (fromColIndex == -1) {
            for (int c = 0; c < 8; c++) {
                if (chessboardPanel.getBoard()[fromRowIndex][c].equals("" + pieceType + turn) 
                		&& (canReach(chessboardPanel, turn, pieceType, fromRowIndex, c, toRowIndex, toColIndex, true) 
                				|| canTake(chessboardPanel, turn, pieceType, fromRowIndex, c, toRowIndex, toColIndex,true))) {
                    fromColIndex = c;
                    break;
                }
            }
        } else if (fromRowIndex == -1) {
            for (int r = 0; r < 8; r++) {
                if (chessboardPanel.getBoard()[r][fromColIndex].equals("" + pieceType + turn) 
                		&& (canReach(chessboardPanel, turn, pieceType, r, fromColIndex, toRowIndex, toColIndex, true) 
                				|| canTake(chessboardPanel, turn, pieceType, r, fromColIndex, toRowIndex, toColIndex,true))) {
                    fromRowIndex = r;
                    break;
                }
            }
        }
        int[] res = new int[2];
        res[0] = fromRowIndex;
        res[1] = fromColIndex;
    	return res;
    }
}
