public class EX514 {

  public static boolean evenlyDivisible(int n, int m) {

    if(n % m == 0 || m % n == 0 ) {

      return true;
    }

    else {

      return false;

    }
  }

    public static void main(String[] args) {
      int x = 10;
      int e = 5;
      System.out.println(evenlyDivisible(x,e));

    }

  }
