import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class RomanNumerals {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if(number == l) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);

    }

     
    private static final Map<Character, Integer> roman = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
 
    public static int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            
            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.
            if (i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                i++;
            }
            else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }
  }