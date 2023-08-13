public class MyClass {
    int x;
    int y;

    public MyClass(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printX() {
        System.out.println("The value of x is " + this.x);
    }

    public void printY() {
        System.out.println("The value of y is " + this.y);
    }

    public void printXY() {
        System.out.println("The value of x is " + this.x + " and the value of y is " + this.y);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        obj.setY(10);
        obj.printX();
        obj.printY();
        obj.printXY();
    }
}
