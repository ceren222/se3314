/**
 * customer name and initial deposit
 */
public class Customer {
    private String name;
    private double initialDeposit;

    /**
     * @param name           customer name
     * @param initialDeposit initial deposit .
     */
    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    /**
     * @return  costumer name .
     */
    public String getName() {
        return name;
    }

    /**
     * @return initial deposit
     */
    public double getInitialDeposit() {
        return initialDeposit;
    }
}
