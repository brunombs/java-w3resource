public class Manager extends Employee {
    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager name: " + name);
        System.out.println("Manager salary: " + baseSalary);
        System.out.println("Manager bonus: " + bonus);
        System.out.println("Manager total salary: " + calculateSalary());
    }
}
