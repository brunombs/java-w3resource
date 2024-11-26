// Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle height: " + rectangle.getHeight());
        rectangle.resizeAll(3, 4);
        System.out.println("Rectangle width after resize: " + rectangle.getWidth());
        System.out.println("Rectangle height after resize: " + rectangle.getHeight());
        rectangle.resizeHeight(9);
        rectangle.resizeWidth(10);
        System.out.println("Rectangle width after another resize: " + rectangle.getWidth());
        System.out.println("Rectangle height after another resize: " + rectangle.getHeight());

    }
}
