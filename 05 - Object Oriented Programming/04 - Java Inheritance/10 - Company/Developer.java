public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int salary, String jobTitle, String programmingLanguage) {
        super(name, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double CalculateBonus() {
        return getSalary() * 0.15;
    }

    public void writeCode(){
        System.out.println("The developer " + getName() + " is writing code in " + programmingLanguage);
    }
}
