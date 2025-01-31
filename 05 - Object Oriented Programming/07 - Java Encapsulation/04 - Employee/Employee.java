public class Employee {
    final private int id;
    final private String name;
    final private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getFormattedSalary(){
        return String.format("$%.2f", salary);
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("*** Employee Details ***");
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee formatted salary: " + getFormattedSalary());
    }
}
