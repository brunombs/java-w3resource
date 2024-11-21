// Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Panthera panthera = new Panthera();

        animal.makeSound();
        animal.move();

        bird.makeSound();
        bird.move();

        panthera.makeSound();
        panthera.move();
    }
}
