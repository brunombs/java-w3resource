public class HRManager extends Employee {
    public HRManager(int salary){
        super(salary);
    }

    void work(){
        System.out.println("Manager works");
    }

    void addEmployee(){
        System.out.println("Manager add employee");
    }
}
