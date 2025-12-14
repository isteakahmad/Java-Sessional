class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

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

        Calculator c = new Calculator();
        System.out.println("Add (int,int): " + c.add(10, 20));
        System.out.println("Add (double,double): " + c.add(5.5, 3.3));
        System.out.println("Add (int,int,int): " + c.add(1, 2, 3));

        Shape s = new Shape();
        System.out.println("Rectangle Area: " + s.area(5, 10));
        System.out.println("Circle Area: " + s.area(7));
    }
}

