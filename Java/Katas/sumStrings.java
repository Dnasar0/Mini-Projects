
public class sumStrings {

    public static String sumStrings(String aa, String bb) {

        char[] a = aa.replaceFirst("^0+(?!$)", "").toCharArray(), b = bb.replaceFirst("^0+(?!$)", "").toCharArray();
        int carry = 0; StringBuilder sb = new StringBuilder();
        int maxL = Math.max(a.length, b.length);
        
        for(int i = maxL - 1; i >= 0; i--){
            
          int ca = (i + a.length - maxL >= 0 ? a[i + a.length - maxL] : '0') - '0';
          int cb = (i + b.length - maxL >= 0 ? b[i + b.length - maxL] : '0') - '0';
          int s = ca + cb + carry;
          carry = s / 10;
          s %= 10;
          sb.append(s);
        }
        return sb.append(carry != 0 ? carry : "").reverse().toString();
      }

        public static void main(String[] args) {
            
            System.out.println(sumStrings("123","456"));
        }

    }


