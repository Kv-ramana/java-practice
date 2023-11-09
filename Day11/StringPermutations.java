import java.util.Scanner;
public class StringPermutations {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = scanner.nextLine();
    String ans = " ";
    StringPermutations(str,ans);
    System.out.println(ans);
    
  }
  public static void StringPermutations(String str,String ans) {
    if(str.length()==0) {
      System.out.println(ans);
      return;
    }
    for(int i=0;i<str.length();i++) {
      char ch = str.charAt(i);
      String ros = str.substring(0,i) + str.substring(i+1);
      StringPermutations(ros,ans+ch);
    }
  }
}