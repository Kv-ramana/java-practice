/*Sum of Odd Numbers
You are tasked with creating a program to find the sum of all odd numbers between 1 and a given positive integer 'n'. The program should prompt the user to enter 'n' and then use a while loop to calculate the sum of all odd numbers from 1 to 'n'.*/

import java.util.Scanner;
public class SumOfOdd {
  public static void Sum(int n) {
    int i=1;
    int sum=0;
    while(i<=n) {
      if(i%2!=0) {
        sum=sum+i;
      }
      i++;
    }
    System.out.println(sum);
  }

public static void main(String args[]) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter the number ");
  int n= scanner.nextInt();
  Sum(n);
  
}
}