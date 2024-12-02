// Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 5) {
            count++;
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;
        }
        int average = sum / count;
        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is " + average);
    }
}
