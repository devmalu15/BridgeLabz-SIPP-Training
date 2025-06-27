public class BankAccount {
    // Static variable shared among all bank accounts
    private static String bankName;
    private static int totalAccounts = 0;

    // Instance variables

    private final int accountNumber;//
    private String accountHolderName;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {

        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        } else {
            System.out.println("This is not a valid bank account.");
        }
    }

    public static void main(String[] args) {
        BankAccount.bankName = "Global Bank";

        BankAccount account1 = new BankAccount(101, "Alice");
        BankAccount account2 = new BankAccount(102, "Bob");

        account1.displayDetails();
        account2.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}