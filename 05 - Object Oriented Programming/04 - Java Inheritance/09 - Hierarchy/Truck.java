public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String name, String model, int year, double fuelEfficiency, double cargoCapacity) {
        super(name, model, year, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    double maxSpeed() {
        return 120;
    }

    @Override
    public void printDetails() {
        System.out.println("----------TRUCK----------");
        super.printDetails();
        System.out.println("Cargo capacity in tons: " + cargoCapacity);
    }
}
