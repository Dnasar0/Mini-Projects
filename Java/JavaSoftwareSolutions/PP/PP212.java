import java.util.Scanner;

public class PP212 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Length of square:");
    int length = sc.nextInt();
    System.out.println("Perimeter: " + length * 4 + ", Area: " + length * length);
    sc.close();
  }
}
