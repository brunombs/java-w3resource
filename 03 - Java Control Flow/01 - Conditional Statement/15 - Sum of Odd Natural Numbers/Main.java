// Write a Java program that displays the sum of n odd natural numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalOfNumbers = 0;
        System.out.println("Input number of terms: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                sum += i;
                totalOfNumbers++;
                System.out.println(i);
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Total of numbers: " + totalOfNumbers);
    }
}
