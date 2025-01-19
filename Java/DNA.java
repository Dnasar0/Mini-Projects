
public class DNA {
  public static boolean validDNA(String s) {
    boolean valid = s.length() >= 25 && s.length() <= 50;
    String validLetters = "ACGT";
    if(s.indexOf("A") == -1 && s.indexOf("C") == -1 && s.indexOf("G") == -1 && s.indexOf("T") == -1) {
      return(false);
    }
    char A = 'a';
    char G = 'g';
    int contA = 0;
    int contG = 0;
    for(int i = 0; i < s.length(); i++) {
      if(validLetters.indexOf(s.charAt(i)) == -1) {
        return(false);
      }
      if(s.charAt(i) == Character.toUpperCase(A)) {
        contA++;
      }
      if(s.charAt(i) == Character.toUpperCase(G)) {
        contG++;
      }
    }
    if(valid && contG >= 3 && contA <= 2) {
      return(true);
    }
    else {
      return(false);
    }
  }
    public static void main(String[] args) {
      System.out.println("valido " + validDNA("ACCTGCGTACGGTTCGTGCGGGTCC"));
      System.out.println("invalido, letra E " + validDNA("ECCTGCGTACGGTTCGTGCGGGTCC"));
      System.out.println("invalido, contA > 2 " + validDNA("AAATGCGTACGGTTCGTGCGGGTCC"));
      System.out.println("invalido, contG < 3 " + validDNA("ACCTCTACGTTCTGCCCCCTCCCCC"));
      System.out.println("invalido, s.length() < 20 " + validDNA("AGGACGGCGGG"));
      System.out.println("invalido, s.length() > 50 " + validDNA("ACCTGCGTACGGTTCGTGCGGGTCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC"));
    }
  }
