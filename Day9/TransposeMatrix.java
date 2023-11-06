import java.util.Scanner;
public class TransposeMatrix {
    public static void Transpose(int arr1[][], int row, int col) {
        int arr2[][] = new int[col][row];
        System.out.println("The transpose matrix is: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " "); 
            }
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = scanner.nextInt();
        int arr1[][] = new int[row][col];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The original matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        Transpose(arr1, row, col);
    }
}
