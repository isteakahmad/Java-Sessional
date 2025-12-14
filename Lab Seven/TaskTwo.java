class Shape {
    double area(double length, double width) {
        return length * width;
    }
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Rectangle Area: " + s.area(15, 5));
        System.out.println("Circle Area: " + s.area(8));
    }
}

