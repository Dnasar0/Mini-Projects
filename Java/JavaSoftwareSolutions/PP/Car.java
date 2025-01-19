public class Car {

  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String setCarMake(String make) {

    this.make = make;
    return make;
  }

  public String getCarMake() {

    return make;
  }

  public String setCarModel(String model) {

    this.model = model;
    return model;
  }

  public String getCarModel() {

    return model;
  }


  public int setCarYear(int year) {

    this.year = year;
    return year;
  }

  public int getYear() {

    return year;
  }

  public String toString() {

    String carMake = "Car's make: ";
    String carModel = "Car's model: ";
    String carYear = "Car's year: ";
    return carMake + make + "\t" + carModel + model + "\t" + carYear + year;
  }

  public static void main(String[] args) {  // Supposed to be a driver class 

    Car car1 = new Car("Honda","Civic",2018);
    Car car2 = new Car("Hyundai","Elantra",2021);
    Car car3 = new Car("Chevrolet","Sonic",2017);
    car1.setCarYear(2012);
    System.out.println(car1);
    car2.setCarModel("HHHHH");
    System.out.println(car2);
    car3.setCarMake("Windows");
    System.out.println(car3);

  }
}
