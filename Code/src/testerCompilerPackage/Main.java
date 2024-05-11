package testerCompilerPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import chessPackage.Chessboard;

public class Main {
    final String GREENBACK = "\033[42m";
    final String RESET = "\033[0m";
    private int game = 0;

    public Main() {
        JFrame frame = new JFrame("Chess Analyzer");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        JButton chooseFileButton = new JButton("Choose File");
        chooseFileButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        textArea.setMargin(new Insets(10, 10, 10, 10));
        textArea.setBorder(BorderFactory.createEtchedBorder(0));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
       
        

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(chooseFileButton);

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);

        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser("../Code/GameFiles");
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                	if(game == 1) {
                    	Chessboard.closeChessboard();
                    	game = game - 1;
                    }
                    File selectedFile = fileChooser.getSelectedFile();
                    String filePath = selectedFile.getAbsolutePath();

                    try {
                        ChessGrammarLexerTester lex = new ChessGrammarLexerTester();
                        ChessGrammarParserTester par = new ChessGrammarParserTester(textArea);

                        System.out.println("-- LEXER --");
                        System.out.println("");
                        lex.test(filePath);
                        System.out.println("\n\n");
                        System.out.println("-- PARSER --");
                        System.out.println("");
                        par.test(filePath);

                        if (par.startChessboard) {
                            System.out.println(GREENBACK + "Avvio Scacchiera..." + RESET);
                            game++;
                            Chessboard.mainMethod(filePath);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}