import java.util.Scanner;

public class Naturalnumbersnto1 {
    public static void printNumbers(int n) {
        int i = n;
            
        while(i >= 1) {
            System.out.println(i);
            i--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        printNumbers(n);
    }
}
