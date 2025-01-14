public class House {
    private int numberOfRooms;
    private double area;
    private String address;

    public House(int numberOfRooms, double area, String address) {
        this.numberOfRooms = numberOfRooms;
        this.area = area;
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}
