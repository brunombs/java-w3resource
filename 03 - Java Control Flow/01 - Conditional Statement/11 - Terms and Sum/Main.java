// Write a Java program to display n terms of natural numbers and their sum.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(i);
        }

        System.out.println("The sum is: " + sum);
    }
}
