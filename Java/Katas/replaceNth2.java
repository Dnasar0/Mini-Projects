public class replaceNth2 {

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
      
        StringBuilder sb = new StringBuilder();
        int occurences = 0;
      
        if(n > 0) {

            for(int i = 0; i < text.length(); i++) {
            
                if(text.charAt(i) == oldValue) {
            
                    occurences++;
            
                    if(occurences % n == 0) {
    
                        sb.append(newValue);
                    }

                    else {

                        sb.append(oldValue);
                    }
                }

                else {

                    sb.append(text.charAt(i));
                }
            }
            return sb.toString();
        }

        else {

            return text;
        }

    }

    public static void main(String[] args) {
        
        System.out.println(replaceNth("Vader said: No, I am your father!", 0, 'a', 'o'));
    }
}