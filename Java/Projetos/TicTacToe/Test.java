public class Test {
    
    public static boolean diagonalFilled(int currentPlayer, char[][] gameBoard, char[] symbols) {
        boolean yes = false;
        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
                if(gameBoard[i][i] == symbols[currentPlayer])
                    diag1++;
                if(gameBoard[i][6 - i - 2] == symbols[currentPlayer])
                    diag2++;
        }
        if(diag1 == 3 || diag2 == 3) {
            yes = true;
        }
        return yes;
    }

    public static boolean rowFilled(int currentPlayer, char[][] gameBoard, char[] symbols) {
        boolean yes = false;
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
            if(gameBoard[0][i] == symbols[currentPlayer]) {
                row1++;
            }
            if(gameBoard[2][i] == symbols[currentPlayer]) {
                row2++;
            }
            if(gameBoard[4][i] == symbols[currentPlayer]) {
                row3++;
            }
        }
        if(row1 == 3 || row2 == 3 || row3 == 3) {
            yes = true;
        }
        return yes;
    }

    public static boolean colFilled(int currentPlayer, char[][] gameBoard, char[] symbols) {
        boolean yes = false;
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        for(int i = 0; i < gameBoard.length; i+=2) {
            if(gameBoard[i][0] == symbols[currentPlayer])
                col1++;
            if(gameBoard[i][1] == symbols[currentPlayer])
                col2++;
            if(gameBoard[i][1] == symbols[currentPlayer])
                col3++;
        }
        if(col1 == 3 || col2 == 3 || col3 == 3) {
            yes = true;
        }
        return yes;
    }

    public static boolean win(int currentPlayer, char[][] gameBoard, char[] symbols) {
        boolean yes = false;
        if(diagonalFilled(currentPlayer, gameBoard, symbols) || rowFilled(currentPlayer, gameBoard, symbols) || colFilled(currentPlayer, gameBoard, symbols)) {
            yes = true;
        }
        return yes;
    }

    public static boolean spaceInArray(char[][] gameBoard) {
        boolean yes = false;
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard.length; j++) {
                if(gameBoard[i][j] == ' ') {
                    yes = true;
                }
            }
        }
        return yes;
    }

    public static boolean validPlay(int row, int col, char[][] gameBoard) {
        return gameBoard[row-1][col-1] == ' ' && (row == 1 || row == 3 || row == 5) && (col == 1 || col == 3 || col == 5);
   }

    public static void main(String[] args) {
        char[][] gameBoard = {{'X', '|', 'X', '|', 'X'}, 
                              {'-', '+', '-', '+', '-'},
                              {'X', '|', 'X', '|', 'X'},
                              {'-', '+', '-', '+', '-'},
                              {'X', '|', 'X', '|', 'O'}};
        int currentPlayer = 1;
        char[] symbols = {'O', 'X'};
        System.out.println(diagonalFilled(currentPlayer, gameBoard, symbols));
    }
}
