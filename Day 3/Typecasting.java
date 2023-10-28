/*
 Type Casting
Write a program to demonstrate type casting in Java. Declare a variable of type double and assign a value to it. Then, convert the double value to an integer and display both the original double value and the converted integer value
  */

public class Typecasting {
  public static void main(String args[]) {
    double doublevalue = 29.29;
    int intvalue=(int)doublevalue;
    System.out.println("the original double value is "+doublevalue);
    System.out.println("the changed int value is "+intvalue);
  }
}