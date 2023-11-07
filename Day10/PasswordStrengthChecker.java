import java.util.Scanner;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        password = sc.nextLine();
        int alpha = 0,digit=0,spec=0;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alpha++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else {
                splchar++;
            }
        }
        System.out.println("Alphabets: " + alpha);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + splchar);
    }
}
