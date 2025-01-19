import java.lang.Character;

public class passwordValida {
  public static boolean passwordValida(String s) {
    int comprimento = s.length();
    int caract1 = s.indexOf("!");
    int caract2 = s.indexOf("~");
    int numDigs = 0;
    for(int i = 0; i < comprimento; i++) {
      if(Character.isDigit(s.charAt(i))) {
        numDigs++;
      }
    }
    if((4 < comprimento && comprimento < 10) && (caract1 > 0 || caract2 > 0) && numDigs == 2) {
      return(true);

    }
    else
      return(false);
  }
  public static void main(String[] args) {
    System.out.println(passwordValida("oi"));
  }
}
