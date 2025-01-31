// Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        student.addGrade(5.4);
        student.addGrade(4.7);
        student.addGrade(3.9);
        System.out.println("Student grade: " + student.getGrades());
        student.setStudentID(2);
        student.setStudentName("Johnny Doe");

    }
}
