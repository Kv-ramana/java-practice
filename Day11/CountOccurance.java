import java.util.Scanner;
public class CountOccurance {
  public static void occurance(String str,char ch) {
    int count =0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)==ch) {
        count++;
      }
    }
     System.out.println("total no of occurance" + count);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string");
    String str = scanner.nextLine();
    System.out.println("enter the character : ");
    char ch = scanner.next().charAt(0);
    occurance(str,ch);
  }
}
