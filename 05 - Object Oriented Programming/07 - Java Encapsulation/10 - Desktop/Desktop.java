public class Desktop {
    private String brand;
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

    public void displayInfo(){
        System.out.println("-----COMPUTER INFO-----");
        System.out.println("Brand: " + brand);
        System.out.println("Ram Size: " + ramSize);
    }
}
