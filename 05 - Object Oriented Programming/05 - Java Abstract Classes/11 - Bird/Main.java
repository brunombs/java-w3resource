// Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.

public class Main {
    public static void main(String[] args) {
        Hawk hawk = new Hawk();
        Eagle eagle = new Eagle();
        hawk.fly();
        hawk.makeSound();
        eagle.fly();
        eagle.makeSound();
    }
}
