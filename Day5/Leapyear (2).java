import java.util.Scanner;
public class Leapyear {
  public void Year(int year) {
    if(year%4==0) {
      System.out.println(year+"it is a leap year");
    }
    else {
      System.out.println(year+"it not a leap year");
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the year");
  int year = scanner.nextInt();
    Leapyear obj = new Leapyear();
    obj.Year(year);
  }
  
}