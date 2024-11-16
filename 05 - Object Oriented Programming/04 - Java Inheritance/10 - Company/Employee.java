public class Employee {
    String name;
    int salary;
    String jobTitle;

    public Employee(String name, int salary, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public double CalculateBonus() {
        return 0;
    }



    public void printDetails() {
        System.out.println("----------");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}
