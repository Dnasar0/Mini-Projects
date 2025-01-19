public class replaceNth {

  public static String replaceNth(String text, int n, char oldValue, char newValue) {

    int copy = n;
    char[] c = text.toCharArray();
    for (int i = 0; i < c.length; i++) {
      if (copy == 1 && c[i] == oldValue) {
        c[i] = newValue;
        copy = n;
      }
      else if(c[i] == oldValue) {
        copy--;
      }
    }
    return new String(c);
  }
  
}