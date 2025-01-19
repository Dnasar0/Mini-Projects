import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class reverseArrays {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int[] v = new int[5];
    int[] x = new int[v.length];
    for(int i = 0; i < v.length; i++) {
      v[i] = rd.nextInt(10);
    }
    System.out.println("Welcome to the reverse Arrays app! Here's the array: ");
    System.out.println(Arrays.toString(v));
    System.out.println("");
    System.out.print("To reverse the array, either type 'full', or if you want to reverse a specific interval of the array type 'part', and finally, to switch the placement of two entities, type 'custom': ");
    String option = sc.nextLine();
    if(option.equals("full")) {
      for(int i = 0; i < x.length; i++) {
        x[x.length - i - 1] = v[i];
      }
    }
    if(option.equals("part")) {
      System.out.print("Select the starting position for the reversion: ");
      int min = sc.nextInt();
      System.out.print("Select the finishing position for the reversion: ");
      int max = sc.nextInt();
      for(int i = 0; i < x.length; i++) {
        x[i] = v[i];
      }
      for(int j = min; j <= max; j++) {
        x[j] =  v[max - j];
      }
    }
    if(option.equals("custom")) {
      System.out.print("Select the first position with the number you want to switch: ");
      int pos1 = sc.nextInt();
      System.out.print("Select the second position with the number you want to switch: ");
      int pos2 = sc.nextInt();
      for(int i = 0; i < v.length; i++) {
        x[i] = v[i];
        x[pos1] = v[pos2];
        x[pos2] = v[pos1];
      }
    }
    System.out.println("Result: ");
    System.out.println(Arrays.toString(x));
  }
}
