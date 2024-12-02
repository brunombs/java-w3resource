// Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        char[] consonants = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Write a character from the alphabet: ");
        char alphabet = scanner.next().charAt(0);
        boolean isVowel = false;
        boolean isConsonant = false;
        for (char vowel : vowels) {
            if (vowel == alphabet) {
                isVowel = true;
                break;
            }
        }

        for (char consonant : consonants) {
            if (consonant == alphabet) {
                isConsonant = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println(alphabet + " is a vowel");
        } else if (isConsonant) {
            System.out.println(alphabet + " is a consonant");
        } else {
            System.out.println("this is not a character");
        }
    }
}
