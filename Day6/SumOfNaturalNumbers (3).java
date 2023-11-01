/*Sum of Natural Numbers
You are creating a program to calculate the sum of all natural numbers up to a given positive integer 'n'. The program should prompt the user to enter 'n' and then use a while loop to calculate the sum of all numbers from 1 to 'n'.*/

import java.util.Scanner;
public class SumOfNaturalNumbers {
  public static void Sum(int n) {
    int i=0;
    int sum=0;
    
    while(i<=n) {
    
      sum=sum+i;
      i++;
    }
    System.out.println(sum);
  }

public static void main(String args[]) {
  Scanner scanner=new Scanner(System.in);
  System.out.println("enter the number");
  int n= scanner.nextInt();
  Sum(n);
}
}