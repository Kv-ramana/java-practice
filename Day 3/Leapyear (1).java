/*
 Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.
*/

import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leap Year Checker");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
