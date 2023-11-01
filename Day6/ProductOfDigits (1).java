import java.util.Scanner;
public class ProductOfDigits {
  public static void Product(int number) {
    int product = 1;
    while(number != 0) {
      int remainder = number % 10;
      product = product * remainder;
      number = number / 10;
    }
    System.out.println("The product of digits is: " + product);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number ");
    int number=scanner.nextInt();
    Product(number);
  }
}