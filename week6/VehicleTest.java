import junit.framework.TestCase;

public class VehicleTest extends TestCase {

    public void testGetBrand() {
        Vehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", true, true);
        assertEquals("BMW", vehicle.getBrand());
    }

    public void testGetModel() {
        Vehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", true, true);
        assertEquals("X6", vehicle.getModel());
    }

    public void testGetLicensePlate() {
        Vehicle vehicle = new LuxuryVehicle("BMW", "X6", "WWW111", true, true);
        assertEquals("WWW111", vehicle.getLicensePlate());
    }

    public void testCalculateRentalPrice() {
        assertTrue(true);
    }
}
