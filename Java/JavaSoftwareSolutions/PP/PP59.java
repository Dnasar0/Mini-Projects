import java.util.Scanner;

public class PP59 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Type in a sentence: ");
    String string = sc.nextLine();
    int num = 0;
    String numeros = "0123456789";
    for(int i = 0; i < string.length(); i++) {
      for(int j = 0; j <numeros.length(); j++) {
        if(string.charAt(i) == numeros.charAt(j)) {
          num++;
        }
      }
    }
    sc.close();
    System.out.println("String given: " + string);
    System.out.println("Number of integers in string: " + num);
  }
}
