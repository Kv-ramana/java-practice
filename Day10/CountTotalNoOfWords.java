import java.util.Scanner;
public class CountTotalNoOfWords {
  public static void Count(String str) {
    int count = 0;
    for(int i=0;i<str.length();i++) {
  
      if(str.charAt(i)==' ') {
        count++;
      }
    }
    System.out.println("Total no of words :"+(count+1));
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = scanner.nextLine();
    Count(str);
    
  }
}
