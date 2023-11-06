import java.util.Scanner;

public class ArrayCopy {
    public static void Copy(int arr1[], int arr2[]) {
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("The copied array is:");
        printArray(arr2);
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        Copy(arr1, arr2);
    }
}
