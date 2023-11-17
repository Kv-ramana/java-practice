import java.util.ArrayList;

class BankAccount {
  private int accountNumber;
  private String customerName;
  private double balance;

  public BankAccount(int accountNumber, String customerName, double balance) {
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.balance = balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public double getBalance() {
    return balance;
  }
}

public class BankAccountManager {
  private ArrayList<BankAccount> accounts = new ArrayList<>();

  public void addAccount(BankAccount account) {
    accounts.add(account);
    System.out.println("The account is successfully added.");
  }

  public void removeAccount(int accountNumber) {
    for(int i=0; i<accounts.size(); i++) {
      if(accounts.get(i).getAccountNumber() == accountNumber) {
        accounts.remove(i);
        System.out.println("Account is successfully removed.");
        return;
      }
    }
    System.out.println("Account not found.");
  }

  public void searchAccount(int accountNumber) {
    for(int i=0; i<accounts.size(); i++) {
      if(accounts.get(i).getAccountNumber() == accountNumber) {
        System.out.println("Account number: " + accounts.get(i).getAccountNumber());
        System.out.println("Customer name: " + accounts.get(i).getCustomerName());
        System.out.println("Balance: " + accounts.get(i).getBalance());
        return;
      }
    }
    System.out.println("Account not found.");
  }

  public void displayAllAccounts() {
    System.out.println("All bank accounts:");
    for(BankAccount account : accounts) {
      System.out.println("Account number: " + account.getAccountNumber());
      System.out.println("Customer name: " + account.getCustomerName());
      System.out.println("Balance: " + account.getBalance());
    }
  }

  public static void main(String args[]) {
    BankAccountManager MM = new BankAccountManager();

    BankAccount account1 = new BankAccount(123, "venky",100);
    BankAccount account2 = new BankAccount(456, "sai", 200.0);

    MM.addAccount(account1);
    MM.addAccount(account2);

    MM.displayAllAccounts();
    MM.removeAccount(123);
    MM.searchAccount(456);
  }
}