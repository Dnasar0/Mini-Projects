import java.util.Arrays;
public class PhoneNumber {
    
    static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String arrString = Arrays.toString(numbers);                // "1234567890"
        String arr[]= arrString.substring(1,arrString.length()-1).split(", "); 
        sb.append("(");
        for(int i = 0; i < 3; i++) {
            sb.append(arr[i]);
        }
        sb.append(")");
        sb.append(" ");
        for(int j = 3; j < 6; j++) {
            sb.append(arr[j]);
        }
        sb.append("-");
        for(int k = 6; k < arr.length; k++) {
            sb.append(arr[k]);
        }
        return sb.toString();
      }

      public static void main(String[] args) {
          int[] v = {1,2,3,4,5,6,7,8,9,0};
          System.out.println(createPhoneNumber(v));
      }
}