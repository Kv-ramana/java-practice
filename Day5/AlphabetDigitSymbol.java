import java.util.Scanner;
public class AlphabetDigitSymbol {
  public static void Checking(char ch) {
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
      System.out.println(ch + " is an alphabet");
    }
    else if(ch>='0' && ch<='9') {
      System.out.println(ch + " is a digit");
    }
    else {
      System.out.println(ch + " is a symbol");
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a character :");
    char ch =sc.next().charAt(0);
    Checking(ch);
  }
}