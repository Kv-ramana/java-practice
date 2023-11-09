import java.util.Scanner;
public class HighestFrequency {
  public static void Highest(String str) {
    int highest = 0;
    char ch =' ';
    for(int i=0;i<str.length();i++) {
      int count = 0;
      for(int j=0;j<str.length();j++) {
        if(str.charAt(i)==str.charAt(j)) {
          count++;
        }
      }
      if(count>highest) {
        highest = count;
        ch=str.charAt(i);
      }
    }
    System.out.println("highest frequency " + ch); 
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string");
    String str = scanner.nextLine();
    Highest(str);
  }
}