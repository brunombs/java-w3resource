// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Deer deer = new Deer();
        tiger.eat();
        lion.eat();
        deer.eat();
        tiger.sleep();
        lion.sleep();
        deer.sleep();
    }
}
