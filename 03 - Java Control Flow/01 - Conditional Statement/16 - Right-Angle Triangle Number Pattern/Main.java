// Write a Java program to display the pattern like a right angle triangle with a number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.println(i);
        }
    }
}
