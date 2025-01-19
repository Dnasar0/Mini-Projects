public class EX38 {

  public static void main(String[] args) {

    int num1 = 4;
    int num2 = 5;
    int num3 = squareRoot(num1 + num2);
    System.out.println(num3);
  }

  public static int squareRoot(int num) {
    int n;
    int sqrt = num / 2;
    do {
      n = sqrt;
      sqrt = (n + (num/n)) / 2;
    } while((n - sqrt)!= 0);
    return sqrt;
  }

}
