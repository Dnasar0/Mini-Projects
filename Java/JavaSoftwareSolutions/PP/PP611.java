import java.util.Random;

public class PP611 {

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    Random rd = new Random();
    for(int i = 0; i < 20; i++) {
        for(int j = 0; j < rd.nextInt(2) + 1; j++) {
          System.out.print(s.append("."));
        }
    System.out.println(" ");
    }
  }
}
