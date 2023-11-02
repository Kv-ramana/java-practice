import java.util.Scanner;
public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean continueTransactions = true;
        while (continueTransactions) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                    } else {
                        System.out.println("Insufficient balance for the withdrawal.");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance: $" + balance);
                    break;
                case 4:
                    continueTransactions = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
        System.out.println("Thank you for using the bank transaction application!");
    }
}
