/*Printing Prime Numbers
You are creating a program to print all prime numbers between 1 and a given positive integer 'n'. The program should prompt the user to enter 'n' and then use a while loop to find and print all prime numbers from 1 to 'n'.*/

import java.util.Scanner;
public class PrimeNumber1ton {
  public static void Prime(int n) {
    int i=2;
    while(i<=n) {
      int count=0;
      for(int k=1;k<=i;k++) {
        if(i%k==0) {
          count++;
        }
      }
      if(count==2) {
        System.out.println(i);
      }
      i++;
    }
    
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    Prime(n);
}
}