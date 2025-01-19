import java.util.Scanner;
public class Ex2Serie4 {
  public static int readInterval (int n, int a, Scanner canal){
    int num;
    do {
      num = canal.nextInt();
      if(num < n || num > a) {
        System.out.println("Erro, introduza um valor entre 0 e 20:");
      }
    } while((num < n) || (num > a));
    return(num);
  }
  public static void main(String[] args) {
    Scanner canal = new Scanner(System.in);
    System.out.print("Nota do projeto:");
    int notaProj = readInterval(0,20,canal);
    System.out.print("Nota do exame:");
    int notaExame = readInterval(0,20,canal);
    System.out.print("Nota da aval continua:");
    int avalContinua = readInterval(0,20,canal);
    double notaFinal = (avalContinua * 0.10 + notaExame * 0.55 + notaProj * 0.35);
    if(notaFinal > 9.5) {
      System.out.println("O aluno foi aprovado");
    }
    else {
      System.out.println("O aluno reprovou");
    }
  }
}
