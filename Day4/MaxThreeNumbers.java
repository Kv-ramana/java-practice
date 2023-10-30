/*
 Maximum Between Three Numbers
You are creating a program to find the maximum between three numbers. Your program should prompt the user to enter three numbers, and then it should use conditional statements to determine and display the maximum of the three numbers.
  */
import java.util.Scanner;
public class MaxThreeNumbers {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the num1 value :");
    int num1=sc.nextInt();
    System.out.println("enter the num2 value :");
    int num2 =sc.nextInt();
    System.out.println("enter the num3 value :");
    int num3=sc.nextInt();
    if(num1>num2 && num1>num3) {
      System.out.println(num1+"it is a maximum number");
    }
    else if(num2>num1 && num2>num3) {
      System.out.println(num2+"it is a maximum number");
    }
    else {
      System.out.println(num3+"it is a maximum numer");
      }
  }
}