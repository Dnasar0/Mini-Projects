public class EX512 {


  public static int maxOfTwo(int n, int x) {
    if (n > x) {
      return n;
    }
    else {
      return x;
    }
  }

  public static void main(String[] args) {
    int n = 1;
    int x = 2;
    System.out.println(maxOfTwo(n,x));
  }

}
