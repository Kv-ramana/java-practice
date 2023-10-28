/*
Arithmetic Operators
Write a program to perform arithmetic operations on two numbers. Prompt the user to enter two numbers as inputs. Implement addition, subtraction, multiplication, and division operations using appropriate arithmetic operators and display the results.
*/
import java.util.Scanner;
public class Arithamatic {
  public static void main(String arr[]) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter the first number :");
    int num1= scanner.nextInt();
    System.out.println("enter the second number :");
    int num2=scanner.nextInt();
    System.out.println("the add of two numbers is:"+(num1+num2));
    System.out.println("the sub of two numbers is:"+(num1-num2));
    System.out.println("the mul of two numbers is:"+(num1*num2));
    System.out.println("the div of two numbers is:"+(num1/num2));
    
  }
}