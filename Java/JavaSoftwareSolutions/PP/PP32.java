import java.util.Scanner;

public class PP32 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("First num:");
    int num1 = sc.nextInt();
    System.out.print("Second num:");
    int num2 = sc.nextInt();
    System.out.println("Sum of value's cubes: " + (num1 * num1 * num1 + num2 * num2 * num2));
    sc.close();
  }
}
