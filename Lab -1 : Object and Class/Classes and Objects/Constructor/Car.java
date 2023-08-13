public class Car {
  String make;
  String model;
  int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Corolla", 2022);
    System.out.println(myCar.make);
    System.out.println(myCar.model);
    System.out.println(myCar.year);
  }
}
