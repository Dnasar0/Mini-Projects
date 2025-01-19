import java.util.Scanner;
import java.util.Random;

public class PP57 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int SENTINEL = 0;
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int roundsWon = 0;
    int roundsLost = 0;
    int roundsTied = 0;
    int play;
    String imReady = "ready";
    int random = rd.nextInt(3) + 1;
    System.out.print("Welcome to Rock-Papper-Scissors! \nPlease type " + rock +
    " if you want to play rocks, " + paper + " if you want to play paper, " +
    scissors + " if you want to play scissors. To stop playing press + " +
    SENTINEL + ". Type 'ready' to begin! ");
    String ready = sc.nextLine();
    while(ready.compareTo(imReady) != 0) {
      System.out.print("Whenever you are ready, type 'ready' to begin! ");
      ready = sc.nextLine();
    }
    do{
      random = rd.nextInt(3) + 1;
      System.out.print("Rock (1), Paper (2) or Scissors (3)? Or press " + SENTINEL + " to quit game: ");
      play = sc.nextInt();
      if(play == rock && random == paper) {
        System.out.println("Player: Rock" + "\t" + "Computer: Paper");
        System.out.println("The player lost!");
        roundsLost++;
      }
      if(play == rock && random == scissors) {
        System.out.println("Player: Rock" + "\t" + "Computer: Scissors");
        System.out.println("The player won!");
        roundsWon++;
      }
      if(play == rock && random == rock) {
        System.out.println("Player: Rock" + "\t" + "Computer: Rock");
        System.out.println("It's a tie!");
        roundsTied++;
      }
      if(play == paper && random == rock) {
        System.out.println("Player: Paper" + "\t" + "Computer: Rock");
        System.out.println("The player won!");
        roundsWon++;
      }
      if(play == paper && random == scissors) {
        System.out.println("Player: Paper" + "\t" + "Computer: Scissors");
        System.out.println("The player lost!");
        roundsLost++;
        }
      if(play == paper && random == paper) {
        System.out.println("Player: Paper" + "\t" + "Computer: Paper");
        System.out.println("It's a tie!");
        }
      if(play == scissors && random == rock) {
          System.out.println("Player: Scissors" + "\t" + "Computer: Rock");
          System.out.println("The player lost!");
          roundsLost++;
      }
      if(play == scissors && random == paper) {
          System.out.println("Player: Scissors" + "\t" + "Computer: Paper");
          System.out.println("The player won!");
          roundsWon++;
      }
      if(play == scissors && random == scissors) {
          System.out.println("Player: Scissors" + "\t" + "Computer: Scissors");
          System.out.println("It's a tie!");
          roundsTied++;
      }
    } while(play != SENTINEL);
    sc.close();
    System.out.println("Game ended!");
    System.out.println("Total rounds won: " + roundsWon);
    System.out.println("Total rounds lost: " + roundsLost);
    System.out.println("Total rounds tied: " + roundsTied);
  }
}
