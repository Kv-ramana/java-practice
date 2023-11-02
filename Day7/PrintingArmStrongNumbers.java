
import java.util.Scanner;
public class PrintingArmtrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        return result == num;
    }
}