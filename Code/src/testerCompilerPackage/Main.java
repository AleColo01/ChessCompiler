package testerCompilerPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import chessPackage.Chessboard;

public class Main {

    public static void main(String[] args) throws IOException {
        final String GREENBACK = "\033[42m";
        final String RESET = "\033[0m";

        JFrame frame = new JFrame("Select Input File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton chooseFileButton = new JButton("Choose File");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        panel.add(chooseFileButton, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);

        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String filePath = selectedFile.getAbsolutePath();

                    try {
                        ChessGrammarLexerTester lex = new ChessGrammarLexerTester();
                        ChessGrammarParserTester par = new ChessGrammarParserTester();

                        System.out.println("-- LEXER --");
                        System.out.println("");
                        lex.test(filePath);
                        System.out.println("\n\n");
                        System.out.println("-- PARSER --");
                        System.out.println("");
                        par.test(filePath);

                        if (par.startChessboard) {
                            System.out.println(GREENBACK + "Avvio Scacchiera..." + RESET);
                            Chessboard.mainMethod(filePath);
                            frame.dispose();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }
}