// Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize. Provide public getter and setter methods to access and modify these variables. Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("Apple", 8);
        desktop.displayInfo();
        desktop.upgradeRam(8);
        System.out.println("Computer after RAM upgrade: ");
        desktop.displayInfo();
    }
}
