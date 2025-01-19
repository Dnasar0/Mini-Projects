import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class changeArrays {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int SENTINEL = 0;
    int row, column, num;
    int stop = 10;
    int[][] v = new int[2][2];
    for(int i = 0; i < v.length; i++) {
      for(int j = 0; j < v[0].length; j++) {
          v[i][j] = rd.nextInt(10);
      }
    }
    System.out.println("Welcome to an array editor app! Here is the array: ");
    System.out.println(Arrays.deepToString(v).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    System.out.println("");
    System.out.println("This app allows you to change the values in any position of the array. The first column and row is '0'. You will be asked to provide both the row and the column where the entity is located to change it.");
    System.out.println("");
    while(stop != SENTINEL) {
      System.out.print("Please select the row where the number you wish to edit is located : ");
      row = sc.nextInt();
      while(row > v.length - 1 || row < 0) {
        System.out.print("Not a valid row, please select a row between 0 and " + (v.length - 1) + " : ");
        row = sc.nextInt();
      }
      System.out.print("Please select the column where the number you wish to edit is located : ");
      column = sc.nextInt();
      while(column > v.length - 1 || column < 0) {
        System.out.print("Not a valid column, please select a column between 0 and " + (v[0].length - 1) + " : ");
        column = sc.nextInt();
      }
      System.out.print("Now type a number you wish to replace the one on the current position: ");
      num = sc.nextInt();
      v[row][column] = num;
      System.out.println("Here is the alteration: ");
      System.out.println(Arrays.deepToString(v).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
      System.out.print("Do you wish to continue making alterations? If so, type '1', otherwise, type '0': ");
      stop = sc.nextInt();
    }
    if(stop == SENTINEL) {
      System.out.println("");
      System.out.println("Final array: ");
      System.out.println(Arrays.deepToString(v).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
  }
}
