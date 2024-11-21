public class Employee {
    final private String name;
    final private String role;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    double calculateSalary(){
        return 0;
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
