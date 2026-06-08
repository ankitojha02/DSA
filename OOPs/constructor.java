package OOPs;

public class constructor {
    public static class Car {
        String brand;
        String model;
        int year;

        // Constructor to initialize the Car object
        Car(String brand, String model, int year) {
            this.brand = brand; // This keyword is used to refer to the current object's instance variable
            this.model = model;
            this.year = year;
        }

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        car1.display();
        car2.display();
    }
}
