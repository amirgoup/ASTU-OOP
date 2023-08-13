public class Person {
  String name;
  int age;
  String sex;

  public Person(String n, int a, String s) {
    name = n;
    age = a;
    sex = s;
  }

  public static void main(String[] args) {
    Person myObj = new Person("John", 30, "Male");
    System.out.println(myObj.name);
    System.out.println(myObj.age);
    System.out.println(myObj.sex);
  }
}
