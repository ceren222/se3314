import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @org.junit.jupiter.api.Test
    void createAccount() {

        Bank bank = new Bank();
        Customer customer = new Customer("ayşe", 1000.0);
        Account account = bank.createAccount(customer);
        assertNotNull(account);
        assertEquals(customer, account.getCustomer());
        account.deposit(500.0);
        assertEquals(1500.0, account.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void getAccount() {
        Bank bank = new Bank();
        Customer customer = new Customer("ayşe", 1500.0);
        Account createdAccount = bank.createAccount(customer);
        Account retrievedAccount = bank.getAccount(createdAccount.getAccountNumber());
        assertNotNull(retrievedAccount);
        assertEquals(createdAccount, retrievedAccount);
        retrievedAccount.withdraw(500.0);
        assertEquals(1000.0, retrievedAccount.checkBalance());
    }
}
