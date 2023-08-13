class Person {
  String name;
  int age;
  String sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void sayHello() {
    System.out.println("Hello, my name is " + name + ", I am " + age + " years old, and I am " + sex + ".");
  }
}

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("Alice");
    person1.setAge(25);
    person1.setSex("female");

    Person person2 = new Person();
    person2.setName("Bob");
    person2.setAge(30);
    person2.setSex("male");

    person1.sayHello();
    person2.sayHello();
  }
}
