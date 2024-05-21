import junit.framework.TestCase;

public class RentalRecordTest extends TestCase {

    public void testGetVehicle() {
        Vehicle vehicle = new LuxuryVehicle("BMW", "X5", "WWW111", true, true);
        RentalRecord rentalRecord = new RentalRecord(vehicle, 7, 1190.0, "John");
        assertEquals(vehicle, rentalRecord.getVehicle());
    }

    public void testSetVehicle() {
        Vehicle vehicle = new EconomyVehicle("Toyota", "Prius", "2435XX", true);
        RentalRecord rentalRecord = new RentalRecord(null, 0, 0.0, null);
        rentalRecord.setVehicle(vehicle);
        assertEquals(vehicle, rentalRecord.getVehicle());
    }

    public void testGetRentalPeriod() {
        RentalRecord rentalRecord = new RentalRecord(null, 5, 250.0, null);
        assertEquals(5, rentalRecord.getRentalPeriod());
    }

    public void testSetRentalPeriod() {
        RentalRecord rentalRecord = new RentalRecord(null, 0, 0.0, null);
        rentalRecord.setRentalPeriod(7);
        assertEquals(7, rentalRecord.getRentalPeriod());
    }

    public void testGetRentalPrice() {
        RentalRecord rentalRecord = new RentalRecord(null, 0, 350.0, null);
        assertEquals(350.0, rentalRecord.getRentalPrice());
    }

    public void testSetRentalPrice() {
        RentalRecord rentalRecord = new RentalRecord(null, 0, 0.0, null);
        rentalRecord.setRentalPrice(500.0);
        assertEquals(500.0, rentalRecord.getRentalPrice());
    }

    public void testGetLessor() {
        RentalRecord rentalRecord = new RentalRecord(null, 0, 0.0, "Ceren");
        assertEquals("Ceren", rentalRecord.getLessor());
    }

    public void testSetLessor() {
        RentalRecord rentalRecord = new RentalRecord(null, 0, 0.0, null);
        rentalRecord.setLessor("Ata");
        assertEquals("Ata", rentalRecord.getLessor());
    }
}
