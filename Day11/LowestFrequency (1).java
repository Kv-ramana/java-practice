import java.util.Scanner;
public class LowestFrequency {
  public static void Lowest(String str) {
    int lowest = str.length();
    char ch = ' ';
    for(int i=0;i<str.length();i++) {
      int count = 0;
      for(int j=0;j<str.length();j++) {
        if(str.charAt(i)==str.charAt(j)) {
          count++;
        }
      }
      if(count<lowest) {
        lowest = count;
       ch=str.charAt(i);
      }
    }
     System.out.println("lowest Frequency : " + ch);
    
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string");
    String str = scanner.nextLine();
    Lowest(str);
  }
}