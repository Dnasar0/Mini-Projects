public class Pen {
// Descrever uma caneta como classe

    String type = "gel";
    String color = "blue";
    int point = 10;
    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unclick() {
        clicked = false;
    }

}