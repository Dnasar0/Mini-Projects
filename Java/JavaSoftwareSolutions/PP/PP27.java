import java.util.Scanner;

public class PP27 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Speed:");
    float speed = sc.nextInt();
    System.out.print("Distance:");
    float distance = sc.nextInt();
    System.out.println("Time necessary to meet such speed: " + (distance/speed) + "s");
    sc.close();
  }
}
