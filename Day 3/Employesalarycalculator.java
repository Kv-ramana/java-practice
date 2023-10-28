/*
 Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.
*/
import java.util.Scanner;
public class Employesalarycalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the monthly salary of the employee:");
        double monthlySalary = scanner.nextDouble();
        double annualSalary = monthlySalary * 12;
        double tax;

        if (annualSalary <= 250000) {
            tax = 0;
        } else if (annualSalary <= 500000) {
            tax = 0.05 * (annualSalary - 250000);
        } else if (annualSalary <= 1000000) {
            tax = 0.2 * (annualSalary - 500000) + 12500;
        } else {
            tax = 0.3 * (annualSalary - 1000000) + 112500;
        }

        double netSalary = annualSalary - tax;

        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}
