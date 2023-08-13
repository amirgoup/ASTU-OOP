public class MyClass {
  int x;

  public MyClass() {
    x = 0;
  }

  public MyClass(int i) {
    x = i;
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    MyClass myObj2 = new MyClass(5);
    System.out.println("Value of x in myObj: " + myObj.x);
    System.out.println("Value of x in myObj2: " + myObj2.x);
  }
}
