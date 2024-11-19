// Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle speed: " + bicycle.getSpeed());
        System.out.println("Car speed: " + car.getSpeed());
        car.speedUp();
        bicycle.speedUp();
    }
}
