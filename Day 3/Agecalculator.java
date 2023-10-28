/*
Age Calculator  :  Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.*/

import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate in the format YYYY-MM-DD:");
        String birthdateInput = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateInput);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        int years = age.getYears();
        System.out.println("Your age is " + years + " years.");
        if (years < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
    }
}


