// Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();
        athlete.eat();
        athlete.exercise();
        lazyPerson.eat();
        lazyPerson.exercise();

    }
}
