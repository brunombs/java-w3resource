public class Manager extends Employee {
    final private double salary;

    public Manager(double salary) {
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}
