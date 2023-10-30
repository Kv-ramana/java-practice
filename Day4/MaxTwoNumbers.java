/*
1: Maximum Between Two Numbers
You are designing a program to find the maximum between two numbers. Your program should prompt the user to enter two numbers, and then it should use conditional statements to determine and display the maximum of the two numbers.
*/
import java.util.Scanner;
public class MaxTwoNumbers {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num1 value :");
    int num1 = sc.nextInt();
    System.out.println("enter the num2 value :");
    int num2 = sc.nextInt();

    if(num1 > num2) {
      System.out.println(num1 + "it is a maximum number");
      
    }
    else {
      System.out.println(num2 + "it is a maximum number");
    }
  }
}