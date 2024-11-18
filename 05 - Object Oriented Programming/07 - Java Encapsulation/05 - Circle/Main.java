// Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        circle.setRadius(7);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
