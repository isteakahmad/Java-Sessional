abstract class Shape {
    abstract double area();   
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        System.out.println("Area of Circle: " + c.area());
        Rectangle r = new Rectangle(410,56);
        System.out.println("Area of Rectangle: " + r.area());
    }
}

