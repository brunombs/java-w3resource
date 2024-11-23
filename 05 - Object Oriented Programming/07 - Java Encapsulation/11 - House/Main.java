// Write a Java program to create a class called House with private instance variables address, numberOfRooms, and area. Provide public getter and setter methods to access and modify these variables. Add a method called calculatePrice() that returns the price of the house based on its area and a price per square meter.

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.setAddress("Street one");
        house.setArea(120);
        house.setNumberOfRooms(3);

        System.out.println("House address: " + house.getAddress());
        System.out.println("House area: " + house.getArea() + " square units");
        System.out.println("House number of rooms: " + house.getNumberOfRooms());
        System.out.println("House price: $" + house.calculatePrice());
    }
}
