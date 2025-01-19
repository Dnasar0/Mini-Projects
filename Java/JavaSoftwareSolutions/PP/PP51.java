import java.util.Scanner;

public class PP51 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Please input a year: ");
    int year = sc.nextInt();
    while(year < 1582) {
      System.out.print("Please input a year above 1582: ");
      year = sc.nextInt();
    }
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + "\t" + "is a leap year");
    }
    else {
      System.out.println(year + "\t" + "is not a leap year");
    }
    sc.close();
  }
}
