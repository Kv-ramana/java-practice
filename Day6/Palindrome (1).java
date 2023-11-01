import java.util.Scanner;
public class Palindrome {
  public static void Main(int number) {
    int reverse =0;
    int original = number;
    while(number != 0) {
      int remainder = number % 10;
      reverse = reverse * 10 + remainder;
        number = number / 10;
  }
    if(original == reverse) {
      System.out.println("The number is palindrome");
    }
    else {
      System.out.println("The number is not palindrome");
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number ");
    int number=scanner.nextInt();
    Main(number);
  }
}