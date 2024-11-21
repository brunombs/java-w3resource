// Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6.4);
        Rectangle rectangle = new Rectangle(7.5, 6.2);
        Triangle triangle = new Triangle(6, 7, 9.3);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
