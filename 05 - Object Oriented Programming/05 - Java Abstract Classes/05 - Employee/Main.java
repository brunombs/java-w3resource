// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 2000, 300);
        manager.displayInfo();
        Programmer programmer = new Programmer("Bruno", 1500.25, "Java", 10);
        programmer.displayInfo();
    }
}
