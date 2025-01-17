// Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                System.out.println(i);}
            }
        }
    }
