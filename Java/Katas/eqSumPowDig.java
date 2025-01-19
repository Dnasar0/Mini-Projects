import java.util.Arrays;
import java.util.stream.LongStream;

public class eqSumPowDig {
    

    public static long[] eqSumPowDig(long hmax, int exp) {
        
        return LongStream.range(0, (int) hmax+1).filter(x -> eqSumPowDigAux(x, exp) && x != 0 && x != 1).toArray();
    }

    public static boolean eqSumPowDigAux(long n, int exp) {

        long sum = 0;

        long original = n;

        while(n > 0) {

            sum += Math.pow((n % 10),exp);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(eqSumPowDig(370, 3)));
    }
}
