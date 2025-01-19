import java.math.BigDecimal;

public class NotaLabP {

    public static double somarExs(double[] v) {
        double count = 0.0;
        for(int i = 0; i < v.length; i++) {
            count += 0.4 * (v[i] / 5.0);
        }
        return new BigDecimal(count).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double somarProjs(double[] v) {
        double count = 0.0;
        for(int i = 0; i < v.length; i++) {
            count += 3.6 * (v[i] / 20.0);
        }
        return new BigDecimal(count).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        
        double[] exs = {3.5, 3.8, 5.0, 4.5, 3.5};
        double[] projs = {15.3, 17.0, 17.7, 18.3, 18.5};
        System.out.println(somarExs(exs) + somarProjs(projs));
    }
    
}
