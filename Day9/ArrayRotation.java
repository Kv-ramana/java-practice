import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate the array to the left: ");
        int positionsToRotate = scanner.nextInt();
        int[] rotatedArray = leftRotate(originalArray, positionsToRotate);
        System.out.print("Updated Array (after " + positionsToRotate + " positions left rotation): ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
    public static int[] leftRotate(int[] array, int positions) {
        int n = array.length;
        int[] rotatedArray = new int[n];
      
        for (int i = 0; i < n; i++) {
        
            int newPosition = (i + positions) % n;
            rotatedArray[i] = array[newPosition];
        }
        return rotatedArray;
    }
}
