import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void Sum(int n) {
        int last = n % 10;
        int first = 0;
        int originalN = n;  
        while (n != 0) {
            first = n % 10;
            n = n / 10;
        }

        int sum = first + last;
        System.out.println("The sum of first and last digit of " + originalN + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        Sum(n);
      
    }
}
