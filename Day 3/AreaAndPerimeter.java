/*
Area and Perimeter
Write a program to calculate the area and perimeter of a rectangle. Prompt the user to enter the length and width of the rectangle as inputs. Use appropriate data types for variables and display the calculated area and perimeter.
  */

import java.util.Scanner;
public class AreaAndPerimeter {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    int length = scanner.nextInt();
    System.out.println("enter the breadth of the recatagle");
    int bredth = scanner.nextInt();
    int area =length*bredth;
    int perimeter = 2*(length+bredth);
    System.out.println("The area of rectagle is : "+ area);
    System.out.println("The perimeter of rectagle is :"+perimeter);
  }
}