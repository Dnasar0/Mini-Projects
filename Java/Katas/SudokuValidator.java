public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        boolean valid = true;
        // row checker
        for(int row = 0; row < 9; row++)
            for(int col = 0; col < 8; col++)
                for(int col2 = col + 1; col2 < 9; col2++)
                    if(sudoku[row][col]==sudoku[row][col2])
                        valid = false;

        // column checker
        for(int col = 0; col < 9; col++)
            for(int row = 0; row < 8; row++)
                for(int row2 = row + 1; row2 < 9; row2++)
                    if(sudoku[row][col]==sudoku[row2][col])
                        valid = false;

        // 3x3 grid checker
        for(int row = 0; row < 9; row += 3)
            for(int col = 0; col < 9; col += 3)
            // row, col is start of the 3 by 3 grid
                for(int pos = 0; pos < 8; pos++)
                    for(int pos2 = pos + 1; pos2 < 9; pos2++)
                        if(sudoku[row + pos%3][col + pos/3]==sudoku[row + pos2%3][col + pos2/3])
                            valid = false;
        return valid;
    }

    public static void main(String[] args) {
    int[][] sudoku =  {{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
    {6, 7, 2, 1, 9, 0, 3, 4, 8},
    {1, 0, 0, 3, 4, 2, 5, 6, 0},
    {8, 5, 9, 7, 6, 1, 0, 2, 0},
    {4, 2, 6, 8, 5, 3, 7, 9, 1},
    {7, 1, 3, 9, 2, 4, 8, 5, 6},
    {9, 0, 1, 5, 3, 7, 2, 1, 4},
    {2, 8, 7, 4, 1, 9, 6, 3, 5},
    {3, 0, 0, 4, 8, 1, 1, 7, 9}};
    System.out.println(check(sudoku));
    }
}