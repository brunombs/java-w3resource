public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1000);
        HRManager manager = new HRManager(3000);

        employee.work();
        manager.work();

        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Manager salary: " + manager.getSalary());

        manager.addEmployee();
    }
}
