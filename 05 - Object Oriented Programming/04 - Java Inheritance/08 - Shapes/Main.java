// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

public class Main {
    public static void main(String[] args) {
        Shape Circle = new Circle(8);
        Shape Circle2 = new Circle(3.2);
        System.out.println("Circle's area is " + Circle.getArea());
        System.out.println("Circle's perimeter is " + Circle.getPerimeter());
        System.out.println("Circle's area is " + Circle2.getArea());
        System.out.println("Circle's perimeter is " + Circle2.getPerimeter());
    }
}
