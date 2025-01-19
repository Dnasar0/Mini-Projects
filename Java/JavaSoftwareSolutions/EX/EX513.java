public class EX513 {

  public static boolean larger(double n, double x) {
    if (n > x) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    double n = 1.0;
    double x = 2.0;
    System.out.println(larger(n,x));
    
  }
}
