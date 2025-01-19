public class nextSmaller {
    

    public static long nextSmallerNumber(long n ) {

        String numString = numberToString(n);

        if(numString.length() == 1) return n;

        for(int i = 0; i < numString.length(); i++) {

            for(int j = i + 1; j < numString.length() - 1; j++)

            if(numString.charAt(numString.length() - i) < numString.charAt(numString.length() - 1 - i)) {

                numString = numString.substring(0, )


                return Long.parseLong(sb.toString());
            }
        }

        return n;
    }

    private static String numberToString(long n) {

        StringBuilder num = new StringBuilder();

        while(n > 0) {

            num.append(n%10);

            n/=10;
        }

        return num.reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println(nextSmallerNumber(531));

        
    }
}
