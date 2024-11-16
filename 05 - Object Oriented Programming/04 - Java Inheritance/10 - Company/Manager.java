public class Manager extends Employee {
    private final int numberOfSubordinates;

    public Manager(String name, int salary, String jobTitle, int numberOfSubordinates) {
        super(name, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double CalculateBonus() {
        return getSalary() * 0.25;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Subordinates: " + numberOfSubordinates);
    }
}
