// Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition, override the sound() method to make a specific sound for each animal.

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();

        Lion lion = new Lion();
        lion.eat();
        lion.sound();

        Panther panther = new Panther();
        panther.eat();
        panther.sound();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sound();
    }
}
