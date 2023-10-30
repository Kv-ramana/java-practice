/*
 Leap Year Check
You are tasked with creating a program to check whether a year is a leap year or not. Your program should prompt the user to enter a year, and then it should use conditional statements to check and display whether the year is a leap year or not.
*/

import java.util.Scanner;
public class LeapYear {
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the year");
    int year = scanner.nextInt();
    if(year%4==0) {
      System.out.println(year+"it is a leap year");
    }
    else {
      System.out.println(year+"it is not a leap year");
    }
    
  }
}