public class Fracts {

    public static String convertFrac(long[][] list) {
        reduceFractions(list);
        long lcm = calculateTotalLcm(list);
        StringBuilder result = new StringBuilder();
        for(long[] fraction : list) {
        long ratio = lcm / fraction[1];
        result.append('(')
              .append(fraction[0] * ratio).append(',').append(fraction[1] * ratio)
              .append(')');
        }
        return result.toString();
    }
    
    private static void reduceFractions(long[][] list) {
        for(int i = 0; i < list.length; i++) {
            long[] fraction = list[i];
            long gcd = gcd(fraction[0], fraction[1]);
            fraction[0] = fraction[0] / gcd;
            fraction[1] = fraction[1] / gcd;
        }
    }
    
    private static long calculateTotalLcm(long[][] list) {
        long lcm = 1L;
        for(long[] fraction : list) {
            lcm = lcm(lcm, fraction[1]);
        }
        return lcm;
    }
    
    private static long lcm(long a, long b) {
        return a * b / gcd(a,b);
    }
    
    private static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        } 
        else {
            return gcd(b, a % b);
        }
    }
}