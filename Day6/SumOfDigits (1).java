import java.util.Scanner;
public class SumOfDigits {
  public static void Main(int n) {
    int sum=0;
    while(n!=0) {
      int digit=n%10;
      sum=sum+digit;
      n=n/10;
      
    }
    System.out.println("Sum of digits is: "+sum);
  }
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the number");
    int n=scanner.nextInt();
    Main(n);
  }
  
  } 