import java.util.Scanner;
public class CountNegativeElements {
    public static void NegativeElements(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Count of negative elements: " + count);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        NegativeElements(arr);
    }
}
