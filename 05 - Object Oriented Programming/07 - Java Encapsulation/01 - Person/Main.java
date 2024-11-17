// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        person.setName("John Doe");
        person.setAge(23);
        person.setCountry("Ireland");
        person2.setName("Jane Doe");
        person2.setAge(22);
        person2.setCountry("United Kingdom");
        person.printDetails();
        person2.printDetails();
    }
}
