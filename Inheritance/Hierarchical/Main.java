package Inheritance.Hierarchical;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;  // as a percentage, e.g. 4.5

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
    }

    void displayAccountType() {
        System.out.println("Account type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds withdrawal limit.");
            return false;
        }
        return super.withdraw(amount);
    }

    void displayAccountType() {
        System.out.println("Account type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int termInMonths;
    double interestRate;

    FixedDepositAccount(String accountNumber, double balance, int termInMonths, double interestRate) {
        super(accountNumber, balance);
        this.termInMonths = termInMonths;
        this.interestRate = interestRate;
    }

    double calculateMaturityAmount() {
        return balance * Math.pow(1 + interestRate / 100, termInMonths / 12.0);
    }

    void displayAccountType() {
        System.out.println("Account type: Fixed Deposit Account");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 1000.0, 4.0);
        CheckingAccount ca = new CheckingAccount("CA456", 500.0, 200.0);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 2000.0, 12, 6.0);

        sa.displayAccountType();
        System.out.println("Balance: " + sa.getBalance());
        sa.addInterest();
        System.out.println("After interest: " + sa.getBalance());

        ca.displayAccountType();
        System.out.println("Balance: " + ca.getBalance());
        boolean w1 = ca.withdraw(250.0);
        System.out.println("Withdraw 250 succeed? " + w1);
        System.out.println("Balance now: " + ca.getBalance());

        fda.displayAccountType();
        System.out.println("Balance: " + fda.getBalance());
        System.out.println("Maturity amount after " + fda.termInMonths + " months: " + fda.calculateMaturityAmount());
    }
}

