// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.

package Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(23);
        person.setCountry("Ireland");

        System.out.println("----------PERSON INFO----------");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
        System.out.println("Person Country: " + person.getCountry());
    }
}
