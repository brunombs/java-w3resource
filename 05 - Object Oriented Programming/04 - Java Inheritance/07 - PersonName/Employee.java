public class Employee extends Person {
    private int employeeID;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeID, String jobTitle) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}
