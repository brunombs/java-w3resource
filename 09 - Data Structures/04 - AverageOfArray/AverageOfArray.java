// Write a Java program to calculate the average value of array elements.

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int average = 0;

        for (int number : numbers) {
            average += number;
        }

        System.out.println(average/numbers.length);
    }
}
