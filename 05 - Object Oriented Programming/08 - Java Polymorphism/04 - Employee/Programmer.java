public class Programmer extends Employee {
    final private double salary;
    final private double bonus;

    public Programmer(String name, String role, double salary, double bonus) {
        super(name, role);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}
