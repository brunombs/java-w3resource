// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Focus", "Ford", 2016, 9, 5);
        Truck truck = new Truck("Volvo", "VX120", 2015, 5, 25);
        Motorcycle motorcycle = new Motorcycle("BMW", "GS1200", 2023, 24, 1200);
        Truck truck2 = new Truck("Old Volvo", "Slowt", 1973, 3, 12);

        car.printDetails();
        truck.printDetails();
        motorcycle.printDetails();
        truck2.printDetails();
    }
}
