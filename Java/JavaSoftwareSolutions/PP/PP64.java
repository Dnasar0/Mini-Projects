public class PP64 {

  public static void main(String[] args) {
    int max = 100;
    for(int i = 0; i < 2; i++) {
      System.out.println(max - i + " bottles of beer on the wall");
      System.out.println(max - i + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println(max - i - 1 + " bottles of beer on the wall");
      System.out.println(" ");
    }
  }
}
