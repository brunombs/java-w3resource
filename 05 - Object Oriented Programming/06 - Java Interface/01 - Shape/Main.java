// Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 7);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Circle circle = new Circle(6);
        System.out.println("Circle area: " + circle.getArea());

        Triangle triangle = new Triangle(6, 7);
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
