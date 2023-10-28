/*
 Logical Operators
Write a program to implement logical operations on boolean values. Prompt the user to enter two boolean values (true or false) as inputs. Implement logical AND, OR, and NOT operations using appropriate logical operators and display the results as boolean values.
*/

import java.util.Scanner;
public class Logicaloperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first boolean value (true or false): ");
        boolean bool1 = scanner.nextBoolean();
        System.out.println("Enter the second boolean value (true or false): ");
        boolean bool2 = scanner.nextBoolean();
        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notBool1 = !bool1;
        boolean notBool2 = !bool2;

        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(notBool1);
        System.out.println(notBool2);
    }
}
