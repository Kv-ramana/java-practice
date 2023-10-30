/*
 Alphabet, Digit, or Special Character Check
You are tasked with creating a program to check whether a character is an alphabet, digit, or special character. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an alphabet, digit, or special character.
*/

import java.util.Scanner;
public class AlphabetDigitSymbol {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the character");
    char ch= scanner.next().charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
      System.out.println("it is an alphabet");
      
    }
    else if(ch>='0' && ch<='9') {
      System.out.println("it is an digit");
    }
    else {
      System.out.println("it is a symbol");
    }
  }
}