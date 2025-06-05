package Training;

// BankAccount.java
// A program to simulate basic bank account operations

public class BankAccount {

    // Attributes for each account
    int accountNumber;
    String ownerName;
    double balance;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name    : " + ownerName);
        System.out.println("Current Balance: " + balance);
        System.out.println("----------------------------");
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount(123456, "Kunal Maheshwari", 5000.0);

        // Display initial info
        account.displayAccountInfo();

        // Deposit money
        account.deposit(1500.0);

        // Withdraw money
        account.withdraw(2000.0);

        // Try withdrawing an invalid amount
        account.withdraw(6000.0);

        // Display updated info
        account.displayAccountInfo();
    }
}
