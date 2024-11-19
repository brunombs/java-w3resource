public class Car extends Vehicle {
    @Override
    void speedUp() {
        super.speedUp();
        System.out.println("Car speed increased by 22 units");
    }
}
