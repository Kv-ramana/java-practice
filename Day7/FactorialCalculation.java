import java.util.Scanner;
public class FactorialCalculation {
  public static void Factorial(int n) {
    int result = 1;
    int i=1;
    
    
    while(i<=n) {

      
      result = result * i;
      
      i++;
      
    }
    System.out.println("Factorial of "+n+" is "+result);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int n=scanner.nextInt();
    Factorial(n);
  }
}