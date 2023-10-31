import java.util.Scanner;
public class AlphabetCheck {
  public static void checking(char ch) {
    if((ch>='a') && (ch<='z') || (ch>'A' && ch<='Z')) {
      System.out.println(ch+ "it is a alpahabet");
    }
    else {
      System.out.println(ch+"it is not alphabet");
    }
  }
public static void main(String args[]) {
  Scanner scanner = new Scanner(System.in);
  System.out.println( "enter the character :");
  char ch = scanner.next().charAt(0);
  checking(ch);
}
}