import java.util.Scanner;
public class SecondLargestElement {
    public static void printSecondLargestElement(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printSecondLargestElement(arr);
    }
}
