public class Main {
    public static void main(String[] args) {
        Car car = new Car("Focus", "Ford", 2016, 9, 5);
        Truck truck = new Truck("Volvo", "VX120", 2015, 3, 25);
        Motorcycle motorcycle = new Motorcycle("BMW", "GS1200", 2023, 24, 1200);

        car.printDetails();
        truck.printDetails();
        motorcycle.printDetails();
    }
}
