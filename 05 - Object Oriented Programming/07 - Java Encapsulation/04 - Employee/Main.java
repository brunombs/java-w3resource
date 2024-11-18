// Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", 500.995);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee formatted salary: " + employee.getFormattedSalary());
    }
}
