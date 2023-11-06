import java.util.Scanner;
public class MaximumAndMinimumValue {
    public static void printMaximumAndMinimum(int arr[]) {
       int max = arr[0];
       int min = arr[0];
       for(int i = 0; i < arr.length; i++) {
           if(arr[i] > max) {
               max = arr[i];
           }
           if(arr[i] < min) {
               min = arr[i];
           }
       }
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
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
        printMaximumAndMinimum(arr);
    }
}
