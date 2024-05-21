import java.util.ArrayList;
import java.util.List;

// Abstract class for vehicles
abstract class Vehicle {
    private String brand;
    private String model;
    private String licensePlate;

    /**
     * Creates a new Vehicle instance.
     * @param brand         The brand of the vehicle.
     * @param model         The model of the vehicle.
     * @param licensePlate  The license plate of the vehicle.
     */
    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double calculateRentalPrice(int days);
}