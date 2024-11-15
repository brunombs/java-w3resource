// Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue' from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.

public class Configuration {
    public static String configValue;

    static{
        configValue = "Default config value!";
        System.out.println(configValue);
    }

    public static void main(String[] args) {
        System.out.println("Config value: " + configValue);
    }
}