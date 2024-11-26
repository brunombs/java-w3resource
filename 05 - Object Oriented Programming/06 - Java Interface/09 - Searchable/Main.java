// Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Learning Java");
        System.out.println("Is the word 'Python' in the document? " + document.search("Python"));
        System.out.println("Is the word 'Java' in the document? " + document.search("Java"));

        WebPage webpage = new WebPage("GitHub");
        System.out.println("Is the word 'Hello' in the webpage? " + webpage.search("Hello"));
        System.out.println("Is the word 'GitHub' in the webpage? " + webpage.search("GitHub"));
    }
}
