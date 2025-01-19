import java.util.Scanner;
import java.lang.Integer;

public class PP23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Your name:");
    String name = sc.nextLine();
    System.out.print("Your age:");
    int age = Integer.parseInt(sc.nextLine());
    System.out.print("Your college:");
    String college = sc.nextLine();
    System.out.print("Your pet's name:");
    String petname = sc.nextLine();
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + college + ", though I miss my pet " + petname + " very much!");
    sc.close();
  }


}
