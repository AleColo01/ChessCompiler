package chessPackage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
        int squareSize = Math.min(getWidth(), getHeight()) / (size + 1);

        g.setFont(new Font("Arial", Font.BOLD, squareSize / 3));
        for (int col = 0; col < size; col++) {
            char columnLetter = (char) ('a' + col);
            String columnString = Character.toString(columnLetter);
            g.drawString(columnString, (col + 1) * squareSize + squareSize / 3, squareSize - squareSize / 4);
        }

        for (int row = 0; row < size; row++) {
            int rowNumber = size - row;
            String rowString = Integer.toString(rowNumber);
            g.drawString(rowString, squareSize / 2, (row + 1) * squareSize + squareSize / 2);
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Color squareColor = (row + col) % 2 == 0 ? new Color(232, 235, 239) : new Color(125, 135, 150);
                g.setColor(squareColor);
                int x = (col + 1) * squareSize;
                int y = (row + 1) * squareSize;
                g.fillRect(x, y, squareSize, squareSize);

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
        return new Dimension((size + 1) * squareSize, (size + 1) * squareSize);
    }
}
