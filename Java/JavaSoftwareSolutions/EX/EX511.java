import java.util.Scanner;

public class EX511 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Type in a random number:");
    int n = sc.nextInt();
    int SENTINEL = 2;
    while (n != SENTINEL) {
      System.out.println(n);
      System.out.print("Keep trying:");
      n = sc.nextInt();
    }

    System.out.println("You got the SENTINEL number!");
  }
}
