public class Dog {

private String name;
private int age;

  public Dog(String name, int age) {

    this.name = name;
    this.age = age;
  }

  public String setDogName(String name) {

    this.name = name;
    return name;
  }

  public String getDogName() {

    return name;
  }

  public int setDogAge(int age) {

    this.age = age;
    return age;
  }

  public int getDogAge() {

    return age;
  }

  public int ageHuman() {

    return age * 7;
  }

  public String toString() {

    String dogsname = "Dog's name: ";
    String dogsage = "Dog's age: ";
    return dogsname + name + "\t" + dogsage + age;
  }

  public static void main(String[] args) {  // Supposed to be a driver class 

    Dog dog1 = new Dog("Olaf", 2);
    Dog dog2 = new Dog("Bob", 3);
    Dog dog3 = new Dog("Indie", 1);

    dog1.setDogAge(9);
    System.out.println(dog1);

    dog2.setDogName("Walten");
    System.out.println(dog2);

    System.out.println(dog3);

    System.out.println();
    System.out.println("Dog's ages in person's years:");
    System.out.println(dog1.ageHuman());
    System.out.println(dog2.ageHuman());
    System.out.println(dog3.ageHuman());

  }
}
