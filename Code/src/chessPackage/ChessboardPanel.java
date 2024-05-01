package chessPackage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ChessboardPanel extends JPanel {
    /**
	 * CP1
	 */
	private static final long serialVersionUID = 1L;
	private int size = 8; 
    private String[][] board;

    private Map<String, BufferedImage> pieceImageMap;
    public boolean gameEnded = false;

    public ChessboardPanel(String[][] board) {
        this.board = board;
        loadPieceImages();
    }

    public String[][] getBoard() {
        return board;
    }

    private void loadPieceImages() {
        // Creazione di una mappa per associare le lettere dei pezzi alle loro immagini
        pieceImageMap = new HashMap<>();
        try {
            // Caricamento delle immagini dei pezzi
            pieceImageMap.put("RW", ImageIO.read(getClass().getResource("/pieces/white_rook.png")));
            pieceImageMap.put("NW", ImageIO.read(getClass().getResource("/pieces/white_knight.png")));
            pieceImageMap.put("BW", ImageIO.read(getClass().getResource("/pieces/white_bishop.png")));
            pieceImageMap.put("QW", ImageIO.read(getClass().getResource("/pieces/white_queen.png")));
            pieceImageMap.put("KW", ImageIO.read(getClass().getResource("/pieces/white_king.png")));
            pieceImageMap.put("PW", ImageIO.read(getClass().getResource("/pieces/white_pawn.png")));
            pieceImageMap.put("RB", ImageIO.read(getClass().getResource("/pieces/black_rook.png")));
            pieceImageMap.put("NB", ImageIO.read(getClass().getResource("/pieces/black_knight.png")));
            pieceImageMap.put("BB", ImageIO.read(getClass().getResource("/pieces/black_bishop.png")));
            pieceImageMap.put("QB", ImageIO.read(getClass().getResource("/pieces/black_queen.png")));
            pieceImageMap.put("KB", ImageIO.read(getClass().getResource("/pieces/black_king.png")));
            pieceImageMap.put("PB", ImageIO.read(getClass().getResource("/pieces/black_pawn.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int squareSize = Math.min(getWidth(), getHeight()) / (size + 1); // Aggiunto 1 per il riferimento

        // Disegna il riferimento delle colonne
        for (int col = 0; col < size; col++) {
            g.setColor(Color.BLACK);
            char columnLetter = (char) ('a' + col);
            String columnString = Character.toString(columnLetter);
            g.drawString(columnString, (int) ((col + 0.5f) * squareSize), size * squareSize + 20);
        }

        // Disegna il riferimento delle righe
        for (int row = 0; row < size; row++) {
            g.setColor(Color.BLACK);
            int rowNumber = size - row;
            String rowString = Integer.toString(rowNumber);
            g.drawString(rowString, size * squareSize + 10, (int) ((row + 0.5f) * squareSize));
        }

        // Disegna la scacchiera
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.GRAY);
                }
                int x = col * squareSize;
                int y = row * squareSize;
                g.fillRect(x, y, squareSize, squareSize);

                // Disegna il pezzo se presente
                String piece = board[row][col];
                if (!piece.isEmpty()) {
                    BufferedImage pieceImage = pieceImageMap.get(piece);
                    if (pieceImage != null) {
                        g.drawImage(pieceImage, x, y, squareSize, squareSize, null);
                    }
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int squareSize = Math.min(getWidth(), getHeight()) / size;
        return new Dimension(squareSize * size, squareSize * size);
    }
}
