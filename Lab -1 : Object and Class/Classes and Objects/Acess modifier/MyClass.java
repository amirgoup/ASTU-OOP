class MyClass {
  private int privateField;
  public int publicField;

  private void privateMethod() {
    System.out.println("This is a private method.");
  }

  public void publicMethod() {
    System.out.println("This is a public method.");
  }

  public void setPrivateField(int value) {
    this.privateField = value;
  }

  public int getPrivateField() {
    return this.privateField;
  }
}

public class Main {
  public static void main(String[] args) {
    MyClass myObject = new MyClass();

    // Accessing public fields and methods is allowed from anywhere.
    myObject.publicField = 42;
    myObject.publicMethod();

    // Accessing private fields and methods is only allowed from within the same class.
    // The following lines will cause compilation errors:
    // myObject.privateField = 42;
    // myObject.privateMethod();

    // To access private fields and methods from outside the class, we can use public getters and setters.
    myObject.setPrivateField(42);
    System.out.println(myObject.getPrivateField());
  }
}
