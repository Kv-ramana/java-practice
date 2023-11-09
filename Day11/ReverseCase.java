import java.util.Scanner;
public class ReverseCase {
  public static void Reverse(String str) {
    for(int i=0;i<str.length();i++) {
      char c = str.charAt(i);
      if(Character.isUpperCase(c)) {
        System.out.println(Character.toLowerCase(c));
      }
      else {
        System.out.println(Character.toUpperCase(c));
        }
      }
    }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string");
    String str = scanner.nextLine();
    Reverse(str);
  }
}