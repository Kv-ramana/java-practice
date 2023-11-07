import java.util.Scanner;
public class PalindromeOrNot {
  public static void Main(String str) {
    String reverse = "";
    for(int i=str.length()-1;i>=0;i--) {
      reverse = reverse + str.charAt(i);
    }
    if(str.equals(reverse)) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not Palindrome");
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string ");
    String str = scanner.nextLine();
    Main(str);
  }
}