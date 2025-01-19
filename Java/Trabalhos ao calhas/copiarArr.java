import java.util.Arrays;

public class copiarArr {
    

    public static String reverse(String str) {

        StringBuilder sb = new StringBuilder();
        String[] etapas = str.split(" ");
        char c;

        for (int i = 0; i < etapas.length; i++) {

            String s = "";

            for(int j = 0; j < etapas[i].length(); j++) {

                s += etapas[i].charAt(etapas[i].length() - j - 1);
            }

            etapas[i] = s;
        }
        
        for (int i = 0; i < etapas.length; i++) {

            sb.append(etapas[i] + " ");
            
        }

        return sb.subSequence(0, sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        
        String s = reverse("a b c d");
        System.out.println(s);
    }
}
