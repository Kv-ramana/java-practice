/*Armstrong Number Checker
You are creating a program to check whether a number is an Armstrong number or not. Armstrong numbers are those whose sum of cubes of individual digits is equal to the number itself. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. The program should prompt the user to enter a number and then use a while loop to check whether the number is an Armstrong number or not.*/

import java.util.Scanner;
public class ArmStrongChecker {
  public static void Number(int n) {
    int rem, sum = 0, temp;
    temp = n;
    while (n > 0) {
      rem = n % 10;
      sum = sum + (rem * rem * rem);
      n = n / 10;
    }
    if (temp == sum) {
      System.out.println("The number is an Armstrong number");
    } else {
      System.out.println("The number is not an Armstrong number");
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the numbner");
    int n= scanner.nextInt();
    Number(n);
  }
}