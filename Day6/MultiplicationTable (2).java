/* Multiplication Table
You are designing a program to print the multiplication table of a given number. The program should prompt the user to enter a positive integer 'n' and then use a while loop to print the multiplication table of 'n' up to 10.*/

import java.util.Scanner;
public class MultiplicationTable {
  public static void Table(int n) {
    int i=1;
    while(i<=10) {
      System.out.println(n*i);
      i++;
    }
  }
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the number ");
    int n=scanner.nextInt();
    Table(n);
  }
}