import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 5, 7, 9, 15, 32};
        System.out.println("Original array: " + Arrays.toString(array));

        int removeIndex = 2;

        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;

        System.out.println("After removing element: " + Arrays.toString(array));
    }
}
