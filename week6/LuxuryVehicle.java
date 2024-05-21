class LuxuryVehicle extends Vehicle {
    private boolean hasGPS;
    private boolean hasLeatherSeats;
    private static final double BASE_PRICE = 100.0;
    private static final double GPS_PRICE_PER_DAY = 20.0;
    private static final double LEATHER_SEATS_PRICE_PER_DAY = 30.0;

    /**
     * Creates a new LuxuryVehicle instance.
     * @param brand         The brand of the vehicle.
     * @param model         The model of the vehicle.
     * @param licensePlate  The license plate of the vehicle.
     */

    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public double calculateRentalPrice(int days) {
        double totalPrice = BASE_PRICE * days;
        if (hasGPS) {
            totalPrice += GPS_PRICE_PER_DAY * days;
        }
        if (hasLeatherSeats) {
            totalPrice += LEATHER_SEATS_PRICE_PER_DAY * days;
        }
        return totalPrice;
    }
}