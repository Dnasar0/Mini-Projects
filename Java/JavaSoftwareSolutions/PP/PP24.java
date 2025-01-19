import java.util.Scanner;

public class PP24 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("First number: ");
    float num1 = sc.nextFloat();
    System.out.print("Second number: ");
    float num2 = sc.nextFloat();
    System.out.println("Sum of the two numbers: " + (num1 + num2));
    System.out.println("Difference of the two numbers: " + Math.abs(num1 - num2));
    System.out.println("Product of the two numbers: " + (num1 * num2));
    sc.close();
  }

}
