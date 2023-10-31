import java.util.Scanner;
public class Gradecalculation {
  public static void Calculation(int percentage) {
    if(percentage>=90) {
      System.out.println("Grade A");
    }
    else if(percentage>=80) {
      System.out.println("Grade B");
    }
    else if(percentage>=70) {
      System.out.println("Grade C");
    }
    else if(percentage>=60) {
      System.out.println("Grade D");
    }
    else if(percentage>=50) {
      System.out.println("Grade E"); 
  }
    else {
      System.out.println("Grade F");
    }
  }
  public static void main(String args[]) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter the marks");
    int marks = scanner.nextInt();
    Calculation(marks);
    
  }
}