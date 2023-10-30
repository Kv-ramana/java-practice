

import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  of basic salary");
        double basic = sc.nextDouble();
        double hra = 0;
        double da = 0;
        double gross = 0;
        if (basic <= 10000) {
            hra = 0.2 * basic;
            da = 0.8 * basic;
        }
        else if (basic <= 20000) {
            hra = 0.25 * basic;
            da = 0.9 * basic;
        }
        else {
            hra = 0.3 * basic;
            da = 0.95 * basic;
        }
        gross = basic + hra + da;
        System.out.printf("The gross salary of the employee is %.2f\n", gross);
    }
}