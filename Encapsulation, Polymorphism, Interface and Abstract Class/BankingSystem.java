package Day2;

//Loanable Interface
interface Loanable {
 void applyForLoan(double amount);
 boolean calculateLoanEligibility();
}

//Abstract BankAccount Class
abstract class BankAccount {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 // Encapsulation with Getters/Setters
 public String getAccountNumber() {
     return accountNumber;
 }

 public String getHolderName() {
     return holderName;
 }

 public double getBalance() {
     return balance;
 }

 protected void setBalance(double balance) {
     this.balance = balance;
 }

 // Concrete methods
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited ₹" + amount + " to " + holderName + "'s account.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew ₹" + amount + " from " + holderName + "'s account.");
     } else {
         System.out.println("Insufficient balance or invalid withdrawal.");
     }
 }

 // Abstract method
 public abstract double calculateInterest();

 // Print Account Details
 public void printAccountSummary() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Holder Name: " + holderName);
     System.out.println("Balance: ₹" + balance);
     System.out.println("Interest Earned: ₹" + calculateInterest());
     System.out.println("-----------------------------------");
 }
}

//SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
 private final double interestRate = 0.04; // 4% per annum

 public SavingsAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterest() {
     return getBalance() * interestRate;
 }

 public void applyForLoan(double amount) {
     System.out.println(getHolderName() + " applied for a loan of ₹" + amount + " (Savings Account)");
 }

 public boolean calculateLoanEligibility() {
     return getBalance() >= 10000;
 }
}

//CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
 private final double interestRate = 0.02; // 2% per annum

 public CurrentAccount(String accountNumber, String holderName, double balance) {
     super(accountNumber, holderName, balance);
 }

 @Override
 public double calculateInterest() {
     return getBalance() * interestRate;
 }

 public void applyForLoan(double amount) {
     System.out.println(getHolderName() + " applied for a loan of ₹" + amount + " (Current Account)");
 }

 public boolean calculateLoanEligibility() {
     return getBalance() >= 25000;
 }
}

//Main Class
public class BankingSystem {
	public static void main(String[] args) {
     // Create accounts
     BankAccount acc1 = new SavingsAccount("S101", "Alice", 15000);
     BankAccount acc2 = new CurrentAccount("C202", "Bob", 30000);
     BankAccount acc3 = new SavingsAccount("S102", "Charlie", 9000);

     // Deposit/Withdraw Operations
     acc1.deposit(2000);
     acc2.withdraw(5000);

     // Polymorphic interest calculation
     BankAccount[] accounts = { acc1, acc2, acc3 };

     for (BankAccount acc : accounts) {
         acc.printAccountSummary();

         // Check loan eligibility via interface
         if (acc instanceof Loanable) {
        	 Loanable loanableAcc=(Loanable) acc;
             loanableAcc.applyForLoan(50000);
             if (loanableAcc.calculateLoanEligibility()) {
                 System.out.println("Loan Approved for " + acc.getHolderName());
             } else {
                 System.out.println("Loan Denied for " + acc.getHolderName());
             }
             System.out.println("-----------------------------------");
         }
     }
 }
}
