package chessPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class Chessboard {
    private static ChessboardPanel chessboardPanel;
    private static JTextArea movesTextArea = new JTextArea();
    private static BufferedReader moveReader;
    private static JButton nextMoveButton;
    private static JLabel nextMoveLabel;
    private static JFrame frame;
    private static char turn = 'W';
    private static int turnNumber = 1;
    private static Checker chk = new Checker();
    private static int currentPrinting = 0;

    public static ArrayList<String> allMoves = new ArrayList<String>();
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
                
                String[] parts = firstLine.split("\t");  
                if(turn =='W') allMoves.add(parts[1]);
                if (parts.length == 3)
                	allMoves.add(parts[2]);
                
                String line = moveReader.readLine();  
                while(line != null) {
                    parts = line.split("\t");  
                    allMoves.add(parts[1]);
                    if (parts.length == 3)
                    	allMoves.add(parts[2]);
                    line = moveReader.readLine();  
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
        });
    }

    public static void closeChessboard() {
    	allMoves.clear();
    	movesTextArea.setText("");
    	frame.dispose();
    	currentPrinting = 0;
    	chk.previousMoves1.clear();
    	chk.previousMoves2.clear();
        turn = 'W';
        turnNumber = 1;
        preamble = false;
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
        nextMoveButton = new JButton(">>");
        nextMoveButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        nextMoveButton.setForeground(Color.BLACK);
        nextMoveButton.setBackground(Color.GRAY);
        nextMoveButton.setFocusPainted(false);
        nextMoveButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        nextMoveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        nextMoveLabel = new JLabel(" ");
        nextMoveLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        nextMoveLabel.setForeground(new Color(60, 60, 60));

        if (allMoves.get(0).equals("")) {
            nextMoveLabel.setText("No more moves.");
        } else {
            nextMoveLabel.setText("1. " + allMoves.get(0));
        }

        nextMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (allMoves.size() > currentPrinting) {
            		chk.movePiece(chessboardPanel, allMoves.get(currentPrinting), turn, currentPrinting);  
            		if(turn == 'B') turnNumber += 1;
            		turn = chk.oppositeTurn(turn);
            		currentPrinting++;
            		if(allMoves.size() > currentPrinting)
            			nextMoveLabel.setText(turnNumber + ". " + allMoves.get(currentPrinting));
            		else
            			nextMoveLabel.setText("No more moves");
            	}             
            }
        });
        
        buttonPanel.add(nextMoveLabel);
        buttonPanel.add(nextMoveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private static void createPreviousMoveButton(JPanel buttonPanel) {
        JButton previousMoveButton = new JButton("<<");
        previousMoveButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        previousMoveButton.setForeground(Color.BLACK);
        previousMoveButton.setBackground(Color.GRAY);
        previousMoveButton.setFocusPainted(false);
        previousMoveButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        previousMoveButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        previousMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(currentPrinting >0) {
            		if(turn == 'W') turnNumber -= 1;
                	turn = chk.oppositeTurn(turn);
                	currentPrinting--;
                	chk.showcaseLastMove(chessboardPanel,currentPrinting,turn);
            		if(allMoves.size() > currentPrinting)
            			nextMoveLabel.setText(turnNumber + ". " + allMoves.get(currentPrinting));
            		else
            			nextMoveLabel.setText("No more moves");
            	}
            }
        });

        buttonPanel.add(previousMoveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private static ChessboardPanel createAndShowGUI() {
        frame = new JFrame("Chessboard");
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


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        createPreviousMoveButton(buttonPanel);
        createNextMoveButton(buttonPanel);

        JPanel rightPanel = new JPanel(new BorderLayout());      
        printMoves(rightPanel);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        
        frame.add(chessboardPanel, BorderLayout.CENTER);
        frame.add(rightPanel, BorderLayout.EAST);

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
    
    private static void printMoves(JPanel rightPanel) {
    	char currentTurn = turn;
    	int currentNum = 1;
    	boolean temp = true;
    	movesTextArea.setEditable(false);
    	
    	movesTextArea.setMargin(new Insets(0, 10, 10, 0));

    	Font font = movesTextArea.getFont();
    	movesTextArea.setFont(new Font(font.getName(), Font.PLAIN, 16));
    	movesTextArea.append("MOVES LIST \n");
    	
    	for (String move : allMoves) {
    	    if(currentTurn == 'W' || temp) {
    	    	temp = false;
    	        movesTextArea.append(currentNum + ".");   
    	    }
    	    movesTextArea.append("\t"+move);
    	    if(currentTurn == 'B') {
    	        movesTextArea.append("\n");
    	        currentNum++;
    	    }
    	    currentTurn = chk.oppositeTurn(currentTurn);
    	}

    	// Includi movesTextArea all'interno di uno JScrollPane
 
    	JScrollPane scrollPane = new JScrollPane(movesTextArea);
    	scrollPane.setPreferredSize(new Dimension(400, 400));
    	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    	rightPanel.add(scrollPane, BorderLayout.SOUTH);
    	movesTextArea.setCaretPosition(0);
    }
}
