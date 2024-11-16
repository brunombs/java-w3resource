public class Motorcycle extends Vehicle {
    int engineDisplacement;

    public Motorcycle(String name, String model, int year, double fuelEfficiency, int engineDisplacement) {
        super(name, model, year, fuelEfficiency);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    double maxSpeed() {
        return 180;
    }

    @Override
    public void printDetails() {
        System.out.println("----------MOTORCYCLE----------");
        super.printDetails();
        System.out.println("Engine Displacement: " + engineDisplacement);
    }
}
