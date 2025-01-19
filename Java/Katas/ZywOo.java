public class ZywOo {

    public static String warnTheSheep(String[] array) {
    
        String wolf = "wolf";
        if(array[array.length - 1].equals("wolf")) {
            return "Pls go away and stop eating my sheep";
        }
        else {
            for(int i = 0; i < array.length; i++) {
                if(array[i].equals("wolf")) {
                    return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
                }
            }
            return "";
        }
    }

    public static void main(String[] args) {
        
        String[] farm = new String[]{"sheep", "sheep", "wolf"};
        System.out.println(warnTheSheep(farm));
    }
  
}