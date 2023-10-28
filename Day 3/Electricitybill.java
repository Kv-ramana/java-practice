/*
Electricity bill app along with GST: create an application that takes previous units and present units, and find number of units, based on numbers of units find the electricity bill along with GST. use conditional statements to determine the unit slabs.
*/

import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter previous units: ");
        int prevUnits = scanner.nextInt();
        System.out.print("Enter present units: ");
        int presentUnits = scanner.nextInt();
        int unitsConsumed = presentUnits - prevUnits;
        double rate = 0.0;
        if (unitsConsumed <= 100) {
            rate = 2.50;
        } else if (unitsConsumed <= 200) {
            rate = 4.00;
        } else if (unitsConsumed <= 300) {
            rate = 5.00;
        } else {
            rate = 6.00;
        }

        double totalBill = unitsConsumed * rate;
        double gst = (totalBill * 18) / 100;
        double finalBill = totalBill + gst;

        System.out.println("Total Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Bill: Rs. " + totalBill);
        System.out.println("GST (18%): Rs. " + gst);
        System.out.println("Final Bill (including GST): Rs. " + finalBill);
    }
}
