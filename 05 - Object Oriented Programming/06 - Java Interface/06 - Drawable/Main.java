// Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();
    }
}
