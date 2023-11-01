/* Printing Odd Numbers
You are designing a program to print all odd numbers between 1 and 100. To achieve this, your program should use a while loop to iterate through all numbers from 1 to 100. For each number, it should check if it is odd, and if so, print it on the screen.*/
import java.util.Scanner;
public class Odd1to100 {
  public static void Number(int n) {
    int i=1;
    while(i<=n) {
      if(i%2!=0) {
        System.out.println(i);
      }
      i++;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();
    Number(n);
  }
}
