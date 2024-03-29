package chessPackage;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Chessboard {
    private static ChessboardPanel chessboardPanel;
    private static BufferedReader moveReader;
    private static JButton nextMoveButton;
    private static JLabel nextMoveLabel; // Added label to display next move
    private static JFrame frame;
    private static char turn = 'W';
    private static String turnNumber = "1";
    private static String nextMoveW = null;
    private static String nextMoveB = null;
    private static Checker chk = new Checker();
    
    private static String [][] initialBoard = new String[8][8];
    private static boolean preamble = false;

    /*
     * MAIN
     */
    public static void main(String[] args) {
    	setEmptyChessboard();
        try {
            moveReader = new BufferedReader(new FileReader("res/input.file"));
            
            //HERE ADD PREAMBLE CHESSBOARD
            try {
            	String firstLine = moveReader.readLine(); //skip two lines
            	if(firstLine.charAt(0) == '1'){
            			preamble = false;
            	}
            	else {
            		preamble = true; 
            		
                	for(int i = 0; i<2; i++) {
                        String PreambleTurn = firstLine.substring(0, 5);
                        if(i==0) {
                        	turn = PreambleTurn.toUpperCase().charAt(0);
                        }
                        firstLine = firstLine.substring(7,firstLine.length()-1);
                        String[] infos = firstLine.split(";");
                        for (String info : infos) {
                        	setUpChessboard(info,PreambleTurn);
                        }
                        firstLine = moveReader.readLine();    
                	}
            	}
            	
                String[] parts = firstLine.split("\t");
                turnNumber = parts[0];
                nextMoveW = parts[1];
                nextMoveB = parts[2];

            } catch (IOException ex) {
                System.err.println("Error reading move: " + ex.getMessage());
            }
            
            
        } catch (FileNotFoundException e) {
            System.err.println("File 'moves.txt' not found.");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            chessboardPanel = createAndShowGUI();
            createNextMoveButton();
        });
    }
    /*
     * SET UP CHESSBOARD
     */    
    private static void setUpChessboard(String info,String t) {
    	char turn = 'B';
    	if(t.equals("white")) turn = 'W';
    	
    	char piece = info.charAt(0);
    	char column = info.charAt(1);
    	char row = info.charAt(2);
    	
    	int colIndex = column - 'a';
    	int rowIndex = '8' - row;
    	
    	initialBoard[rowIndex][colIndex] = piece + "" + turn; 
    }
    

    /*
     * NEXT MOVE BUTTON
     */
    private static void createNextMoveButton() {
        nextMoveButton = new JButton("Next Move:");
        nextMoveLabel = new JLabel(" ");

        //INIZIALIZZAZIONE DEL PULSANTE, SCRIVI E SALVA LA MOSSA
        if (nextMoveW == null) {
            nextMoveLabel.setText("No more moves.");
        } else {
            nextMoveLabel.setText(turnNumber+" "+ nextMoveW); 
        }


        nextMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (nextMoveW != null || nextMoveB != null) { 
                    try {
                    	//PRIMA ESEGUE LA MOSSA
                    	if (turn == 'W')
                    		chk.movePiece(chessboardPanel, nextMoveW, turn);
                    	else
                    		chk.movePiece(chessboardPanel, nextMoveB, turn);
                    	
                        //PASSA AL TURNO SUCCESSIVO
                        if (turn == 'W') {
                        	turn = 'B';
                        }else {
                        	turn = 'W';
                            //LEGGE LA SUCCESSIVA RIGA SE NECESSARIO
                        	String line = moveReader.readLine();
                        	if(line != null) {
                                String[] parts = line.split("\t");
                                turnNumber = parts[0];
                                nextMoveW = parts[1];
                                nextMoveB = parts[2];
                        	}else{
                                nextMoveW = null;
                                nextMoveB = null;
                        	}
                        }                  
                        
                        //ED AGGIORNA IL PULSANTE
                        if (nextMoveW == null && nextMoveB == null) {
                            nextMoveLabel.setText("No more moves.");
                        } else {
                        	if (turn == 'W')                     		                       	
                        		nextMoveLabel.setText(turnNumber+" "+ nextMoveW); 
                        	else
                        		nextMoveLabel.setText(turnNumber+" "+ nextMoveB); 
                        }
                        
                    } catch (IOException ex) {
                        System.err.println("Error reading move: " + ex.getMessage());
                    }
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(nextMoveButton);
        buttonPanel.add(nextMoveLabel); // Aggiungi il label accanto al pulsante

        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    /*
     * GUI
     */
    private static ChessboardPanel createAndShowGUI() {
        frame = new JFrame("Chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Matrice rappresentante la disposizione iniziale degli scacchi
        if(!preamble) {
        String[][] TMPinitialBoard = {
            {"RB", "NB", "BB", "QB", "KB", "BB", "NB", "RB"},
            {"PB", "PB", "PB", "PB", "PB", "PB", "PB", "PB"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"PW", "PW", "PW", "PW", "PW", "PW", "PW", "PW"},
            {"RW", "NW", "BW", "QW", "KW", "BW", "NW", "RW"}
        };
        initialBoard = TMPinitialBoard;
        }

        ChessboardPanel chessboardPanel = new ChessboardPanel(initialBoard);
        // Imposta la dimensione del pannello a 400x400 pixel
        chessboardPanel.setSize(new Dimension(400, 400));
        frame.add(chessboardPanel);

        frame.pack();
        frame.setVisible(true);

        return chessboardPanel;
    }
    
    private static void setEmptyChessboard() {
        for (int i = 0; i < initialBoard.length; i++) {
            for (int j = 0; j < initialBoard[i].length; j++) {
                initialBoard[i][j] = "";
            }
        }
    }
}
