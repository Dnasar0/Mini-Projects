public class HighAndLow {
    
    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        String big = array[0];
        String small = array[0];

        for(int i = 0; i < array.length; i++) {
            if(Integer.parseInt(big) <= Integer.parseInt(array[i]))
                big = array[i];

            else if(Integer.parseInt(small) >= Integer.parseInt(array[i]))
                small = array[i];

        }
        return (big + " " + small);
    }

      public static void main(String[] args) {
          String a = "1 2 3 4";
          System.out.println(highAndLow(a));
      }
}
