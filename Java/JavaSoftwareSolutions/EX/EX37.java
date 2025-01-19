import java.util.Random;

public class EX37 {

  public static void main(String[] args) {

  Random rand = new Random();
  int a = rand.nextInt(11);
  int b = rand.nextInt(501);
  int c = rand.nextInt(10) + 1;
  int d = rand.nextInt(500) + 1;
  int e = rand.nextInt(26) + 25;
  int f = rand.nextInt(26) - 10;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
  System.out.println(f);

  }
}
