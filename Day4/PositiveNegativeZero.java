/*
Positive, Negative, or Zero
You are tasked with creating a program to check whether a number is negative, positive, or zero. Your program should prompt the user to enter a number, and then it should use conditional statements to determine and display whether the number is negative, positive, or zero.*/

import java.util.Scanner;
public class PositiveNegativeZero {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int num = scanner.nextInt();
    if(num<0) {
      System.out.println("the number is negative");
    }
    else if(num>0) {
      System.out.println("the number is positive");
    }
    else {
      System.out.println("the number is zero");
    }
  }
}