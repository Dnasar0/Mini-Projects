import java.util.Arrays;
public class ExVetor2 {
  public static int[] min(int[] v, int[] x) {
    int[] m = new int[v.length];
    for(int i = 0; i < v.length; i++) {
      if(v[i] < x[i]) {
        m[i] = v[i];
      }
      else if(x[i] < v[i]) {
        m[i] = x[i];
      }
    }
    return m;
  }

  public static int[] paresImpares(int[] v) {
    int[] x = new int[2];
    int pares = 0;
    int impares = 0;
    for(int i = 0; i < v.length; i++) {
      if(v[i] % 2 == 0) {
        pares++;
        x[0] = pares;
      }
      else {
        impares++;
        x[1] = impares;
      }
    }
    return x;
  }

  public static void main(String[] args) {
    int[] v = {0,2,1};
    int[] x = {1,1,4};
    System.out.println(Arrays.toString(min(v,x)));
    System.out.println(Arrays.toString(paresImpares(v)));
  }
}
