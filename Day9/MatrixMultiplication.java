import java.util.Scanner;
public class  MatrixMultiplication {
  public static void Multiplication(int arr1[][],int arr2[][],int row,int col) {
    int arr3[][] = new int[row][col];
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        arr3[i][j] = 0;
        for(int k = 0; k < row; k++) {
          arr3[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
    for(int i = 0; i < row; i++) {
      System.out.println();
      for(int j = 0; j < col; j++) {
        System.out.print(arr3[i][j] + " ");
      }
    }
  }
public static void main(String args[]) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter the number of rows");
  int row = scanner.nextInt();
  System.out.println("enter the number of cols");
  int col = scanner.nextInt();
  int arr1[][]=new int[row][col];
  int arr2[][]=new int[row][col];
  System.out.println("enter the elements of the first matrix");
  for(int i=0;i<row;i++) {
    for(int j=0;j<col;j++) {
      arr1[i][j]=scanner.nextInt();
    }
  }
  System.out.println("enter the elements of the second matrix");
  for(int i=0;i<row;i++) {
    for(int j=0;j<col;j++) {
      arr2[i][j]=scanner.nextInt();
    }
  }
  System.out.println("the resulting matrix after multiplication is:");
  Multiplication(arr1,arr2,row,col);
}
}