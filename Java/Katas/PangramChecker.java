public class PangramChecker {

    public static boolean check(String sentence) {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(!sentence.toLowerCase().contains("" + ch))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }
}