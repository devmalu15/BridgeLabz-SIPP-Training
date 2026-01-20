import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialBalance) {
        BankAccount newAccount = new BankAccount(this, initialBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }

    public String getName() {
        return name;
    }
}

class BankAccount {
    private Bank bank;
    private double balance;

    public BankAccount(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (BankAccount acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + ", Balance: $" + acc.getBalance());
        }
    } public static void main(String[] args) {
        // Create banks
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Open accounts
        bank1.openAccount(alice, 1000.0);
        bank2.openAccount(alice, 1500.0);
        bank1.openAccount(bob, 500.0);

        // View balances
        alice.viewBalance();
        bob.viewBalance();
    }

}
