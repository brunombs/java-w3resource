// Write a Java program to test if an array contains a specific value.

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        ArrayList<String> carBrand = new ArrayList<>();
        carBrand.add("Audi");
        carBrand.add("BMW");
        carBrand.add("Volvo");

        System.out.println("There is 'Volvo' in the list? " + carBrand.contains("Volvo"));
        System.out.println("There is 'Ford' in the list? " + carBrand.contains("Ford"));

        System.out.println("Full list: " + carBrand);
    }
}
