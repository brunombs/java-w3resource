// Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle width: " + rectangle.getWidth());
    }
}
