import java.util.Scanner;
public class SaddlePointElement {
    public static void findSaddlePoint(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                boolean isSaddlePoint = true;
                for (int k = 0; k < col; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        isSaddlePoint = false;
                        break;
                    }
                }
                for (int k = 0; k < row; k++) {
                    if (arr[i][j] < arr[k][j]) {
                        isSaddlePoint = false;
                        break;
                    }
                }
                if (isSaddlePoint) {
                    System.out.println("Saddle Point: " + arr[i][j] + " at (" + i + ", " + j + ")");
                }
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
        findSaddlePoint(arr, row, col);
    }
}
