/*
 Currency Converter
Write a program to convert currency from one currency to another. Prompt the user to enter the amount in the source currency and the exchange rate. Use appropriate data types for variables and display the converted amount in the target currency.
  */
import java.util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in the source currency: ");
        double sourceAmount = scanner.nextDouble();
        System.out.println("Enter the exchange rate: ");
        double exchangeRate = scanner.nextDouble();
        double targetAmount = sourceAmount * exchangeRate;

        System.out.println("The converted amount in the target currency is: " + targetAmount);
    }
}
