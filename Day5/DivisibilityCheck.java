import java.util.Scanner;
public class DivisibilityCheck {
  public void main(int num) {
    if(num%5==0 && num%11==0) {
      System.out.println("the number is divisible by both 5 and 11");
    } else {
      System.out.println("the number is not divisible by noth 5 and 11");
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num value");
    int num = sc.nextInt();
    DivisibilityCheck obj = new DivisibilityCheck();
    obj.main(num);
  }
}