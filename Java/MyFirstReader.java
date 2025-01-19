import java.util.Scanner;
public class MyFirstReader {
  public static void main(String[] args) {
    Scanner canalScan = new Scanner(System.in);
    String nome;
    int inteiro;
    double decimal;
    System.out.print("Introduz o teu nome: ");
    nome = canalScan.nextLine();
    System.out.print("Introduz um numero inteiro: ");
    inteiro = canalScan.nextInt();
    System.out.print("Introduz um numero decimal: ");
    decimal = canalScan.nextDouble();
    canalScan.close();
    System.out.println("Caro " + nome + ", somar " + inteiro + " com " + decimal + " da: " + (inteiro + decimal));
  }
}
