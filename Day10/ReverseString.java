import java.util.Scanner;
public class ReverseString {
  public static void reverse(String str) {
    String reverse = "";
    for(int i=str.length()-1;i>=0;i--) {
      reverse = reverse + str.charAt(i);
    }
    System.out.println("Reversed String :"+reverse);
  }
public static void main(String args[]) {
  Scanner scanner =new Scanner(System.in);
  System.out.println("enter the string : ");
  String str=scanner.nextLine();
  reverse(str);
}
}