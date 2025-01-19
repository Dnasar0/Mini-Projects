import java.util.Scanner;

public class PP53{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int odd = 0;
    int even = 0;
    int zero = 0;
    for(int i = 0; i < num; i++) {
      if(i % 2 == 0) {
        even++;
      }
      else {
        odd++;
      }
      if(i == 0) {
        zero++;
      }
    }
    sc.close();
    System.out.println("Odd numbers: " + odd + "\t" + "Even number: " + even + "\t" + "Zero numbers: " + zero);
  }
}
