/* Printing Even Numbers
You are creating a program to print all even numbers between 1 and 100. To achieve this, your program should use a while loop to iterate through all numbers from 1 to 100. For each number, it should check if it is even, and if so, print it on the screen.*/
import java.util.Scanner;
public class Even1to100 {
  public void Numbers(int n) {
    int i=1;
  
    while(i<=n) {
      if(i%2==0) {
        System.out.println(i); 
      }
      i++;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    Even1to100 obj = new Even1to100();
    obj.Numbers(n);
  }
}