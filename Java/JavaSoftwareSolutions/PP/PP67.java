public class PP67 {

  public static void main(String[] args) {
    String star = "";
    //firstStar(star);
    //secondStar(star);
    thirdStar(star);
    System.out.println(star);
  }

  public static void firstStar(String s) {
    for(int i = 10; i >= 0; i--) {
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
        System.out.println("");
    }
  }

  public static void secondStar(String s) {

    for(int i = 0; i <= 10; i++) {
      for(int j = 10; j > i; j--) {
        System.out.print(" ");
      }
        for(int k = 1; k <= i; k++) {
          System.out.print("*");
        }
          System.out.println("");
    }
  }

  public static void thirdStar(String s) {

    for(int i = 10; i > 0; i--) {
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
