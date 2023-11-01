/*Printing Alphabets
You are designing a program to print all the alphabets from 'a' to 'z'. To achieve this, your program should use a while loop to iterate through the ASCII values of the alphabets from 97 to 122. For each value, it should print the corresponding alphabet character.*/
import java.util.Scanner;
public class Asciivalues {
  public static void Ascii(int n) {
    char ch='a';
    for(ch='a';ch<='z';ch++) {
      int value =(int)ch;
      System.out.println(ch + "=" + value);
    }
    
  }
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the character");
    char ch = sc.next().charAt(0);
    Ascii(ch);
    
  }
}