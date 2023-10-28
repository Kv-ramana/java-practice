/*
Distance Calculator
Write a program to calculate the distance between two points (x1, y1) and (x2, y2) in a 2D plane. Prompt the user to enter the coordinates of both points as inputs. Use appropriate data types for variables and display the calculated distance.
*/

import java.util.Scanner;
public class Distancecalculator {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the first x position");
    double x1 = scanner.nextInt();
    System.out.println("enter the first y position");
    double y1=scanner.nextInt();
    System.out.println("enter the second x position");
    double x2=scanner.nextInt();
    System.out.println("enter the second y position");
    double y2=scanner.nextInt();
    double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.println("The distance between the two points is :"+distance);
    
    
  }
}