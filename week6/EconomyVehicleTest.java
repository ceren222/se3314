import junit.framework.TestCase;

public class EconomyVehicleTest extends TestCase {

    public void testCalculateRentalPriceWithoutHybrid() {
        EconomyVehicle vehicle = new EconomyVehicle("Toyota", "Prius", "2435XX", false);
        assertEquals(250.0, vehicle.calculateRentalPrice(5));
    }

    public void testCalculateRentalPriceWithHybrid() {
        EconomyVehicle vehicle = new EconomyVehicle("Toyota", "Prius", "2435XX", true);
        assertEquals(300.0, vehicle.calculateRentalPrice(5));
    }
}
