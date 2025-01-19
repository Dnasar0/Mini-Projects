public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        int interesting = 0;
        if(number < 0 || number > 1000000000)
            System.out.println("Not a valid number");
        else
            if(number > 99)
                for(int i = 0; i < awesomePhrases.length; i++) {
                        for(int j = 1; j <= 2; j++) {
                            continue;
                        }
                    } 
            return interesting;
    }
  
    private static boolean allZeros(int number) {
        boolean yes = false;
        int currentDigit = 0;
        int digits = 0;
        int zeros = 0;
        while(number > 0) {
            currentDigit = number % 10;
            if(currentDigit == 0) {
                zeros++;
            }
            number /= 10;
            digits++;
        }
        if(zeros == digits - 1) 
            yes = true;
        return yes;
    }

    private static boolean sameNumber(int number) {
        boolean yes = false;
        String numberString = Integer.toString(number);
        for(int i = 0; i < numberString.length() - 1; i++) 
            if(numberString.charAt(i) == numberString.charAt(i+1)) 
                yes = true;
        return yes;
    }

    private static boolean incrementing(int number) {
        boolean yes = false;
        String numberString = Integer.toString(number);
        if( (int) numberString.charAt(numberString.length() - 1) == 0) {
            for(int i = 0; i < numberString.length() - 2; i++)
                if((int) numberString.charAt(i) < (int) numberString.charAt(i+1))
                    yes = true;
        }
        else
            for(int j = 0; j < numberString.length() - 1; j++)
                if((int) numberString.charAt(j) < (int) numberString.charAt(j+1))
                yes = true;
        return yes;
    }

    private static boolean decrementing(int number) {
        boolean yes = false;
        String numberString = Integer.toString(number);
        for(int i = 0; i < numberString.length() - 1; i++)
            if((int) numberString.charAt(i) > (int) numberString.charAt(i+1))
                yes = true;
        return yes;
    }    

    private static boolean palindrome(int number) {
        boolean yes = false;
        String numberString = Integer.toString(number);
        for(int i = 0; i < numberString.length() / 2 - 1; i++) 
            if(numberString.charAt(i) == numberString.charAt(numberString.length() - i - 1))
                yes = true;
        return yes;
    }

    public static void main(String[] args) {
        // "boring" numbers
        System.out.println(isInteresting(3, new int[]{1337, 256}));    // 0
        System.out.println(isInteresting(3236, new int[]{1337, 256})); // 0

        // progress as we near an "interesting" number
        System.out.println(isInteresting(11207, new int[]{})); // 0
        System.out.println(isInteresting(11208, new int[]{})); // 0
        System.out.println(isInteresting(11209, new int[]{})); // 1
        System.out.println(isInteresting(11210, new int[]{})); // 1
        System.out.println(isInteresting(11211, new int[]{})); // 2

        // nearing a provided "awesome phrase"
        System.out.println(isInteresting(1335, new int[]{1337, 256})); // 1
        System.out.println(isInteresting(1336, new int[]{1337, 256})); // 1
        System.out.println(isInteresting(1337, new int[]{1337, 256})); // 2
    }
  }