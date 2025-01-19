import java.text.DecimalFormat;
import java.util.Random;

public class PP33 {

  public static void main(String[] args) {

    Random rd = new Random();
    int firstSet = (rd.nextInt(7) + 1) * 100 + (rd.nextInt(8) * 10) + (rd.nextInt(8));
    int secondSet = rd.nextInt(743);
    int thirdSet = rd.nextInt(10000);

    DecimalFormat df3 = new DecimalFormat("000");
    DecimalFormat df4 = new DecimalFormat("0000");

    String phoneNumber = df3.format(firstSet) + "-" + df3.format(secondSet) + "-" + df4.format(thirdSet);

    System.out.println(phoneNumber);
    
  }
}
