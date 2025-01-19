import java.util.Scanner;

public class EX510 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a positive number:");
    int n = sc.nextInt();
    while (n  < 0) {
      System.out.print("Not a positive number, please try again:");
      n = sc.nextInt();
    }

    System.out.println("Positve number detected: " + n);

  }
}
