// Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            int cube = i * i * i;
            System.out.println("The number is: " + i + " and the cube is: " + cube);
        }
    }
}
