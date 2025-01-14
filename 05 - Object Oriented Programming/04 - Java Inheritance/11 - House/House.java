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

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double calculatePrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}
