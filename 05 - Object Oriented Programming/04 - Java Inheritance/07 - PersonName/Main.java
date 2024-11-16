// Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Salt", 245, "CEO");
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " (" + employee.getEmployeeID() + ")");
    }
}
