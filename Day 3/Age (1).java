import java.util.Scanner;
public class Age {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your birth year: ");
    int birthYear = scanner.nextInt();
    System.out.println("Enter the current year: ");
    int currentYear = scanner.nextInt();
    int age = currentYear - birthYear;
    System.out.println("You are " + age + " years old.");
  }
}