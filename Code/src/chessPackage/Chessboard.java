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
    private static char turn = 'B';
    private static String nextMove = null;
    private static int moveNumber = 1; // Contatore per il numero della mossa
    private static Checker chk = new Checker();

    /*
     * MAIN
     */
    public static void main(String[] args) {
        try {
            moveReader = new BufferedReader(new FileReader("res/moves2.txt"));
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
     * NEXT MOVE BUTTON
     */
    private static void createNextMoveButton() {
        nextMoveButton = new JButton("Next Move:");
        nextMoveLabel = new JLabel(" ");

        try {
            nextMove = moveReader.readLine(); // Leggi e memorizza la prossima mossa durante l'inizializzazione del pulsante
            if (nextMove == null) {
                nextMoveLabel.setText("No more moves.");
            } else {
                nextMoveLabel.setText("Next Move " + moveNumber + ": " + nextMove); // Mostra il numero della mossa
            }
        } catch (IOException ex) {
            System.err.println("Error reading move: " + ex.getMessage());
        }

        nextMoveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nextMove != null) { // Se c'è una mossa memorizzata, eseguila
                    try {
                        if (chk.movePiece(chessboardPanel, nextMove, turn)) {
                            if (turn == 'B') turn = 'N';
                            else turn = 'B';
                        }
                        moveNumber++; // Incrementa il numero della mossa
                        nextMove = moveReader.readLine(); // Leggi la prossima mossa per la successiva pressione del pulsante
                        if (nextMove == null) {
                            nextMoveLabel.setText("No more moves.");
                        } else {
                            nextMoveLabel.setText("Next Move " + moveNumber + ": " + nextMove); // Mostra il numero della mossa
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

        ChessboardPanel chessboardPanel = new ChessboardPanel(initialBoard);
        // Imposta la dimensione del pannello a 400x400 pixel
        chessboardPanel.setSize(new Dimension(400, 400));
        frame.add(chessboardPanel);

        frame.pack();
        frame.setVisible(true);

        return chessboardPanel;
    }
}
