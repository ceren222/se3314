/**
 represent bank Account
 */
public class Account {
    private int accountNumber;
    private Customer customer;
    private double balance;

    /**
     * Creates a new Account instance.
     * @param accountNumber The account number.
     * @param customer      The customer associated with the account.
     */
    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    /**
     * Deposits money in the account.
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the account to other account.
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("insufficient balance");
        }
    }

    /**
     * @return The current account balance.
     */
    public double checkBalance() {
        return balance;
    }

    /**
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return null;
    }
}
