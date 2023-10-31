import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();
        double[] calculatedValues = calculateSalaryComponents(basic);
        double gross = calculatedValues[0] + calculatedValues[1] + basic;
        System.out.printf("The gross salary of the employee is %.2f\n", gross);
    }
  
    public static double[] calculateSalaryComponents(double basic) {
        double hra, da;
        if (basic <= 10000) {
            hra = 0.2 * basic;
            da = 0.8 * basic;
        } else if (basic <= 20000) {
            hra = 0.25 * basic;
            da = 0.9 * basic;
        } else {
            hra = 0.3 * basic;
            da = 0.95 * basic;
        }
        return new double[]{hra, da};
    }
}
