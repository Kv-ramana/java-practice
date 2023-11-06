import java.util.Scanner;
public class EvenAndOddElements {
    public static void EvenAndOdd(int arr[]) {
        int counteven = 0;
        int countodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counteven++;
            } else {
                countodd++;
            }
        }
        System.out.println("Count of even elements: " + counteven);
        System.out.println("Count of odd elements: " + countodd);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        EvenAndOdd(arr);
    }
}
