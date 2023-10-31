import java.util.Scanner;
public class CountTotalNoNotes {
  public static void Total(int amount) {
    int notes500 = 0, notes100 = 0, notes50 = 0;
    if(amount>=500) {
      System.out.println(amount+ "is divided into 500 notes");
      notes500 = amount/500;
      amount = amount%500;
      System.out.println(notes500+ "notes of 500");
    }
    if(amount>=100) {
      notes100 = amount/100;
      amount = amount%100;
      System.out.println(notes100+ "notes of 100");
  }
    if(amount>=50) {
      notes50 = amount/50;
      amount = amount%50;
      System.out.println(notes50+ "notes of 50");
}
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount");
    int amount = sc.nextInt();
    Total(amount);
  }
}
    