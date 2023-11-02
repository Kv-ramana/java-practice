import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n) for the Fibonacci series: ");
        int n = scanner.nextInt();
        if (n >= 1) {
            System.out.println("Fibonacci series up to " + n + " terms:");
            printFibonacciSeries(n);
        } else {
            System.out.println("Invalid input. Please enter a positive number of terms (n).");
        }
    }
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 2; 
        System.out.print(firstTerm + " " + secondTerm + " ");
        while (count < n) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            count++;
        }
    }
}
