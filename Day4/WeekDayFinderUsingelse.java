import java.util.Scanner;
public class WeekDayFinderUsingelse {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the week number");

    int number = scanner.nextInt();
    if(number==1) {
      System.out.println("Monday");
  }
    else if(number==2) {
      System.out.println("tuesday");
  }
    else if(number==3) {
      System.out.println("wensday");
  }
    else if(number==4) {
      System.out.println("thursday");
  }
    else if(number==5) {
      System.out.println("Friday");
  }
    else if(number==6) {
      System.out.println("Saturday");
  }
    else if(number==7) {
      System.out.println("sunday");
  }
    else {
      System.out.println("Invalid Input");
  }
}
}
