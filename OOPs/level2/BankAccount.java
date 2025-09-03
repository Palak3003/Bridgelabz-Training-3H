package OOPs.level2;
import java.text.DecimalFormat;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + new DecimalFormat("#.##").format(amount) + ". New balance: $" + new DecimalFormat("#.##").format(balance));
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn $" + new DecimalFormat("#.##").format(amount) + ". New balance: $" + new DecimalFormat("#.##").format(balance));
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + new DecimalFormat("#.##").format(balance));
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "ACC123", 1000.00);

        System.out.println("Initial Account Details:");
        account.displayBalance();

        account.deposit(500.50);
        account.withdraw(200.00);
        account.withdraw(2000.00);

        System.out.println("\nFinal Account Details:");
        account.displayBalance();
    }
}
