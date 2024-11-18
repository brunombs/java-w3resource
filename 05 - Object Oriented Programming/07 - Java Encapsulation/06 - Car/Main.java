// Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 2016, 113000);
        int mileage = car.getMileage();
        int year = car.getYear();
        String companyName = car.getCompany_name();
        String modelName = car.getModel_name();

        System.out.println("Company name: " + companyName + ", model name: " + modelName + ", year: " + year + ", mileage: " + mileage);

        car.setCompany_name("Nissan");
        car.setModel_name("Frontier");
        car.setYear(2011);
        System.out.println("Company name: " + car.getCompany_name() + ", model name: " + car.getModel_name() + ", year: " + car.getYear());
    }
}
