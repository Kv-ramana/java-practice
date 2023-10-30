/*
 Even or Odd Check
You are creating a program to check whether a number is even or odd. Your program should prompt the user to enter a number, and then it should use conditional statements to check and display whether the number is even or odd.
  */

import java.util.Scanner;
public class EvenOrOddCheck {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = scanner.nextInt();
    if(num%2==0) {
      System.out.println(num+"the number is even");
    }
    else {
      System.out.println(num+"the number is odd");
    }
  }
}