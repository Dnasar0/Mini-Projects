public class Box {

  private int height;
  private int width;
  private int depth;
  private boolean full;

  public Box(int height, int width, int depth) {

    this.height = height;
    this.width = width;
    this.depth = depth;
    this.full = false;
  }

  public int setBoxHeigth(int height) {

    this.height = height;
    return height;
  }

  public int getBoxHeigth() {

    return height;
  }

  public int setBoxWidth(int width) {

    this.width = width;
    return width;
  }

  public int getBoxWidth() {

    return width;
  }

  public int setBoxDepth(int depth) {

    this.depth = depth;
    return depth;
  }

  public int getBoxDepth() {

    return depth;
  }

  public String toString() {

    String boxHeigth = "Heigth of the box: ";
    String boxWidth = "Width of the box: ";
    String boxDepth = "Depht of the box: ";
    String boxFull = "Is box full? ";

    return(boxHeigth + height + "\t" + boxWidth + width + "\t" + boxDepth +
    depth + "\t" + boxFull + full);
  }

  public static void main(String[] args) {  // Supposed to be a driver class 

    Box box1 = new Box(6,4,12);
    Box box2 = new Box(10,7,8);
    Box box3 = new Box(5,5,5);
    box1.setBoxHeigth(7);
    System.out.println(box1);
    box2.setBoxWidth(6);
    System.out.println(box2);
    box3.setBoxDepth(7);
    System.out.println(box3);
  }
}
