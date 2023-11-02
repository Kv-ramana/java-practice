/*: Prime Number Checker
You are designing a program to check whether a number is a prime number or not. The program should prompt the user to enter a positive integer and then use a while loop to check whether the number is prime or not.*/
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void checker(int n) {
        int count = 0;
        int i=1;
      while(i<=n) {
        if(n%i==0) {
          count++;
        }
        i++;
        
            }
        
        if(count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        checker(n);
    }
}
