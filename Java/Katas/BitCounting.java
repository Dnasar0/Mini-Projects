import java.util.Arrays;

public class BitCounting {

	public static int countBits(String ip){

        String[] splitIP = ip.split("\\.");
        int count = 0;

        for(int i = 0; i < splitIP.length; i++) {

            String binary = Integer.toBinaryString(Integer.parseInt(splitIP[i]));

            for(int j = 0; j < binary.length(); j++) {
                    count++;
            }
	    }
        return count;
    }


    public static void main(String[] args) {
        
        System.out.println(countBits("192.168.1.106"));
    }
	
}