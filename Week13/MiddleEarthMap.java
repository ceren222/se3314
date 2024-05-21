import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MiddleEarthMap {
    private ArrayList<String> locations;
    /**
     * Constructs a MiddleEarthMap and loads locations from a file.
     */
    public MiddleEarthMap() {
        locations = new ArrayList<>();
        loadLocations("map.txt");
    }
    /**
     * Returns the list of locations in Middle Earth.
     *
     * @return The list of locations.
     */
    public ArrayList<String> getLocations() {
        return locations;
    }

    private void loadLocations(String fileName) {
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                locations.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File " + fileName + " not found.");
        }
    }
}
