// Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Circle area: " + circle.calculateArea());
        circle.draw();

        Square square = new Square(5);
        System.out.println("Square area: " + square.calculateArea());
        square.draw();
    }
}
