public class Checker {
	private String lastMove = "";
	
    public Checker() {}

    //TODO: en passant
    public boolean movePiece(ChessboardPanel chessboardPanel, String move, char turn) {
    	//CASTLING
        if (move.equals("O-O") || move.equals("O-O-O")) {
            handleCastling(chessboardPanel, move, turn);
            return true;
        }

        //REMOVE CHECKS
        while (move.endsWith("+") || move.endsWith("#")) {
            move = move.substring(0, move.length() - 1);
        }

        //ADD PIECES TYPE IF NOT EXPLICIT
        char[] Pieces = {'P', 'T', 'C', 'A', 'D', 'R'};

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

        //SAVE PROMOTION
        char promoted = '_';
        if (move.charAt(move.length() - 2) == '=') {
            promoted = move.charAt(move.length() - 1);
            move = move.substring(0, move.length() - 2);
        }

        //REMOVE EN PASSANT
        if (move.endsWith("ep")) {
            move = move.substring(0, move.length() - 3);
        }

        //CALCULATE TYPE, ORIGIN and DESTINATION
        char pieceType = '_';
        char fromCol = '_';
        char fromRow = '_';
        char toCol = '_';
        char toRow = '_';
        if (move.length() == 6) {
            fromCol = move.charAt(1);
            fromRow = move.charAt(2);
            toCol = move.charAt(4);
            toRow = move.charAt(5);
        } else {
            if (move.length() == 3) {
                pieceType = move.charAt(0);
                toCol = move.charAt(1);
                toRow = move.charAt(2);
            } else if (move.length() == 4) {
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
                if (move.charAt(2) == 'x' || move.charAt(2) == ':') {
                    fromCol = move.charAt(1);
                } else {
                    fromCol = move.charAt(1);
                    fromRow = move.charAt(2);
                }
                toCol = move.charAt(3);
                toRow = move.charAt(4);
            }
        }

        int fromColIndex = -1;
        int fromRowIndex = -1;
        int toColIndex = -1;
        int toRowIndex = -1;
        if (fromCol != '_') fromColIndex = fromCol - 'a';
        if (fromRow != '_') fromRowIndex = 7 - (Character.getNumericValue(fromRow) - 1);
        if (toCol != '_') toColIndex = toCol - 'a';
        if (toRow != '_') toRowIndex = 7 - (Character.getNumericValue(toRow) - 1);

        if (fromColIndex == -1 && fromRowIndex == -1) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    if (chessboardPanel.getBoard()[r][c].equals("" + pieceType + turn) && canReach(chessboardPanel, turn, pieceType, r, c, toRowIndex, toColIndex)) {
                        fromColIndex = c;
                        fromRowIndex = r;
                        break;
                    }
                    if (chessboardPanel.getBoard()[r][c].equals("" + pieceType + turn) && canTake(chessboardPanel, turn, pieceType, r, c, toRowIndex, toColIndex)) {
                        fromColIndex = c;
                        fromRowIndex = r;
                        break;
                    }
                }
            }
        } else if (fromColIndex == -1) {
            for (int c = 0; c < 8; c++) {
                if (chessboardPanel.getBoard()[fromRowIndex][c].equals("" + pieceType + turn) && canReach(chessboardPanel, turn, pieceType, fromRowIndex, c, toRowIndex, toColIndex)) {
                    fromColIndex = c;
                    break;
                }
                if (chessboardPanel.getBoard()[fromRowIndex][c].equals("" + pieceType + turn) && canTake(chessboardPanel, turn, pieceType, fromRowIndex, c, toRowIndex, toColIndex)) {
                    fromColIndex = c;
                    break;
                }
            }
        } else if (fromRowIndex == -1) {
            for (int r = 0; r < 8; r++) {
                if (chessboardPanel.getBoard()[r][fromColIndex].equals("" + pieceType + turn) && canReach(chessboardPanel, turn, pieceType, r, fromColIndex, toRowIndex, toColIndex)) {
                    fromRowIndex = r;
                    break;
                }
                if (chessboardPanel.getBoard()[r][fromColIndex].equals("" + pieceType + turn) && canTake(chessboardPanel, turn, pieceType, r, fromColIndex, toRowIndex, toColIndex)) {
                    fromRowIndex = r;
                    break;
                }
            }
        }
        
        if (fromColIndex == -1 || fromRowIndex == -1) {
            System.out.println("Non valida: " + turn + " " + move);
            return false;
        }

        String piece = chessboardPanel.getBoard()[fromRowIndex][fromColIndex];

        chessboardPanel.getBoard()[fromRowIndex][fromColIndex] = "";
        if (promoted != '_') chessboardPanel.getBoard()[toRowIndex][toColIndex] = promoted + "" + piece.charAt(1);
        else chessboardPanel.getBoard()[toRowIndex][toColIndex] = piece;

        chessboardPanel.repaint();
        
        //SAVE LAST MOVE
        if (fromColIndex != -1) fromCol = (char) ('a' + fromColIndex);
        if (toColIndex != -1) toCol = (char) ('a' + toColIndex);
        if (fromRowIndex != -1) fromRow = (char) ('8' - fromRowIndex);
        if (toRowIndex != -1) toRow = (char) ('8' - toRowIndex);
        lastMove = piece.charAt(0)+""+fromCol+""+fromRow+"-"+toCol+""+toRow;
        
        return true;
    }

    public void handleCastling(ChessboardPanel chessboardPanel, String move, char turn) {
        if (move.equals("O-O")) {
            if (turn == 'B') {
                chessboardPanel.getBoard()[7 - 0][4] = "";
                chessboardPanel.getBoard()[7 - 0][6] = "RB";
                chessboardPanel.getBoard()[7 - 0][7] = "";
                chessboardPanel.getBoard()[7 - 0][5] = "TB";
            } else {
                chessboardPanel.getBoard()[7 - 7][4] = "";
                chessboardPanel.getBoard()[7 - 7][6] = "RN";
                chessboardPanel.getBoard()[7 - 7][7] = "";
                chessboardPanel.getBoard()[7 - 7][5] = "TN";
            }
            chessboardPanel.repaint();
            return;
        } else if (move.equals("O-O-O")) {
            if (turn == 'B') {
                chessboardPanel.getBoard()[7 - 0][4] = "";
                chessboardPanel.getBoard()[7 - 0][2] = "RB";
                chessboardPanel.getBoard()[7 - 0][0] = "";
                chessboardPanel.getBoard()[7 - 0][3] = "TB";
            } else {
                chessboardPanel.getBoard()[7 - 7][4] = "";
                chessboardPanel.getBoard()[7 - 7][2] = "RN";
                chessboardPanel.getBoard()[7 - 7][0] = "";
                chessboardPanel.getBoard()[7 - 7][3] = "TN";
            }
            chessboardPanel.repaint();
            return;
        }
    }

    public boolean canReach(ChessboardPanel chessboardPanel, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo) {
        boolean accepted = false;
        switch (piece) {
            case 'P':
                if (turn == 'N' && rowTo <= rowFrom) {
                    return false;
                }
                if (turn == 'B' && rowTo >= rowFrom) {
                    return false;
                }
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 0 && chessboardPanel.getBoard()[rowTo][colTo].equals("")) {
                    accepted = true;
                }
                if (Math.abs(rowTo - rowFrom) == 2 && Math.abs(colTo - colFrom) == 0 && chessboardPanel.getBoard()[rowTo][colTo].equals("")) {
                    if (turn == 'N' && rowFrom != 1) {
                        return false;
                    }
                    if (turn == 'B' && rowFrom != 6) {
                        return false;
                    }
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
            case 'T':
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
                if (Math.abs(colTo - colFrom) == 0 && rowTo != rowFrom) {
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
                break;
            case 'C':
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 2) {
                    accepted = true;
                }
                if (Math.abs(rowTo - rowFrom) == 2 && Math.abs(colTo - colFrom) == 1) {
                    accepted = true;
                }
                break;
            case 'A':
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
            case 'D':
                if (Math.abs(rowTo - rowFrom) == 0 && colTo != colFrom) {
                    return canReach(chessboardPanel, turn, 'T', rowFrom, colFrom, rowTo, colTo);
                }
                if (Math.abs(colTo - colFrom) == 0 && rowTo != rowFrom) {
                    return canReach(chessboardPanel, turn, 'T', rowFrom, colFrom, rowTo, colTo);
                }
                if (Math.abs(rowTo - rowFrom) == Math.abs(colTo - colFrom)) {
                    return canReach(chessboardPanel, turn, 'A', rowFrom, colFrom, rowTo, colTo);
                }
                break;
            case 'R':
                if (Math.abs(rowTo - rowFrom) <= 1 && Math.abs(colTo - colFrom) <= 1 && (Math.abs(rowTo - rowFrom) + Math.abs(colTo - colFrom)) > 0) {
                    if (turn == 'N') {
                        for (int r = 0; r < 8; r++) {
                            for (int c = 0; c < 8; c++) {
                                if (chessboardPanel.getBoard()[r][c].endsWith("B") && canTake(chessboardPanel, 'B', chessboardPanel.getBoard()[r][c].charAt(0), r, c, rowTo, colTo)) {
                                    return false;
                                }
                            }
                        }
                    }
                    if (turn == 'B') {
                        for (int r = 0; r < 8; r++) {
                            for (int c = 0; c < 8; c++) {
                                if (chessboardPanel.getBoard()[r][c].endsWith("N") && canTake(chessboardPanel, 'B', chessboardPanel.getBoard()[r][c].charAt(0), r, c, rowTo, colTo)) {
                                    return false;
                                }
                            }
                        }
                    }
                    accepted = true;
                }
                break;
        }

        if (accepted) {
            if (chessboardPanel.getBoard()[rowTo][colTo].equals("")) return true;
            if (turn == 'N') {
                if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("B")) return true;
            }
            if (turn == 'B') {
                if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("N")) return true;
            }
        }

        return false;
    }

    public boolean canTake(ChessboardPanel chessboardPanel, char turn, char piece, int rowFrom, int colFrom, int rowTo, int colTo) {
        if (rowFrom == rowTo && colFrom == colTo) return false;
        switch (piece) {
            case 'P':
                if (turn == 'N' && rowTo <= rowFrom) {
                    return false;
                }
                if (turn == 'B' && rowTo >= rowFrom) {
                    return false;
                }
                if (Math.abs(rowTo - rowFrom) == 1 && Math.abs(colTo - colFrom) == 1) {
                    char colonna = (char) ('a' + colTo);
                    if (turn == 'N') {
                        if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("B")) return true;
                        if(lastMove.equals("P"+colonna+"2-"+colonna+"4")) {
                        	chessboardPanel.getBoard()[4][colTo] = "";
                        	return true;
                        }
                    }
                    if (turn == 'B') {
                        if (chessboardPanel.getBoard()[rowTo][colTo].endsWith("N")) return true;
                        if(lastMove.equals("P"+colonna+"7-"+colonna+"5")) {
                        	chessboardPanel.getBoard()[3][colTo] = "";
                        	return true;
                        }
                    }
                    if (chessboardPanel.getBoard()[rowTo][colTo].equals("")) return false;
                }                
                break;
            case 'T':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo);
            case 'C':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo);
            case 'A':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo);
            case 'D':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo);
            case 'R':
                return canReach(chessboardPanel, turn, piece, rowFrom, colFrom, rowTo, colTo);
        }

        return false;
    }
}
