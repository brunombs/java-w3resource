// Write a Java program to display the multiplication table of a given integer.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}