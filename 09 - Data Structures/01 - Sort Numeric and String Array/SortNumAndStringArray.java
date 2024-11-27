// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class SortNumAndStringArray {
    public static void main(String[] args) {
        int[] num_array = {6, 5, 4, 7, 9, 3, 0};
        System.out.println("Number array: " + Arrays.toString(num_array));
        Arrays.sort(num_array);
        System.out.println("Sorted array: " + Arrays.toString(num_array));

        String[] str_array = {"Java", "Python", "C++"};
        System.out.println("String array: " + Arrays.toString(str_array));
        Arrays.sort(str_array);
        System.out.println("Sorted array: " + Arrays.toString(str_array));


    }
}
