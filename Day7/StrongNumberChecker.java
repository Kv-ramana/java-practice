import java.util.Scanner;
public class StrongNumberChecker {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void isStrong(int n) {
        int originalNumber = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("The number is a Strong number");
        } else {
            System.out.println("The number is not a Strong number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        isStrong(n);
    }
}
