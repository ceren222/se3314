import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @org.junit.jupiter.api.Test
    void withdraw() {

        Customer customer = new Customer("Ata", 3000.0);
        Account account = new Account(345, customer);
        account.deposit(2000.0);
        account.withdraw(1000.0);


        assertEquals(1000.0, account.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void checkBalance() {
        Customer customer = new Customer("Beren", 4000.0);
        Account account = new Account(123, customer);
        double balance = account.checkBalance();
        assertEquals(0.0, balance);
    }

    @org.junit.jupiter.api.Test
    void getAccountNumber() {
        Customer customer = new Customer("Nil", 5000.0);
        Account account = new Account(234, customer);
        int accountNumber = account.getAccountNumber();
        assertEquals(234, accountNumber);
    }


}
