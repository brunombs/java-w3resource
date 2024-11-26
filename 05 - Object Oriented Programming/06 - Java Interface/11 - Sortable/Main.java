// Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order. Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 5, 2, 8, 0, 3, 1, 6, 4};

        Sortable quickSort = new QuickSort();
        quickSort.sort(array);

        System.out.println("Quick sort (descending order): ");
        printArray(array);



        int[] array2 = {9, 5, 2, 8, 0, 3, 1, 6, 4, 7};

        Sortable mergeSort = new MergeSort();
        mergeSort.sort(array2);

        System.out.print("Merge sort (descending order): ");
        printArray(array2);
    }

    private static void printArray(int[] arr) {
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
