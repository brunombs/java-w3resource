// Write a Java program to create a class called House with private instance variables address, numberOfRooms, and area. Provide public getter and setter methods to access and modify these variables. Add a method called calculatePrice() that returns the price of the house based on its area and a price per square meter.

public class Main {
    public static void main(String[] args) {
        House house1 = new House(5, 140, "Street 2");

        System.out.println("House price: " + house1.calculatePrice(1300));
    }
}
