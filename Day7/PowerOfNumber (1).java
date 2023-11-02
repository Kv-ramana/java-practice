/*Power of a Number
You are creating a program to find the power of a number using a for loop. The program should prompt the user to enter the base and exponent, and then use a for loop to calculate and display the result.*/

import java.util.Scanner;
public class PowerOfNumber {
    public static void power(int base, int exponent) {
        int result = 1;
        for(int i=0; i<exponent; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();
        power(base, exponent);
    }
}