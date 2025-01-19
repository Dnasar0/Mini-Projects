import java.lang.String;

public class Ex3Serie4 {
      static int countinString(String s, char ch)
    {
        s = s.toUpperCase();
        ch = Character.toUpperCase(ch);
          //base case;
        if(s.length()==0)
            return 0;
          int count = 0;

          //checking if the first character of
          //the given string is that character
          //or not
          if(s.charAt(0) == ch)
          count++;

          //this will count the occurrence of
          //given character in the string
          //from index 1 to the last
          //index of the string
          count+=countinString(s.substring(1),ch);


        return count;
    }
    public static void main (String[] args) {
        String str = "TestE";
        char c = 'E';
        System.out.println(countinString(str, c));
    }
}
