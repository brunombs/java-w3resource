// Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 5, 4, 9, 3, 7, 2, 1};
        Sortable bubble = new BubbleSort();
        bubble.sort(array);
        System.out.println("Bubble sort:");
        printArray(array);

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(array);
        System.out.print("Selection sort: ");
        printArray(array);
    }


    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
