public class Car extends Vehicle {
    int seatCount;

    public Car(String name, String model, int year, double fuelEfficiency, int seatCount) {
        super(name, model, year, fuelEfficiency);
        this.seatCount = seatCount;
    }

    @Override
    double maxSpeed() {
        return 210;
    }

    @Override
    public void printDetails() {
        System.out.println("----------CAR----------");
        super.printDetails();
        System.out.println("Seat Count: " + seatCount);
    }
}
