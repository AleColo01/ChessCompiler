package chessPackage;

public class Checker {
	private String lastMove = "";
	protected boolean kingGivedUp = false;
	protected boolean enpassant = false;
	protected boolean notUnique = false;
	
    public Checker() {}

    public boolean movePiece(ChessboardPanel cp, String move, char turn) {    	
    	/*
    	 * CASTLING: see handleCastling
    	 */
        if (move.equals("O-O") || move.equals("O-O-O")) {
            handleCastling(cp, move, turn);
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
        char promotion = '_';
        if (move.charAt(move.length() - 2) == '=') {
            promotion = move.charAt(move.length() - 1);
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
        char piece = '_';
        char colFrom = '_';
        char rowFrom = '_';
        char colTo = '_';
        char rowTo = '_';
        if (move.length() == 6) { //long notation (all info)
            colFrom = move.charAt(1);
            rowFrom = move.charAt(2);
            colTo = move.charAt(4);
            rowTo = move.charAt(5);
        } else {
            if (move.length() == 3) { //short notation (piece and destination)
                piece = move.charAt(0);
                colTo = move.charAt(1);
                rowTo = move.charAt(2);
            } else if (move.length() == 4) { //short notation (piece and destination + one starting info)
                piece = move.charAt(0);
                if (Character.isDigit(move.charAt(1))) {
                    rowFrom = move.charAt(1);
                } else if (move.charAt(1) != 'x' && move.charAt(1) != ':') {
                    colFrom = move.charAt(1);
                }
                colTo = move.charAt(2);
                rowTo = move.charAt(3);
            } else if (move.length() == 5) { 
                piece = move.charAt(0);
                if (move.charAt(2) == 'x' || move.charAt(2) == ':') { //short notation (piece and destination + one starting info)
                    colFrom = move.charAt(1);
                } else {					//short notation (full info)
                    colFrom = move.charAt(1);
                    rowFrom = move.charAt(2);
                }
                colTo = move.charAt(3);
                rowTo = move.charAt(4);
            }
        }

        
    	/*
    	 * CALCULATE MISSING INFO ( rowFrom and colFrom )
    	 */
        int fromColIndex = -1;
        int fromRowIndex = -1;
        int toColIndex = -1;
        int toRowIndex = -1;
        if (colFrom != '_') fromColIndex = colFrom - 'a';
        if (rowFrom != '_') fromRowIndex = 7 - (Character.getNumericValue(rowFrom) - 1);
        if (colTo != '_') toColIndex = colTo - 'a';
        if (rowTo != '_') toRowIndex = 7 - (Character.getNumericValue(rowTo) - 1);

        int[] res = calculateMissingInfo(fromColIndex,fromRowIndex,toColIndex,toRowIndex,piece,turn,cp);
        
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

        cp.getBoard()[fromRowIndex][fromColIndex] = "";
        if (promotion != '_') cp.getBoard()[toRowIndex][toColIndex] = promotion + "" + turn;
        else cp.getBoard()[toRowIndex][toColIndex] = piece + "" + turn;

        cp.repaint();
        
    	/*
    	 * SAVE LAST MOVE
    	 */
        if (fromColIndex != -1) colFrom = (char) ('a' + fromColIndex);
        if (toColIndex != -1) colTo = (char) ('a' + toColIndex);
        if (fromRowIndex != -1) rowFrom = (char) ('8' - fromRowIndex);
        if (toRowIndex != -1) rowTo = (char) ('8' - toRowIndex);
        lastMove = piece+""+colFrom+""+rowFrom+"-"+colTo+""+rowTo;
        return true;
    }

    
    protected void setLastMove(String move) {
    	lastMove = move;
    }
    
	/*
	 * HANDLE CASTLING 
	 */
    public void handleCastling(ChessboardPanel cp, String move, char turn) {
        if (move.equals("O-O")) { //short castle
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
            cp.repaint();
            return;
        } else if (move.equals("O-O-O")) { //long castle
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
            cp.repaint();
            return;
        }
    }

	/*
	 * Check if with the current chessboard, the selected piece can move to the destination.
	 */
    public boolean canReach(ChessboardPanel cp, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo, boolean checkGiveupKing) {
    	//if the ally king is checked after this move, it is invalid
    	if(checkGiveupKing && giveupKing(cp, turn, piece, rowFrom, colFrom, rowTo, colTo)) return false;
        
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
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 0 && cp.getBoard()[rowTo][colTo].equals("")) {
                    accepted = true;
                }
               //Move forward by two steps, only first move of each piece
                if (Math.abs(rowTo - rowFrom) == 2 && Math.abs(colTo - colFrom) == 0 && cp.getBoard()[rowTo][colTo].equals("")) {
                    if (turn == 'B' && rowFrom != 1) {
                        return false;
                    }
                    if (turn == 'W' && rowFrom != 6) {
                        return false;
                    }
                    //check if no piece is in between cellFrom and cellTo
                    if (rowTo > rowFrom) {
                        if (cp.getBoard()[rowTo - 1][colTo].equals("")) {
                            accepted = true;
                        }
                    } else {
                        if (cp.getBoard()[rowTo + 1][colTo].equals("")) {
                            accepted = true;
                        }
                    }

                }
                break;
            case 'R': //ROOK
            	//If the tower is moving vertically, check none is in between
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
                	    if (!cp.getBoard()[rowTo][c].equals("")) {
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
                	    if (!cp.getBoard()[r][colTo].equals("")) {
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
            	        if (!cp.getBoard()[r][c].equals("")) {
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
                            if (!cp.getBoard()[rowTo][c].equals("")) {
                                return false;
                            }
                        }
                    } else {
                        for (int c = colTo + 1; c <= colFrom - 1; c++) {
                            if (!cp.getBoard()[rowTo][c].equals("")) {
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
                            if (!cp.getBoard()[r][colTo].equals("")) {
                                return false;
                            }
                        }
                    } else {
                        for (int r = rowTo + 1; r <= rowFrom - 1; r++) {
                            if (!cp.getBoard()[r][colTo].equals("")) {
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
            	        if (!cp.getBoard()[r][c].equals("")) {
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
                            if (cp.getBoard()[r][c].endsWith(""+oppositeTurn(turn)) && canTake(cp, oppositeTurn(turn), cp.getBoard()[r][c].charAt(0), r, c, rowTo, colTo,true)) {
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
            if (cp.getBoard()[rowTo][colTo].equals("")) return true;
            else if (cp.getBoard()[rowTo][colTo].endsWith(""+oppositeTurn(turn))) return true;
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
    public boolean canTake(ChessboardPanel cp, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo, boolean checkGiveupKing) {
    	//if the ally king is checked after this move, it is invalid
    	if(piece != 'K' && checkGiveupKing && giveupKing(cp, turn, piece, rowFrom, colFrom, rowTo, colTo)) return false;
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
                        if (cp.getBoard()[rowTo][colTo].endsWith("W"))  {
                        	return true;
                        }
                        //EN PASSANT: check if last move was a pawn moving through that cell
                        if(lastMove.equals("P"+colonna+"2-"+colonna+"4")) {
                        	enpassant = true;
                        	cp.getBoard()[4][colTo] = "";
                        	return true;
                        }
                    }
                    if (turn == 'W') { //White
                    	//normal capture
                        if (cp.getBoard()[rowTo][colTo].endsWith("B"))              
                        	return true;
                      //EN PASSANT: check if last move was a pawn moving through that cell
                        if(lastMove.equals("P"+colonna+"7-"+colonna+"5")) {
                        	cp.getBoard()[3][colTo] = "";
                        	enpassant = true;
                        	return true;
                        }
                    }
                    //If it's empty it's not capturing anything
                    if (cp.getBoard()[rowTo][colTo].equals("")) return false;
                }          
                break;
            //For everything else is the same as canReach
            case 'R':
                return canReach(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'N':
                return canReach(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'B':
                return canReach(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'Q':
                return canReach(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
            case 'K':
                return canReach(cp, turn, piece, rowFrom, colFrom, rowTo, colTo, false);
        }
        return false;
    }
    
    
    
    //Check if this move will put the ally King is check by some enemy piece
    protected boolean giveupKing(ChessboardPanel cp, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo) { 
    	//get ally king position
    	int kingRow;
    	int kingCol;
    	//If is the king that wants to move
    	if(cp.getBoard()[rowFrom][colFrom].startsWith("K")) {
    		kingRow = rowTo;
    	 	kingCol = colTo;
    	} else {
    		int pos[] = new int[2];
        	pos = kingPosition(cp,turn);
        	kingRow = pos[0];
        	kingCol = pos[1];
    	}
    	 	
    	//pretend to do the wanted move, to see what would happen.
    	//save old chessboard state.
    	String oldPosition = cp.getBoard()[rowTo][colTo];
    	char oldTurn = cp.getBoard()[rowFrom][colFrom].charAt(1);
    	cp.getBoard()[rowFrom][colFrom] = "";
    	cp.getBoard()[rowTo][colTo] = ""+piece+turn;  	

        for (int r = 0; r < 8; r++) {
        	for (int c = 0; c < 8; c++) {
        		//check if any enemy piece can reach the ally king
        		if(!cp.getBoard()[r][c].equals("") && cp.getBoard()[r][c].charAt(1)!=turn)
        		if(!cp.getBoard()[r][c].equals("") && cp.getBoard()[r][c].charAt(1)!=turn && canTake(cp, oppositeTurn(turn), cp.getBoard()[r][c].charAt(0), r, c, kingRow, kingCol, false)) {
        	        //restore chessboard to old state
        			cp.getBoard()[rowFrom][colFrom] = ""+piece+oldTurn;
                    cp.getBoard()[rowTo][colTo] = oldPosition;
                    kingGivedUp = true;
                	return true;	
                }
             }
        }

        //restore chessboard to old state
        cp.getBoard()[rowFrom][colFrom] = ""+piece+oldTurn;
        cp.getBoard()[rowTo][colTo] = oldPosition;
    	return false;
    }
    
    
    
    //Search for ally king position
    protected int[] kingPosition(ChessboardPanel cp, char turn) {
    	int pos[] = new int[2];
         for (int r = 0; r < 8; r++) {
              for (int c = 0; c < 8; c++) {
            	  if(cp.getBoard()[r][c].equals("K"+turn)) {
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
    protected int[] calculateMissingInfo(int colFrom, int rowFrom, int colTo, int rowTo, char piece, char turn, ChessboardPanel cp) {
    	if (colFrom == -1 && rowFrom == -1) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                	if (cp.getBoard()[r][c].equals("" + piece + turn) 
                    		&& ((canReach(cp, turn, piece, r, c, rowTo, colTo, true) 
                    				|| canTake(cp, turn, piece, r, c, rowTo, colTo, true))) ) {
                		notUnique = true;
                        colFrom = c;
                        rowFrom = r;
                        break;
                    }
                }
            }
        } else if (colFrom == -1) {
            for (int c = 0; c < 8; c++) {
                if (cp.getBoard()[rowFrom][c].equals("" + piece + turn) 
                		&& (canReach(cp, turn, piece, rowFrom, c, rowTo, colTo, true) 
                				|| canTake(cp, turn, piece, rowFrom, c, rowTo, colTo,true))) {
                    colFrom = c;
                    break;
                }
            }
        } else if (rowFrom == -1) {
            for (int r = 0; r < 8; r++) {
                if (cp.getBoard()[r][colFrom].equals("" + piece + turn) 
                		&& (canReach(cp, turn, piece, r, colFrom, rowTo, colTo, true) 
                				|| canTake(cp, turn, piece, r, colFrom, rowTo, colTo,true))) {
                    rowFrom = r;
                    break;
                }
            }
        }
        int[] res = new int[2];
        res[0] = rowFrom;
        res[1] = colFrom;
    	return res;
    }
}
