/*
Divisibility Check
You are designing a program to check whether a number is divisible by 5 and 11 or not. Your program should prompt the user to enter a number, and then it should use conditional statements to check and display whether the number is divisible by both 5 and 11.
  */

import java.util.Scanner;
public class DivisibilityCheck {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int num = scanner.nextInt();
    if(num%5 == 0 && num%11 ==0) {
      System.out.println("the number is divisible by 5 and 11");
    }
    else {
      System.out.println("the number is not divisible by 5 and 11");
    }
  }
}