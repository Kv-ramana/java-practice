import java.util.Scanner;
public class PrimeFactor {
  public static void Factor(int n) {
    int i=2;
    while(i<=n) {
      if(n%i==0) {
        System.out.println(i);
        n=n/i;
      }
      else {
        i++;
      }
    }
    
    
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int n = scanner.nextInt();
    Factor(n);
  }
}