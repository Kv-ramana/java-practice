import java.util.Scanner;
public class PositiveNegativeZero {
  public void main(int num) {
    if(num>0) {
      System.out.println(num+"it is positive number");
    }
    else if(num<0) {
      System.out.println(num+"it is negative number");
    }
    else {
      System.out.println(num+"it is zero");
    }
  }
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int num = scanner.nextInt();
    PositiveNegativeZero pnz= new PositiveNegativeZero();
    pnz.main(num);
  }
}