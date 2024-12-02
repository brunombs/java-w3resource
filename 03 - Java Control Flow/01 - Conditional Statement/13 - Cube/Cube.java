import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int cube = number * number * number;

        System.out.println("The number is: " + number);
        System.out.println("The cube is " + cube);
    }
}
