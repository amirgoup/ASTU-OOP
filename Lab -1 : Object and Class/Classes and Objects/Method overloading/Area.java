public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of rectangle: " + area.area(5, 10));
        System.out.println("Area of triangle: " + area.area(5, 10, 15));
        System.out.println("Area of circle: " + area.area(5));
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}
