public class ProperFractions {
    
    public static long properFractions(long n) {
        if(n == 1) {
            return 0;
        }
        long r = n;
        for(long d = 2; d*d <= n; d++) {
            if(n % d < 1){
                while(n % d < 1)
                n /= d;
                r -= r/d;
            }
        }
        if(n > 1) {
            r -= r/n;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(properFractions(15));
    }
  }