/*
 Temperature Converter: Create an application that takes a temperature in Celsius or Fahrenheit as input and converts it to the other unit. Use conditional statements to determine whether to convert from Celsius to Fahrenheit or vice versa.
*/
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Is the temperature in Celsius or Fahrenheit? (Enter C for Celsius and F for Fahrenheit):");
        char unit = scanner.next().charAt(0);

        if (unit == 'C' || unit == 'c') {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (unit == 'F' || unit == 'f') {
            double celsius = (temperature - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid unit. Please enter C for Celsius or F for Fahrenheit.");
        }
    }
}
