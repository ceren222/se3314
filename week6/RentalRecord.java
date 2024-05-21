class RentalRecord {
    private Vehicle vehicle;
    private int rentalPeriod;
    private double rentalPrice;
    private String lessor;

    /**
     * Creates a new RentalRecord instance.
     * @param vehicle        The vehicle that was rented.
     */
    public RentalRecord(Vehicle vehicle, int rentalPeriod, double rentalPrice, String lessor) {
        this.vehicle = vehicle;
        this.rentalPeriod = rentalPeriod;
        this.rentalPrice = rentalPrice;
        this.lessor = lessor;
    }

    // Getters and setters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getLessor() {
        return lessor;
    }

    public void setLessor(String lessor) {
        this.lessor = lessor;
    }
}
