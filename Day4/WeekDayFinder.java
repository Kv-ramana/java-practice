/*
: Day of Week
You are creating a program to input a week number and print the corresponding day of the week. Your program should prompt the user to enter a week number (1 to 7), and then it should use a switch case to determine and display the respective day of the week.
*/
import java.util.Scanner;
public class WeekDayFinder {
  public static void main(String args[]) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter the week number");
    int number = scanner.nextInt();
    switch(number) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("wensday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("sunday");
        break;
        
    }
    
  }
}