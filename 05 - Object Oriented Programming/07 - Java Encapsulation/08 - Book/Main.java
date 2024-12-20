// Write a Java program to create a class called “Book” with private instance variables title, author, and price. Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Encapsulation");
        book.setPrice(90);
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book price: " + book.getPrice());
        book.applyDiscount(10);
        System.out.println("Book price with applied discount: " + book.getPrice());

        Book book2 = new Book();
        book2.setTitle("Java Encapsulation new version");
        book2.setPrice(200);
        System.out.println("Book title: " + book2.getTitle());
        System.out.println("Book price: " + book2.getPrice());
        book2.applyDiscount(5);
        System.out.println("Book price with applied discount: " + book2.getPrice());
    }
}
