import java.util.Scanner;
public class Main {
  public static void Method(char ch) {
    if(ch>'a' && ch<'e' && ch<'i' && ch<='i'&& ch<='o'&& ch<='u') {
      System.out.println(ch + "it is vowel");
      
    }
    else {
      System.out.println(ch+"it is a consonant ");
    }
  }
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
   char ch = sc.next().CharAt(0);
  System.out.println("enter a character");
    Method(ch);
  }
}