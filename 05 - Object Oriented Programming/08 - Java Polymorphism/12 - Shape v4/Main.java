// Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Cylinder cylinder = new Cylinder(4.0, 9.0);

        circle.draw();
        System.out.println(circle.calculateArea());
        cylinder.draw();
        System.out.println(cylinder.calculateArea());
    }
}
