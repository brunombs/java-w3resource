public class Manager extends Employee {
    final private double salary;

    public Manager(String name, String role, double salary) {
        super(name, role);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}
