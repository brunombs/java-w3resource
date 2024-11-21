// Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "Manager", 6320.39);
        System.out.println("Manager salary: " + manager.calculateSalary());
        Programmer programmer = new Programmer("Bruno", "Java programmer", 3999.95, 500);
        System.out.println(programmer.getName() + " is a " + programmer.getRole() + " and his salary is: $" + programmer.calculateSalary());
    }
}
