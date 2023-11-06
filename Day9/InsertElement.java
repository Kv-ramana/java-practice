import java.util.Scanner;
public class InsertElement {
  public static void Insert(int[] arr, int n, int x, int pos) {
    int[] newArr = new int[n + 1];
    for (int i = 0; i < pos - 1; i++) {
      newArr[i] = arr[i];
    }
    newArr[pos - 1] = x;
    for (int i = pos; i <= n; i++) {
      newArr[i] = arr[i - 1];
    }
    System.out.println("Array after insertion:");
    System.out.println(Arrays.toString(newArr)); 
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n = scanner.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println("Enter the element to be inserted: ");
    int x = scanner.nextInt();
    System.out.println("Enter the position to be inserted: ");
    int pos = scanner.nextInt();
    Insert(arr, n, x, pos);
  }
}
