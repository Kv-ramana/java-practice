import java.util.Scanner;
public class MaxThreeNumbers {
  public static void findMax(int num1, int num2, int num3) {
    if(num1>num2 && num1>num3) {
      System.out.println(num1+"it is a maximum number ");
    }
    else if(num2>num1 && num2>num3) {
      System.out.println(num2+"it is a maximum number ");
      
    }
    else {
      System.out.println(num3+"it is a maximum number");
      }
  }
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the num1 value");
  int num1=sc.nextInt();
  System.out.println("enter the num2 value");
  int num2=sc.nextInt();
  System.out.println("enter the num3 value");
  int num3 =sc.nextInt();

  findMax(num1,num2,num3);
}
}