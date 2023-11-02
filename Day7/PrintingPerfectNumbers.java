import java.util.Scanner;
public class PrintingPerfectNumbers {
  public static void Perfect(int n) {
    int i=1;
    while(i<=n) {
      int sum=0;
      for(int k=1;k<i;k++) {
        if(i%k==0) {
          sum=sum+k;
        }
      }
      if(sum==i) {
        System.out.println(i);
      }
      i++;
    }
    
  }
  public static void main(String args[]) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("enter the number");
    int n= scanner.nextInt();
    Perfect(n);
  }
}