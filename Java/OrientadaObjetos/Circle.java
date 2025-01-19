public class Circle {
    
    private double radius;
    private String color;

    public Circle() {
    // Construtor do círculo
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
    // Construtor do círculo, que pede um raio
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
    // Construtor do círculo, que pede um raio e cor
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return(this.radius * this.radius * Math.PI);
    }

    public String toString() {
        return("Radius = " + this.radius + "\nColor = " + this.color + "\nArea = " + this.getArea());
    }
}