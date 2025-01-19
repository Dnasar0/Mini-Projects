import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;

  public class Triangles2 {


  	public static void main(String[] args) {

  		// receive the argument and parse to an int
      try {
  		    int inputValue = Integer.parseInt(args[0]);
          printTriangle(inputValue);
      }
      catch(NumberFormatException e) {
        System.out.println("Argumento nao e um inteiro");
      }
      catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Argumento e necessario");
      }
  	}

  	/**
  	 * Print an isosceles triangle with a given height and symbol
  	 *
  	 * @param height height of the triangle to be printed
  	 * @param symbol symbol to be used when printing
  	 * @requires {@code height > 0}
  	 */

  	public static void printTriangle(int height) {
      // outer loop to handle number of rows
              //  n in this case
              for (int i=0; i< height; i++) {


                  // inner loop to handle number spaces
                  // values changing acc. to requirement
                  for (int j=height-i; j>1; j--) {

                      // printing spaces
                      System.out.print(" ");
                  }

                  //  inner loop to handle number of columns
                  //  values changing acc. to outer loop
                  for (int j=0; j<=i; j++) {

                      // printing stars
                      System.out.print("* ");
                  }

                  // ending line after each row
                  System.out.println();
              }

  	}
}
