import java.sql.SQLOutput;

public abstract class Vehicle {
    String name;
    String model;
    int year;
    double fuelEfficiency;

    public Vehicle(String name, String model, int year, double fuelEfficiency) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    abstract double maxSpeed();

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
        System.out.println("Max Speed: " + maxSpeed());
    }
}
