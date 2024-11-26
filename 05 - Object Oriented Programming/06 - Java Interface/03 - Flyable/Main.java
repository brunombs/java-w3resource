// Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.

public class Main {
    public static void main(String[] args) {
        Flyable[] flyables = {new Spacecraft(), new Airplane(), new Helicopter()};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
