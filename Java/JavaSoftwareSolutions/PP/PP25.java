import java.util.Scanner;

public class PP25 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Fahrenheit number to convert:");
    int num = sc.nextInt();
    System.out.println("Number in Celcius: " + ((num - 32) * (0.5556) ));
    sc.close();
  }

}
