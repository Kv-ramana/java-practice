import java.util.Scanner;
public class LastOccurrance {
  public static void occurrance(String str,char ch) {
    int count=0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)==ch) {
        count++;
      }
    }
   System.out.println("last occurance of" + (ch) + "is at index :" + (count-1));
    
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = sc.nextLine();
    System.out.println("enter the character :");
    char ch = sc.next().charAt(0);
    occurrance(str,ch);
  }
}