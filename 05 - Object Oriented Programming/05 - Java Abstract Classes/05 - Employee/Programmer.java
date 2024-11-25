public class Programmer extends Employee {
    private final String programmingLanguage;
    double overtimeHours;

    public Programmer(String name, double baseSalary, String programmingLanguage, double overtimeHours) {
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * 15);
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer name: " + name);
        System.out.println("Programmer salary: " + baseSalary);
        System.out.println("Programming language: " + programmingLanguage);
        System.out.println("Programmer total salary: " + calculateSalary());
    }
}
