class Car {
    String brand;
    String model;
    double price;
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayCar() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
    public String toString() {
        return "Car{brand='" + brand + "', model='" + model + "', price=" + price + "}";
    }
}
public class Main {
    public static void main(String[] args) {
        // create Car objects using the constructor
        Car c1 = new Car("Toyota", "Corolla", 180000);
        Car c2 = new Car("BMW", "X5", 750000)

        System.out.println("== Car 1 ==");
        c1.displayCar();
        System.out.println();
        System.out.println("== Car 2 ==");
        c2.displayCar();
        System.out.println();
        System.out.println("Summary:");
        System.out.println(c1);
        System.out.println(c2);
    }
}

