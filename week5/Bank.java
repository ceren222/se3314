import java.util.HashMap;
import java.util.Map;

/**
 * Represents a bank
 */
public class Bank {
    private Map<Integer, Account> accounts;
    private int accountCounter;

    /**
     * Creates a new Bank instance.
     */
    public Bank() {
        this.accounts = new HashMap<>();
        this.accountCounter = 1;
    }

    /**
     * Creates an account.
     * @param customer The custome account is created.
     * @return created account.
     */
    public Account createAccount(Customer customer) {
        Account account = new Account(accountCounter++, customer);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    /**
     * @param accountNumber The account number to retrieve.
     */
    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
