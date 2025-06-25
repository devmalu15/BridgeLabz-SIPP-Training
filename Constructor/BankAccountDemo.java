package Constructor;
class BankAccount {
    public double AccountNumber;
    protected String AccountHolder;
    private double balance;

    // constructor
    public BankAccount(double AccountNumber, String AccountHolder, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.balance = balance;
    }
// Getters and Setters
    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }
}
// SavingsAccount class that extends BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super(0, "", 0.0); // Call the parent constructor with default values
    }
// Overriding the displayDetails method
    public void displayDetails() {
        System.out.println("accountNumber: " + AccountNumber);
        System.out.println("accountHolder: " + AccountHolder);

    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount bankaccount = new SavingsAccount();
        bankaccount.AccountNumber = 36460001006231578D;
        bankaccount.AccountHolder = "Aryan Bansal";
        bankaccount.setbalance(10000.0);

        bankaccount.displayDetails();
        System.out.println("Balance: " + bankaccount.getbalance());
    }
}
