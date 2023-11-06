import java.util.Scanner;
public class SearchElement {
  public static void Search(int[] arr, int n, int x) {
    int index = -1;
                 
    for (int i = 0; i < n; i++) {
      if (arr[i] == x) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index " + index);
    }
    
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the array size");
    int n= scanner.nextInt();
    int  arr[]= new int[n];
    System.out.println("enter the array elements are : ");
    for(int i=0;i<n;i++) {
      arr[i]=scanner.nextInt();
      
    }
    System.out.println("enter the element to be searched : ");
    int x= scanner.nextInt();
    Search(arr,n,x);
  }
}