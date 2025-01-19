public class HumanReadableTime {

    public static String makeReadable(int seconds) {
      int minutes;
      int hours;
      if(seconds < 0 || seconds > 3599999) 
        return null;

      else
        minutes = (seconds / 60) % 60;
        hours = seconds / (60*60);
        seconds = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
      System.out.println(makeReadable(123));   
    }
  }