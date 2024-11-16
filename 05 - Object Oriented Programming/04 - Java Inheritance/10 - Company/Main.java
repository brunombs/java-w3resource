// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Bruno", 10, "Intern Dev", "Java");
        Manager manager = new Manager("John", 3500, "Manager Sr", 10);
        Programmer programmer = new Programmer("Salt", 2500, "Programmer Sr","Python");
        developer.writeCode();
        developer.printDetails();
        System.out.println("Developer's bonus: $" + developer.CalculateBonus());
        manager.printDetails();
        System.out.println("Manager's bonus: $" + manager.CalculateBonus());
        programmer.printDetails();
        System.out.println("Programmer's bonus: $" + programmer.CalculateBonus());
    }
}
