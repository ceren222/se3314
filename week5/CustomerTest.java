import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Customer customer = new Customer("ayşe", 1000.0);
        String name = customer.getName();
        assertEquals("ayşe", name);
    }

    @org.junit.jupiter.api.Test
    void getInitialDeposit() {
        Customer customer = new Customer("ayşe", 1500.0);
        double initialDeposit = customer.getInitialDeposit();
        assertEquals(1500.0, initialDeposit);
    }
}
