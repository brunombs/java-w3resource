public class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped when the key was turned off.");
    }
}
