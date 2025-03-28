public class mysteryFunction {
    

	public static long mystery(long n) {

		return n ^ (n >> 1);
	}

	public static long mysteryInv(long n) {

        for (long mask = n >> 1; mask != 0; mask >>= 1) {
            
            n = n ^ mask;
        }

        return n;
	}

	public static String nameOfMystery() {

		return "Gray code";
	}


    public static void main(String[] args) {

    }

}
 