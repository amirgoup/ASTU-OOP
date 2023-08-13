class Car {
  String color;
  int year;
  String make;
}

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.color = "red";
    myCar.year = 2023;
    myCar.make = "Toyota";
    System.out.println("My car is a " + myCar.color + " " + myCar.year + " " + myCar.make);
  }
}

