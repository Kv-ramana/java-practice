import java.util.Scanner;
public class MatrixAddition {
  public static void Addition(int arr1[][], int arr2[][], int row, int col) {
    
    int arr3[][] = new int[row][col];
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
                     
        arr3[i][j] = arr1[i][j] + arr2[i][j];
        System.out.print(arr3[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int row = scanner.nextInt();
    System.out.println("Enter the number of columns:");
    int col = scanner.nextInt();
    int arr1[][] = new int[row][col];
    int arr2[][] = new int[row][col];
    System.out.println("Enter the elements of the first matrix:");
            
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        arr1[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Enter the elements of the second matrix:");
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        arr2[i][j] = scanner.nextInt();
      }
    }
    System.out.println("The resulting matrix after addition is:");
    Addition(arr1, arr2, row, col);
  }
}
