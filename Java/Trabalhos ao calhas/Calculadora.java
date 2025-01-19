import java.util.Scanner;
import java.lang.Integer;

public class Calculadora {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int newnum = 0;
    int SENTINEL = 0;
    System.out.print("Welcome to the 'Calculator' program. Please input your respective integer value of your choice: ");
    int num = sc.nextInt();
    System.out.print("Please choose one of the four operators (+ " + "\t" + "-" + "\t" + "*" + "\t" + "/" + " ) : ");
    char operator = sc.next().charAt(0);
    char operator2 = ' ';
    System.out.print("Please choose the second integer of your choice: ");
    sc.nextLine();
    int num2 = sc.nextInt();
    System.out.print("Type '1' if you wish to add more values, '0' if otherwise: ");
    int stop = sc.nextInt();
    while(stop != SENTINEL) {
      System.out.print("Please choose one of the four operators (+ " + "\t" + "-" + "\t" + "*" + "\t" + "/" + " ) : ");
      operator2 = sc.next().charAt(0);
      System.out.print("Please choose an integer value of your choice: ");
      newnum = sc.nextInt();
      System.out.print("Type '1' if you wish to add more values, '0' if otherwise: ");
      stop = sc.nextInt();
    }

    if(operator == '+') {
      answer = num + num2;
    }

    if(operator2 == '+') {
      answer += newnum;
    }

    if(operator == '-') {
      answer = num - num2;
    }

    if(operator2 == '-') {
      answer -= newnum;
    }

    if(operator == '*') {
      answer = num * num2;
    }

    if(operator2 == '*') {
      answer *= newnum;
    }

    if(operator == '/') {
      answer = num / num2;
    }

    if(operator2 == '/') {
      answer /= newnum;
    }

    if(stop == SENTINEL) {
      System.out.println("The answer: " + answer);
    }
  }
}
