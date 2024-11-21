public class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Bird flies");
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
