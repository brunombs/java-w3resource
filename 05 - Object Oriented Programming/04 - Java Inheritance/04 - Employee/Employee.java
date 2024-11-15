// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    void work(){
        System.out.println("Employee works");
    }

    int getSalary(){
        return salary;
    }
}
