/* Sum of Prime Numbers
You are tasked with creating a program to find the sum of all prime numbers between 1 and a given positive integer 'n'. The program should prompt the user to enter 'n' and then use a while loop to find the sum of all prime numbers from 1 to 'n'.*/

import java.util.Scanner;

public class SumOfPrimeNumbers 
{
  public int prime(int n)
  {
    int i=1,j,count,sum=0;
    while(i<=n)
    {
      j=1;
      count=0;
        while(j<=i)
        {
          if(i%j==0)
          {
            count++;
          }
          j++;
        }
        if(count==2)
        {
          sum=sum+i;
        }
        i++;
    }

    return sum;
  }
  public static void main(String args[])
  {
    
    System.out.println("Enter the value of n:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    SumOfPrimeNumbers obj=new SumOfPrimeNumbers();
    int num=obj.prime(n);
    System.out.println("The sum of Prime Numbers are "+num);
  }
}
