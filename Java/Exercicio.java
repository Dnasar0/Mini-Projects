import java.util.Scanner;
public class MyFirstReader {
  public static void main(String[] args) {
    Scanner canalScan = new Scanner(System.in);
    String nome;
    int inteiro;
    double decimal;
    System.out.println("Introduz o teu nome: ");
    nome = canalScan.nextLine();
    System.out.println("Introduz um numero inteiro: ");
    inteiro = canalScan.nextInt();
    System.out.println("Introduz um numero decimal: ");
    decimal = canalScan.nextDouble();
    System.out.println("Caro " + nome + ", somar " + inteiro + "com " + decimal + " dá " + (inteiro + decimal));
  }
}
