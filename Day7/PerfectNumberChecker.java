import java.util.Scanner;
public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1; 
        int divisor = 2;
        while (divisor <= number / 2) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        return sum == number;
    }
}
