import java.util.Scanner;

public class UpperOrLower {
    public void Checking(char ch) {
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        UpperOrLower obj = new UpperOrLower();
        obj.Checking(ch);
    }
}
