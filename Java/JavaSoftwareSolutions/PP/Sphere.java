public class Sphere {

  private int diameter;

  public Sphere(int diameter) {

    this.diameter = diameter;
  }


  public int setDiameter(int diameter) {

    this.diameter = diameter;
    return diameter;
  }

  public int getDiameter() {

    return diameter;
  }

  public double getVolume() {

    return ((4.0 / 3.0) * Math.PI * (Math.pow(diameter/2.0, 3)));
  }

  public double getArea() {

    return (4.0 * Math.PI * (Math.pow(diameter/2.0, 2)));
  }

  public String toString() {

    String theDiameter = "Diameter: ";
    return(theDiameter + diameter);

  }

  public static void main(String[] args) {  // Supposed to be a driver class 

    Sphere diameter1 = new Sphere(4);
    Sphere diameter2 = new Sphere(3);
    diameter1.setDiameter(2);
    System.out.println(diameter1 + "\t" + "Volume: " + diameter1.getVolume() + "\t" + "Area: " + diameter1.getArea());
    System.out.println(diameter2 + "\t" + "Volume: " + diameter2.getVolume() + "\t" + "Area: " + diameter2.getArea());


  }
}
