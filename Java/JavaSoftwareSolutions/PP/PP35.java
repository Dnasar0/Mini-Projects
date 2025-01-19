import java.util.Scanner;

public class PP35 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Radius:");
    int radius = sc.nextInt();
    double num1 = 4.0;
    double num2 = 3.0;
    double volumeFormula = ((num1 / num2) * Math.PI * (radius * radius * radius));
    System.out.print("Volume = ");
    System.out.printf("%.2f",volumeFormula);
    System.out.println("");
    double areaFormula = (4 * Math.PI * (radius * radius));
    System.out.print("Surface Area = ");
    System.out.printf("%.2f",areaFormula);
    sc.close();
  }
}
