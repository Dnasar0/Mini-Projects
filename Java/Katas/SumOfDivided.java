public class SumOfDivided {
    
    public static String sumOfDivided(int[] l) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < l.length; i++) {
            for(int j = 0; j < l.length - 1; j++) {
                if((l[j] + l[j+1]) % prime[i] == 0) {
                    sb.append("(" + prime[i] + " " + (l[j] + l[j+1]) + ")");
                }
                if(l[i] % prime[i] == 0) {
                    sb.append("(" + prime[i] + " " + l[i] + ")");
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] l = {12,15};
        System.out.println(sumOfDivided(l));
    }
}
