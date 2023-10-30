/*
 Alphabet Check
You are designing a program to check whether a character is an alphabet or not. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an alphabet or not.
*/

import java.util.Scanner;
public class AlphabetCheck {
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the character :");
    char ch = scanner.next().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
      System.out.println("it is an alphabet");
    }
    else {
      System.out.println("it is not alpahbet");
    }
  }
}