public class Programmer extends Employee {
    private double salary;

    public Programmer(double salary) {
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}
