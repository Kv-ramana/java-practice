import java.util.Scanner;
public class PrintingReverse {
  public static void Reverse(int n) {
    
    int reverse = 0;
    //    123
    while(n != 0) {
    
      int digit = n % 10;//12
      reverse = reverse * 10 + digit;
      n = n / 10;
    }

    
    System.out.println("Reverse of the number is: " + reverse);
  }
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the number");
    int n=scanner.nextInt();
    Reverse(n);
  }
}