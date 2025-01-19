import java.util.Scanner;
public class TicTacToeMatch {
    
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Tic Tac Toe game!\nPlayer 0 is 'O'\tPlayer 1 is 'X'\nPlayer 0 will start.");
        System.out.println(game);
        do {
            int[] pos = new int[2];
            boolean error = true;
            System.out.print("Select the row you wish to play (1,3,5), Player " + game.getPlayer() + ": ");
            do {
                readChoice(sc, game, pos);
                error = !game.validPlay(pos[0], pos[1]);
                if(error) {
                    System.out.println("Not a valid position!");
                }
            } while(error);
            game.play(pos[0], pos[1]);
            System.out.println("");
            System.out.println("Board updated. Player " + game.getPlayer() + "'s turn.");
            System.out.println(game);
        }while(!game.win() && !game.tied());
        if(game.win()) {
            System.out.println("Congratulations Player " + game.getPlayer() + ", you won!");
        }
        else {
            System.out.println("It's a tie!");
        }
        System.out.println("Game ended.");
    }

    public static void readChoice(Scanner sc, TicTacToeGame game, int[] pos) {
        boolean error = true;
        do {
            pos[0] = sc.nextInt();
            error = !(pos[0] == 1 || pos[0] == 3 || pos[0] == 5);
            if(error)
                System.out.print("Please type in a valid row: ");
        } while(error); 
        System.out.println("");
        System.out.print("Select the column you wish to play (1,3,5), player " + game.getPlayer() + ": ");
        do {
            pos[1] = sc.nextInt();
            error = !(pos[1] == 1 || pos[1] == 3 || pos[1] == 5);
            if(error)
                System.out.println("Please type in a valid column: ");
        } while(error);
    }
}