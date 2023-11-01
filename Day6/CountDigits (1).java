/* Counting Digits
You are creating a program to count the number of digits in a given number. The program should prompt the user to enter a positive integer and then use a while loop to count the number of digits in the input number.
*/

import java.util.Scanner;
public class CountDigits {
  public static void Count(int n) {
    int count=0;

    while(n!=0) {

      n=n/10;
      count++;
      
    }
    System.out.println(count);
  
  }
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    Count(n);
  }
}