import java.util.Scanner;
public class WeekdayFinder {
  public static void Finder(int day) {
    if(day==1) {
      System.out.println(day+"it is monday");
    }
    else if(day==2) {
      System.out.println(day+"it is tuesday");
    }
    else if(day==3) {
      System.out.println(day+"it is wednesday");
    }
    else if(day==4) {
      System.out.println(day+"it is thursday");
  }
    else if(day==5) {
      System.out.println(day+"it is friday");
}
    else if(day==6) {
      System.out.println(day+"it is saturday");
    }
    else if(day==7) {
      System.out.println(day+"it is sunday");
    }
    else {
      System.out.println(day+"it is invalid");
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the day");
    int day =sc.nextInt();
    Finder(day);
  }
}