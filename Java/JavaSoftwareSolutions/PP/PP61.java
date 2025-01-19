import java.util.Scanner;

public class PP61 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Type in a number greater than 2: ");
    int n = sc.nextInt();
    int sum = 0;
    while(n <= 2) {
      System.out.print("Error, please type a number greater than 2: ");
      n = sc.nextInt();
    }
    for(int i = 2; i <= n; i++) {
      if(i % 2 == 0) {
        sum += i;
      }
    }
    sc.close();
    System.out.println("The sum of even integers between 2 and " + n + " is: " + sum);
  }
}
