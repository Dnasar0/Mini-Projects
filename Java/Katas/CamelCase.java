public class CamelCase {
    
    static String toCamelCase(String s){

        // create a StringBuilder to create our output string
        StringBuilder sb = new StringBuilder();
        
        // determine when the next capital letter will be
        Boolean nextCapital = false;
    
        // loop through the string
        for (int i=0; i<s.length(); i++) {
    
          // if the current character is a letter
          if (Character.isLetter(s.charAt(i))) {
    
            // get the current character
            char tmp = s.charAt(i);
    
            // make it a capital if required
            if (nextCapital) 
            
                tmp = Character.toUpperCase(tmp);
    
            // add it to our output string
            sb.append(tmp);
    
            // make sure the next character isn't a capital
            nextCapital = false;
    
          } else {
            // otherwise the next letter should be a capital
            nextCapital = true;
          }
        }
        
        // return our output string
        return sb.toString();
      }

    
    
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
}