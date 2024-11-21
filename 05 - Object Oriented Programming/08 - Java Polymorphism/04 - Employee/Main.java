// Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(6320.39);
        System.out.println("Manager salary: " + manager.calculateSalary());
        Programmer programmer = new Programmer(3999.95);
        System.out.println("Programmer salary: " + programmer.calculateSalary());
    }
}
