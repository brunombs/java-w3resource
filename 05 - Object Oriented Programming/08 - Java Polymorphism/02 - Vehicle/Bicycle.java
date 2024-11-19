public class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Bicycle speed increased by 12 units.");
    }
}
