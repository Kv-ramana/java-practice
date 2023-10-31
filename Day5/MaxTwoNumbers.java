import java.util.Scanner;
public class MaxTwoNumbers {
  public int findMax(int num1, int num2) {
    if(num1>num2) {
      return num1;
    } else {
      return num2;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = sc.nextInt();
    MaxTwoNumbers obj = new MaxTwoNumbers();
    System.out.println("The maximum of the two numbers is: " + obj.findMax(num1, num2));
    
  }
}