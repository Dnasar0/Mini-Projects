import java.util.Arrays;

public class TicTacToeGame {
    
    private char[][] gameBoard = {      {' ', '|', ' ', '|', ' '}, 
                                        {'-', '+', '-', '+', '-'},
                                        {' ', '|', ' ', '|', ' '},
                                        {'-', '+', '-', '+', '-'},
                                        {' ', '|', ' ', '|', ' '}};;
    private int currentPlayer;
    private char[] symbols = {'O', 'X'};

    public TicTacToeGame(int currentPlayer) {
        this.currentPlayer = 0;
    }

    public char[][] getBoard() {
        return gameBoard;
    }
    
    public int getPlayer() {
        return currentPlayer;
    }
        
    public boolean validPlay(int row, int col) {
         return gameBoard[row-1][col-1] == ' ' && (row == 1 || row == 3 || row == 5) && (col == 1 || col == 3 || col == 5);
    }

    public void play(int row, int col) {
        if(this.currentPlayer == 0) {
            gameBoard[row-1][col-1] = symbols[0];
            this.currentPlayer = 1;
        }
        else {
            gameBoard[row-1][col-1] = symbols[1];
            this.currentPlayer = 0;
        }
    }

    public boolean win() {
        return diagonalFilled() || rowFilled() || colFilled();
    }


    public boolean tied() {
        return !win() && !spaceInArray();
    }

    private boolean diagonalFilled() {
        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
                if(gameBoard[i][i] == symbols[this.currentPlayer]) {
                    diag1++;
                }
                if(gameBoard[i][4 - i] == symbols[this.currentPlayer]) {
                    diag2++;
                }
        }
        return diag1 == 3 ||  diag2 == 3;
    }

    private boolean rowFilled() {
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
            if(gameBoard[0][i] == symbols[this.currentPlayer]) {
                row1++;
            }
            if(gameBoard[2][i] == symbols[this.currentPlayer]) {
                row2++;
            }
            if(gameBoard[4][i] == symbols[this.currentPlayer]) {
                row3++;
            }
        }
        return row1 == 3 || row2 == 3 || row3 == 3;
    }

    private boolean colFilled() {
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
            if(gameBoard[i][0] == symbols[this.currentPlayer]) {
                col1++;
            }
            if(gameBoard[i][2] == symbols[this.currentPlayer]) {
                col2++;
            }
            if(gameBoard[i][4] == symbols[this.currentPlayer]) {
                col3++;
            }
        }
        return col1 == 3 || col2 == 3 || col3 == 3;
    }

    private boolean spaceInArray() {
        boolean space = false;
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard.length; j++) {
                if(gameBoard[i][j] == ' ') {
                    space = true;
                }
            }
        }
        return space;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(char[] row : gameBoard) {
            for(char c : row) {
                sb.append(c);
            }
        sb.append("\n");
        }
        return sb.toString();
    }
}