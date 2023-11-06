import java.util.Scanner;
public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.print("Enter the position to delete (0-based index): ");
        int positionToDelete = scanner.nextInt();
        if (positionToDelete < 0 || positionToDelete >= n) {
            System.out.println("Invalid position. Element cannot be deleted.");
        } else {
            int[] updatedArray = deleteElement(originalArray, positionToDelete);
            System.out.println("Original Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(originalArray[i] + " ");
            }
            System.out.println("Updated Array: ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(updatedArray[i] + " ");
            }
        }
    }
    public static int[] deleteElement(int[] array, int position) {
        int n = array.length;
        int[] updatedArray = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i != position) {
                updatedArray[j] = array[i];
                j++;
            }
        }
        return updatedArray;
    }
}
