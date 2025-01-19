public class PP515 {

  public static boolean isAlpha(char c) {

    if(c.isUpperCase() || c.isLowerCase()) {

      return true;
    }

    else {

      return false;

    }

  }

  public static void main(String[] args) {
    char c = '2';
    System.out.println(isAlpha(c));

  }
  
}
