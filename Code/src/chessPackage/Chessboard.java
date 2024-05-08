package chessPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Chessboard {
    private static ChessboardPanel chessboardPanel;
    private static BufferedReader moveReader;
    private static JButton nextMoveButton;
    private static JLabel nextMoveLabel;
    private static JFrame frame;
    private static char turn = 'W';
    private static String turnNumber = "1";
    private static String nextMoveW = null;
    private static String nextMoveB = null;
    private static Checker chk = new Checker();
    private static int currentReading = 0;
    private static int currentPrinting = 0;
    
    private static String tempMoveW = null;
    private static String tempMoveB = null; 

    private static String[][] initialBoard = new String[8][8];
    private static boolean preamble = false;

    public static void mainMethod(String inputFile) {
        setEmptyChessboard();
        try {
            moveReader = new BufferedReader(new FileReader(inputFile));

            try {
                String firstLine = moveReader.readLine();
                if (firstLine.charAt(0) == '1') {
                    preamble = false;
                } else if (firstLine != null) {
                    preamble = true;
                    for (int i = 0; i < 2; i++) {
                        String PreambleTurn = firstLine.substring(0, 5);
                        if (i == 0) {
                            turn = PreambleTurn.toUpperCase().charAt(0);
                        }
                        firstLine = firstLine.substring(7, firstLine.length() - 1);
                        String[] infos = firstLine.split(";");
                        for (String info : infos) {
                            setUpChessboard(info, PreambleTurn);
                        }
                        firstLine = moveReader.readLine();
                    }
                }

                if (firstLine != null) {
                    String[] parts = firstLine.split("\t");
                    currentReading += 2;        
                    turnNumber = parts[0];
                    nextMoveW = parts[1];
                    if (parts.length == 3)
                        nextMoveB = parts[2];
                }
            } catch (IOException ex) {
                System.err.println("Error reading move: " + ex.getMessage());
            }


        } catch (FileNotFoundException e) {
            System.err.println("File 'moves.txt' not found.");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            chessboardPanel = createAndShowGUI();
            if (nextMoveB == null)
                chessboardPanel.gameEnded = true;
        });
    }

    private static void setUpChessboard(String info, String t) {
        char turn = 'B';
        if (t.equals("white")) turn = 'W';

        char piece = info.charAt(0);
        char column = info.charAt(1);
        char row = info.charAt(2);

        int colIndex = column - 'a';
        int rowIndex = '8' - row;

        initialBoard[rowIndex][colIndex] = piece + "" + turn;
    }


    private static void createNextMoveButton(JPanel buttonPanel) {
        nextMoveButton = new JButton("Next Move");
        nextMoveButton.setFont(new Font("Calibri", Font.BOLD, 16));
        nextMoveButton.setForeground(Color.WHITE);
        nextMoveButton.setBackground(new Color(0, 120, 215));
        nextMoveButton.setFocusPainted(false);
        nextMoveButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createEmptyBorder(10, 20, 10, 20)));
        nextMoveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        nextMoveLabel = new JLabel(" ");
        nextMoveLabel.setFont(new Font("Calibri", Font.BOLD, 14));
        nextMoveLabel.setForeground(new Color(60, 60, 60));

        if (nextMoveW == null) {
            nextMoveLabel.setText("No more moves.");
        } else {
            if (nextMoveW.equals("")) {
                nextMoveLabel.setText(turnNumber + " " + nextMoveB);
            } else {
                nextMoveLabel.setText(turnNumber + " " + nextMoveW);
            }
        }

        nextMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                if (nextMoveW != null || nextMoveB != null) {
                	currentPrinting++;

                    try {
                        if (turn == 'W') {
                            chk.movePiece(chessboardPanel, nextMoveW, turn, currentReading, currentPrinting);                           
                        }
                        else
                            if (nextMoveB != null) {
                                chk.movePiece(chessboardPanel, nextMoveB, turn, currentReading, currentPrinting);                            
                            }

                        if (turn == 'W') {
                            turn = 'B';

                        } else {
                            turn = 'W';
                            if(currentReading == currentPrinting){
	                            String line = moveReader.readLine();
	                            currentReading += 2;                                         
	                            String[] parts = null;
	                            nextMoveW = null;
	                            nextMoveB = null;
	                            if (line != null) {
	                                parts = line.split("\t");
	                                turnNumber = parts[0];
	                                nextMoveW = parts[1];
	                                tempMoveW = parts[1];
	                                if (parts.length == 3) {
	                                	nextMoveB = parts[2];
	                                	tempMoveB = parts[2];
	                                }
	                                    
	                                else
	                                    chessboardPanel.gameEnded = true;
	                            }
                            }

                        	if(nextMoveW == null && tempMoveW != null) {
                        		nextMoveW = tempMoveW;
                        		tempMoveW = null;
                            }
                            if(nextMoveB == null && tempMoveB != null) {
                        		nextMoveB = tempMoveB; 
                        		tempMoveB = null;
                            }                             
                        }                   

                        if (nextMoveW == null && nextMoveB == null) {
                            nextMoveLabel.setText("No more moves.");
                        } else {
                            if (turn == 'W')
                                nextMoveLabel.setText(turnNumber + " " + nextMoveW);
                            else
                                if (nextMoveB == null) {
                                    nextMoveLabel.setText("No more moves.");
                                } else {
                                    nextMoveLabel.setText(turnNumber + " " + nextMoveB);
                                }
                        }

                    } catch (IOException ex) {
                        System.err.println("Error reading move: " + ex.getMessage());
                    }
                }
                
                

            }
        });
        
        buttonPanel.add(nextMoveLabel);
        buttonPanel.add(nextMoveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private static void createPreviousMoveButton(JPanel buttonPanel) {
        JButton previousMoveButton = new JButton("Previous Move");
        previousMoveButton.setFont(new Font("Calibri", Font.BOLD, 16));
        previousMoveButton.setForeground(Color.WHITE);
        previousMoveButton.setBackground(new Color(0, 120, 215));
        previousMoveButton.setFocusPainted(false);
        previousMoveButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createEmptyBorder(10, 20, 10, 20)));
        previousMoveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        previousMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(currentPrinting >0) {
                	if(turn=='W') {
                		nextMoveW = chk.previousMoves1.get(currentPrinting-2);
                		nextMoveB = chk.previousMoves1.get(currentPrinting-1);
                	}
                	currentPrinting--;
                	turn = chk.oppositeTurn(turn);
                	chk.showcaseLastMove(chessboardPanel,currentPrinting,turn);

            	}
            }
        });

        buttonPanel.add(previousMoveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private static ChessboardPanel createAndShowGUI() {
        frame = new JFrame("Chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (!preamble) {
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
        chessboardPanel.setSize(new Dimension(400, 400));
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        createPreviousMoveButton(buttonPanel);
        createNextMoveButton(buttonPanel);
        
        frame.add(chessboardPanel, BorderLayout.CENTER);

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
