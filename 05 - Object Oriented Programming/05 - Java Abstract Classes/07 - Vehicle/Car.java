public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car is running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car is stopping.");
    }
}
