package ClassAndObject.Class_and_Object;
public class BankAccount {
    String accountHolder;
    String AccountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.AccountNumber = accountNumber;
        this.balance = balance;
    }

    public void DepositingMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }

    }

    public void WithdrawingMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }

    }

    public void DisplayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
        account.DisplayDetails();
        account.DepositingMoney(500.0);
        account.WithdrawingMoney(200.0);
        account.DisplayDetails();
    }
}