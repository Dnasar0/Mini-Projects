public class EX515 {

  public static boolean isAlpha(char c) {

    if(Character.isLetter(c) && (Character.isUpperCase(c) || Character.isLowerCase(c))) {

      return true;
    }

    else {

      return false;

    }

  }

  public static void main(String[] args) {
    char c = 'a';
    System.out.println(isAlpha(c));

  }

}
