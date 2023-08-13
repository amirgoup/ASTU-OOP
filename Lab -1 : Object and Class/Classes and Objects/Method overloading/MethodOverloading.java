public class MethodOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 30.0;
        double d = 40.0;
        MethodOverloading obj = new MethodOverloading();
        obj.sum(a, b);
        obj.sum(c, d);
    }
    public void sum(int x, int y) {
        System.out.println("Sum of two integers is " + (x + y));
    }
    public void sum(double x, double y) {
        System.out.println("Sum of two doubles is " + (x + y));
    }
}
