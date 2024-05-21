
class EconomyVehicle extends Vehicle {
    private boolean isHybrid;
    private static final double BASE_PRICE = 50.0;
    private static final double HYBRID_PRICE_PER_DAY = 10.0;
    /**
     * Creates a new EconomyVehicle instance.
     * @param brand         The brand of the vehicle.
     * @param model         The model of the vehicle.
     * @param licensePlate  The license plate of the vehicle.
     * @param isHybrid      Indicates whether the vehicle is hybrid or not.
     */
    public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }
    /**
     * Calculates the rental price for the vehicle based on the number of days.
     * @param days The number of days for which the vehicle is rented.
     * @return The total rental price for the specified number of days.
     */
    @Override
    public double calculateRentalPrice(int days) {
        double totalPrice = BASE_PRICE * days;
        if (isHybrid) {
            totalPrice += HYBRID_PRICE_PER_DAY * days;
        }
        return totalPrice;
    }
}



