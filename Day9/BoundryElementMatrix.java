import java.util.Scanner;

public class BoundryElementMatrix {
    public static void Boundry(int arr[][], int row, int col) {
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) { 
                arr[i][j] = sc.nextInt();
            }
          
        }
        Boundry(arr, row, col);
    }
}
