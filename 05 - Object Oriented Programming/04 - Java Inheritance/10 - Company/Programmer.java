public class Programmer extends Developer {
    public Programmer(String name, int salary, String jobTitle, String programmingLanguage) {
        super(name, salary, jobTitle, programmingLanguage);
    }

    @Override
    public double CalculateBonus() {
        return getSalary() * 0.18;
    }
}
