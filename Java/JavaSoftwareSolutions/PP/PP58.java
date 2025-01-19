import java.util.Scanner;
import java.util.Random;

public class PP58 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int num1 = rd.nextInt(10);
    int num2 = rd.nextInt(10);
    int num3 = rd.nextInt(10);
    String spin = "spin";
    String end = "end";
    int total = 2;
    int bigPrize = 5;
    int smallPrize = 2;
    System.out.print("Welcome to the slot machine game!\nYou win the the big prize if all three numbers are the same, and the little prize if there are just two.\nTo spin, you need 1 coin!\nType in 'spin' to spin the slot machine! ");
    String option = sc.nextLine();
    while(option.compareTo(spin) != 0) {
      System.out.print("Whenever you are ready, type in 'spin'! ");
    }
    while(option.compareTo(end) != 0) {
      do{
        total-= 1;
        System.out.println("The numbers  are: " + "\t" + num1 + "\t" + num2 + "\t" + num3);
        if(num1 == num2 && num1 != num3) {
          System.out.println("Nice! You won the small jackpot!");
          System.out.println("You won " + smallPrize + "!");
          total+= smallPrize;
          System.out.println("Total: " + total);
        }
        else if(num1 == num3 && num1 != num2) {
          System.out.println("Nice! You got the small jackpot!");
          System.out.println("You won " + smallPrize + "!");
          total+= smallPrize;
          System.out.println("Total: " + total);
        }
        else if(num2 == num3 && num1 != num2) {
          System.out.println("Nice! You got the small jackpot!");
          System.out.println("You got " + smallPrize + "!");
          total+= smallPrize;
          System.out.println("Total: " + total);
        }
        else if(num1 == num2 && num2 == num3) {
          System.out.println("HOLY CRAP! YOU WON THE BIG JACKPOT!!");
          System.out.println("You got " + bigPrize + "!");
          total+= bigPrize;
          System.out.println("Total: " + total);
        }
        else {
          System.out.println("Nothing won");
          System.out.println("Total: " + total);
        }
        num1 = rd.nextInt(10);
        num2 = rd.nextInt(10);
        num3 = rd.nextInt(10);
        System.out.print("Spin again? Type 'end' if you're done playing, 'spin' again to continue: ");
        option = sc.nextLine();
      } while(total > 0);
      System.out.println("You don't have anymore coins! GG");
    }
    sc.close();
    System.out.println("Game ended!");
    System.out.println("Amount won: " + bigPrize + smallPrize);
  }
}
