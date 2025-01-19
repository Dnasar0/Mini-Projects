import java.util.Random;

public class Matricula {

  public static String geraMatricula(int n, int m) {
    String abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder s = new StringBuilder();
    Random rd = new Random();
    char letra1 = abcedario.charAt(rd.nextInt(abcedario.length()));
    int num = rd.nextInt(3) + 1;
    char letra2 = abcedario.charAt(rd.nextInt(abcedario.length()));
    for(int i = 0; i < n; i++) {
      s.append(letra1);
    }
    s.append("-");
    for (int j = 0; j < m; j++) {
      s.append(num);
    }
    s.append("-");
    for(int k = 0; k < n; k++) {
      s.append(letra2);
    }
    return (s.toString());
  }

  public static void main(String[] args) {
    System.out.println(geraMatricula(2,3));
  }
}
