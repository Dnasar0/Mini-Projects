import java.util.Scanner;

public class EX311 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Double number:");
      double value = sc.nextDouble();
      System.out.println("Result of number by 4th power: " + (value * value * value * value));

    }
}
