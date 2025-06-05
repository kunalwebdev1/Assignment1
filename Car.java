package Training;

// Car.java
// A program to manage and display a dream garage of cars

public class Car {

    // Attributes of the Car
    String model;
    String brand;
    double price;

    // Constructor to initialize the car's details
    public Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
        System.out.println("Price : Rs. " + price);
        System.out.println("----------------------------");
    }

    // Main method to build and display the fleet
    public static void main(String[] args) {
        // Building a fleet of 3 dream cars
        Car car1 = new Car("Model S", "Tesla", 8000000);
        Car car2 = new Car("Mustang GT", "Ford", 5500000);
        Car car3 = new Car("Civic Type R", "Honda", 4500000);

        // Displaying each car's details
        System.out.println("Welcome to the Garage of Dreams\n");
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
    }
}
