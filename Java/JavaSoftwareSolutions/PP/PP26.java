import java.util.Scanner;

public class PP26 {

  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.print("Number to kilometres:");
    float num = sc.nextFloat();
    System.out.println("Number in kilometres: " + (num * 1.60935));
    sc.close();
  }

}
