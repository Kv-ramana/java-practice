import java.util.Scanner;

public class ArraySorting {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n = scanner.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    Sorting(n, arr);

    System.out.println("The array in sorted order:");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void Sorting(int n, int arr[]) {
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
