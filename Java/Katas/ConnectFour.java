import java.util.*;

public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {
        String[][] board = new String[7][6];
        for (String piece : piecesPositionList) {
            int row, column = piece.charAt(0) - 'A';
            for (row = 0; board[column][row] != null; row++);

            board[column][row] = piece.substring(2);
            for (int[] move : new int[][] {{0,1}, {1,0}, {1,1}, {1,-1}}) {
                for (int n = 0, f = 1; f >= -1; f -= 2) {
                    for (int c = column, r = row; c >= 0 && c < 7 && r >= 0 && r < 6 && piece.substring(2).equals(board[c][r]); c += move[0] * f, r += move[1] * f) {
                        if (++n > 4) {
                            return piece.substring(2);
                        }
                    }
                }
            }
        }
        return "Draw";
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(
            "A_Red",
            "B_Yellow",
            "A_Red",
            "B_Yellow",
            "A_Red",
            "B_Yellow",
            "G_Red",
            "B_Yellow"
        ));
        System.out.println(whoIsWinner(list));
    }
}