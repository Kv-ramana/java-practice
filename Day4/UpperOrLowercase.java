/*
Uppercase or Lowercase Alphabet Check
You are designing a program to check whether a character is an uppercase or lowercase alphabet. Your program should prompt the user to enter a character, and then it should use conditional statements to check and display whether the character is an uppercase or lowercase alphabet.*/

import java.util.Scanner;
public class UpperOrLowercase {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a character");
    char ch = scanner.next().charAt(0);
    if(ch>='a' && ch<='z') {
      System.out.println("it is a lowercase");
      }
    elseif{
      System.out.println("it is a uppercase");
    }
    else {
      System.out.println("it is not character:");
    }
  }
}