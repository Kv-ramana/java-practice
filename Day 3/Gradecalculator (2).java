/*
Grade Calculator: Create an application that takes a student's test scores and calculates their final grade. Use conditional statements to determine the letter grade (e.g. A, B, C, etc.) based on their scores.
*/
import java.util.Scanner;
public class Gradecalculator {
public static void main(String args[]) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the marks");
    int percentage = scanner.nextInt();
    if(percentage>=90) {
        System.out.println("Grade A");
    }
    else if(percentage>=80) {
        System.out.println("Grade B");
    }
    else if(percentage>=70) {
        System.out.println("Grade C");
    } else if(percentage>=60) {
        System.out.println("Grade D");
    } else if(percentage>=50) {
        System.out.println("Grade E");
    } else if(percentage<=40) {
        System.out.println("Grade F");
    } 
}
}