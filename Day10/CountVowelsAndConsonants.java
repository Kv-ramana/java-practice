
import java.util.Scanner;
public class CountVowelsAndConsonants {
  public static void Count(String str) {
    int vowels=0;
    int consonants =0;

    for(int i=0;i<str.length();i++) {
      char ch = str.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
        vowels++;
      }
      else {
        consonants++;
      }
    }
    System.out.println("vowels :"+vowels);
    System.out.println("consonants :"+consonants);
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String str = scanner.nextLine();
    Count(str);
  }
}