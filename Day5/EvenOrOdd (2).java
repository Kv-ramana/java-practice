import java.util.Scanner;
public class EvenOrOdd {
    public void checkNumber(int num) {
        if(num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        EvenOrOdd obj = new EvenOrOdd();
        obj.checkNumber(num);
    }
}
