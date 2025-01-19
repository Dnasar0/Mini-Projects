public class CountIPAddresses {

	public static long ipsBetween(String start, String end) {
        long difference = IPtoDecimal(end) - IPtoDecimal(start);
        return difference;
    }

    public static long IPtoDecimal(String ip) {
        String[] arr = ip.split("\\.");
        long num = 0;
        for(int i = 0; i < arr.length; i++) {
            int power = 3 - i;
            num += ((Integer.parseInt(arr[i]) % 256 * Math.pow(256, power)));
        }
        return num;
    }

    public static void main(String[] args) {
        //System.out.println(ipsBetween("10.0.0.0", "10.0.1.0"));
        System.out.println(IPtoDecimal("0.0.1.1"));
    }
}