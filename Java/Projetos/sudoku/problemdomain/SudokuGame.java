package sudoku.problemdomain;

import java.io.Serializable;

// Programa que simula um jogo de sudoku

public class SudokuGame implements Serializable{
    private final GameState gameState;                              // estado do jogo
    private final int[][] gridState;                                // o tabuleiro (9x9)

    public static final int GRID_BOUNDARY = 9;
}

    public SudokuGame(GameState gameState, int[][] gridState) {     // construtor do jogo
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {                               // retorna o estado atual do jogo
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);           // retorna uma cópia do estaod atual do tabuleiro
    }
