import junit.framework.TestCase;

public class LuxuryVehicleTest extends TestCase {

    public void testCalculateRentalPriceWithoutGPSAndLeatherSeats() {
        LuxuryVehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", false, false);
        assertEquals(700.0, vehicle.calculateRentalPrice(7));
    }

    public void testCalculateRentalPriceWithGPS() {
        LuxuryVehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", true, false);
        assertEquals(840.0, vehicle.calculateRentalPrice(7));
    }

    public void testCalculateRentalPriceWithLeatherSeats() {
        LuxuryVehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", false, true);
        assertEquals(1050.0, vehicle.calculateRentalPrice(7));
    }

    public void testCalculateRentalPriceWithGPSAndLeatherSeats() {
        LuxuryVehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", true, true);
        assertEquals(1190.0, vehicle.calculateRentalPrice(7));
    }
}
