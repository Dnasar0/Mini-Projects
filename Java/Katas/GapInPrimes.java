public class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        long[] v = new long[2];
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    v[0] = last; 
                    v[1] = i;
                }
                last = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}