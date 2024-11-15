// Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()" that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.

public class IDGenerator {
    public static int nextID;

    static int generateID() {
        return nextID++;
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println("Generated ID: " + generateID());
        }
    }
}
