// Write a Java program to create a class called Smartphone with private instance variables brand, model, and storageCapacity. Provide public getter and setter methods to access and modify these variables. Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setStorageCapacity(128);
        System.out.println("The " + smartphone.getBrand() + " phone has a storage capacity of " + smartphone.getStorageCapacity() + "GB");
        smartphone.increaseStorageCapacity(128);
        System.out.println("The " + smartphone.getBrand() + " phone has a new storage capacity of " + smartphone.getStorageCapacity() + "GB");
        Smartphone smartphone2 = new Smartphone();
        smartphone2.setBrand("Apple");
        smartphone2.setStorageCapacity(256);
        System.out.println("The " + smartphone2.getBrand() + " phone has a storage capacity of " + smartphone2.getStorageCapacity() + "GB");
        smartphone2.increaseStorageCapacity(256);
        System.out.println("The " + smartphone2.getBrand() + " phone has a new storage capacity of " + smartphone2.getStorageCapacity() + "GB");


    }
}
