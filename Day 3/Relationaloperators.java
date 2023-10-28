/*
 Relational Operators
Write a program to compare two numbers using relational operators. Prompt the user to enter two numbers as inputs. Implement checks for equality, greater than, less than, greater than or equal to, and less than or equal to using relational operators and display the results as boolean values.
  */

import java.util.Scanner;
public class Relationaloperators {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the first number:");
    int num1 = scanner.nextInt();
    System.out.println("enter the second number:");
    int num2 =scanner.nextInt();
    System.out.println("num1==num2:"+(num1==num2));
    System.out.println("num1>num2:"+(num1>num2));
    System.out.println("num1<num2:"+(num1<num2));
    System.out.println("num1>=num2:"+(num1>=num2));
    System.out.println("num1<=num2:"+(num1<=num2));
  }
}