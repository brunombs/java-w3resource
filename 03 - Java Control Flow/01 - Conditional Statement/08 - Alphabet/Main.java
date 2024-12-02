// Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        System.out.println("Write a character from the alphabet: ");
        char alphabet = scanner.next().charAt(0);
        boolean isVowel = false;
        for (char vowel : vowels) {
            if (vowel == alphabet) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println(alphabet + " is a vowel");
        } else {
            System.out.println(alphabet + " is a consonant");
        }
    }
}
