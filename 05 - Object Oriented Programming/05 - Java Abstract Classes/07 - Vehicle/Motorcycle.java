public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle is running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle is stopping.");
    }
}
