import java.util.Scanner;
public class VowelOrConsonant {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the character ");
    char ch = scanner.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
      System.out.println("it is a vowel");
      
  }
    else {
      System.out.println("it is a consonant");
    }
}
}