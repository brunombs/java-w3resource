public class University {
    static class Department{
        String departmentName;
        int facultyMembers;

        void displayInfo(){
            System.out.println("Department Name: " + departmentName);
            System.out.println("Faculty Members: " + facultyMembers);
        }

        public Department(String departmentName, int facultyMembers) {
            this.departmentName = departmentName;
            this.facultyMembers = facultyMembers;
        }
    }
}
