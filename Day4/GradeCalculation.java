/*Percentage and Grade Calculation
  You are designing a program to input marks of five subjects: Physics, Chemistry, Biology, Mathematics, and Computer. Your program should calculate the percentage and grade according to the given criteria and display the result.*/


import java.util.Scanner;
public class GradeCalculation {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the marks");
    int percentage =scanner.nextInt();
    if(percentage>=90) {
      System.out.println("Grade A");
    }
    else if(percentage>=80) {
      System.out.println("Grade B");
    }
    else if(percentage>=70) {
      System.out.println("Grade C");
    }
    else if(percentage>=60) {
      System.out.println("Grade D");
      
    }
    else if(percentage>=50) {
      System.out.println("Grade E");
  }
    else {
      System.out.println("Grade F");
    }
}
}
