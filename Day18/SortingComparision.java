import java.util.*;
public class SortingComparision {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void compareSortingAlgorithms(int[] arr) {
        int[] arrBubbleSort = Arrays.copyOf(arr, arr.length);
        int[] arrInsertionSort = Arrays.copyOf(arr, arr.length);

        long startTime, endTime, elapsedTime;

        startTime = System.nanoTime();
        bubbleSort(arrBubbleSort);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Bubble Sort Time: " + elapsedTime + " nanoseconds");

        startTime = System.nanoTime();
        insertionSort(arrInsertionSort);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Insertion Sort Time: " + elapsedTime + " nanoseconds");
    }

    public static void main(String[] args) {
        int[] arr = {16,11,18,3,7};

        System.out.println("Original Array: " + Arrays.toString(arr));
        compareSortingAlgorithms(arr);
    }
}