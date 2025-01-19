public class addStrings {
    
    public static String add(String a, String b) {

        double sum = Double.parseDouble(a) + Double.parseDouble(b);
        return String.format("%.0f", sum);
    }

    public static void main(String[] args) {
        
        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));
    }

}
