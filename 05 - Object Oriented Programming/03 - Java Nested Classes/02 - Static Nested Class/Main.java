// Write a Java program to create an outer class called University with a static nested class Department. The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. Instantiate the Department class from the main method and call the "displayInfo()" method.

public class Main {
    public static void main(String[] args) {
        University.Department lawDept = new University.Department("Law", 97);
        lawDept.displayInfo();
    }
}
