import java.util.Scanner;
import java.util.Random;

public class PP31 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("First name:");
    String firstName = sc.nextLine();
    System.out.print("Last name:");
    String lastName = sc.nextLine();
    Random rd = new Random();
    System.out.println(firstName.charAt(0) + lastName.substring(0,5) + (rd.nextInt(90) + 10));
    sc.close();
  }
}
