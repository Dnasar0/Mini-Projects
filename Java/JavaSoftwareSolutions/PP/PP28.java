import java.util.Scanner;

public class PP28 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Hour(s):");
    int hours = sc.nextInt();
    System.out.print("Minute(s):");
    int minutes = sc.nextInt();
    System.out.print("Second(s):");
    int seconds = sc.nextInt();
    System.out.println("Number of seconds in such interval: " + (hours * 60 * 60 + minutes * 60 + seconds));
    sc.close();
  }

}
