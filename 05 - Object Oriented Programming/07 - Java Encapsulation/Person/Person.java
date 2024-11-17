package Person;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void printDetails() {
        System.out.println("----------PERSON INFO----------");
        System.out.println("Person Name: " + this.getName());
        System.out.println("Person Age: " + this.getAge());
        System.out.println("Person Country: " + this.getCountry());
    }
}
