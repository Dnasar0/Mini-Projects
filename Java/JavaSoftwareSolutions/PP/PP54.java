import java.util.Scanner;
import java.util.Random;

public class PP54 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int min = 1;
    int max = 100;
    int random = rd.nextInt(max) + min;
    int SENTINEL = 0;
    int attempts = 6;
    System.out.print("Welcome to Guess The Number Game! Guess a number between" + min + " and" + max + ", (you only have " + attempts + " tries), or press " + SENTINEL + " to quit playing: ");
    int guess = sc.nextInt();
    while(guess != random && guess != SENTINEL && attempts != 0) {
      attempts = attempts - 1;
      if(guess - random < 10 && random - guess > -10) {
        System.out.println("Guess is high");
      }
      else {
        System.out.println("Guess is low");
      }
      System.out.print("Keep trying! You only have " + attempts + " tries remaining: ");
      guess = sc.nextInt();
    }
    if(guess == random) {
      System.out.println("You guessed it right! The secret number was " + random + ".");
    }
    if(guess == SENTINEL) {
      System.out.println("Game was stopped.");
    }
    if(attempts == 0) {
      System.out.print("Game ended. Out of tries");
    }
    sc.close();
  }
}
