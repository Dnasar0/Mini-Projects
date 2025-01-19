import java.util.Scanner;

public class PP34 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("First X: ");
    int firstX = sc.nextInt();
    System.out.print("First Y: ");
    int firstY = sc.nextInt();
    System.out.println("First coordinates: (" + firstX + "," + firstY + ")");
    System.out.print("Second X: ");
    int secondX = sc.nextInt();
    System.out.print("Second Y: ");
    int secondY = sc.nextInt();
    System.out.println("Second coordinates: (" + secondX + "," + secondY + ")");
    System.out.println("Distance of the two coordinates: " + Math.sqrt(((secondX - firstX) * (secondX - firstX)) + ((secondY - firstY) * (secondY - firstY))));
    sc.close();
  }
}
