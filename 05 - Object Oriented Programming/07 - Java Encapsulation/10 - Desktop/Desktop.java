public class Desktop {
    final private String brand;
    private int ramSize;

    public Desktop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void upgradeRam(int amount){
        this.ramSize += amount;
    }
}
