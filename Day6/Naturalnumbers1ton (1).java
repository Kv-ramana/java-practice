import java.util.Scanner;
public class Naturalnumbers1ton {
  public void Main(int n) {
    int i=1;
      
    while(i<=n) {
      System.out.println(i);
      i++;
    }
  }

public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the n value");
  int n= sc.nextInt();
  Naturalnumbers1ton obj = new Naturalnumbers1ton();
  obj.Main(n);
}
}