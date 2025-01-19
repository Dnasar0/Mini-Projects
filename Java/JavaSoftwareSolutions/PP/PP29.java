import java.util.Scanner;

public class PP29 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Seconds:");
    int num = sc.nextInt();
    int hours = (num / 3600);
    int minutes = (num % 3600) / 60;
    int seconds = (num % 60);
    System.out.println("Time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    sc.close();
  }
}
