import java.util.Arrays;
public class ExVetor {
  public static int[] addVectors(int[] v, int[] w) {
    int[] soma = new int[v.length];
    for(int i = 0; i < v.length; i++) {
      soma[i] = v[i] + w[i];
    }
    return soma;
  }

  public static void main(String[] args) {
      int[] v = {1,3,4};
      int[] w = {3,1,2};
      int[] soma = addVectors(v,w);
      System.out.println(Arrays.toString(soma));
   }
}
