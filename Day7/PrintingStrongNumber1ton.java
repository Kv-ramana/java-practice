import java.util.Scanner;
public class PrintingStrongNumber1ton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Strong numbers between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }
}
