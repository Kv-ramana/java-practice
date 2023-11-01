import java.util.Scanner;
public class FrequencyDigits {
  public static void Main(int number) {
    int frequency[] = new int[10];
    while(number != 0) {
      int remainder = number % 10;
      frequency[remainder]++;
      number = number / 10;
    }
    for(int i=0;i<10;i++) {
      if(frequency[i] != 0) {
        System.out.println(i + " occurs " + frequency[i] + " times");
      }
    }
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number ");
    int number=scanner.nextInt();
    Main(number);
  }
}