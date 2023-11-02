import java.util.Scanner;
public class FindingFactors {
    public static void factors(int n) {
       int divisor=1;
      while(divisor<=n) {
        if(n%divisor==0) {
          System.out.println(divisor);
        }
        divisor++;
      }
    }
      
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        factors(n);
    }
}
