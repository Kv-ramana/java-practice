/*First and Last Digit
You are designing a program to find the first and last digit of a given number. The program should prompt the user to enter a positive integer and then use a while loop to extract and display the first and last digits of the input number.*/

import java.util.Scanner;
public class FirstAndLastDigit {
  public static void Find(int n) {
    int first = 0;
    
    int last = n % 10;
    while(n != 0) {
      first = n % 10;
      n = n / 10;
    }
    System.out.println("First digit: " + first);
    System.out.println("Last digit: " + last);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = scanner.nextInt();
    Find(n);
  }
}
