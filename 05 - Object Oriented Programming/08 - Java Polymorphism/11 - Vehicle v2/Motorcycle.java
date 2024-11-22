public class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started with a kick-start.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped when ignition was turned off.");
    }
}
