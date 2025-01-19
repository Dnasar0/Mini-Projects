import java.util.Scanner;

public class PP69 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;
    System.out.print("Please type in a string: ");
    String s = sc.nextLine();
    for(int k = 0; k < s.length(); k++) {
      if(s.charAt(k) == 'a')
        a++;
      if(s.charAt(k) == 'e')
        e++;
      if(s.charAt(k) == 'i')
        i++;
      if(s.charAt(k) == 'o')
        o++;
      if(s.charAt(k) == 'u')
        u++;
    }
    sc.close();
    System.out.println("There are: ");
    System.out.println(a + " a's");
    System.out.println(e + " e's");
    System.out.println(i + " i's");
    System.out.println(o + " o's");
    System.out.println(u + " u's");
  }
}
