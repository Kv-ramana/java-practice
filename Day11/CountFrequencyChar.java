import java.util.Scanner;
public class CountFrequencyChar {
  public static void Count(String str) {
    for(int i=0;i<str.length();i++) {
      int count =0;
      for(int j=0;j<str.length();j++) {
        if(str.charAt(i)==str.charAt(j)) {
          count++;
        }
      }
       System.out.println(str.charAt(i) + " " + count);
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = scanner.nextLine();
    Count(str);
  }
}