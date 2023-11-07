import java.util.Scanner;
public class FirstOccurrance {
  public static void occurrance(String str,char ch) {
    int count = 0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)==ch) {
        count++;
      }
    }
    System.out.println("First occurance of "+ch+" is at index :"+count);
    
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = scanner.nextLine();
    System.out.println("enter the character : ");
    char ch = scanner.next().charAt(0);
    occurrance(str,ch);
  }
}
