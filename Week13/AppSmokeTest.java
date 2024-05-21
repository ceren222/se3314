import org.junit.Test;
import static org.junit.Assert.*;

public class AppSmokeTest {

    @Test
    public void testAppMain() {
        // Test main method of App class
        // No assertions needed as it only prints output
        String[] args = {};
        App.main(args);
    }

    @Test
    public void testQuestStart() {
        // Test start method of Quest class
        Character frodo = new Character("Frodo Baggins", 50);
        MiddleEarthMap map = new MiddleEarthMap();
        Quest quest = new Quest("Destroy the One Ring", frodo, map);

        Character aragorn = new Character("Aragorn", 87);
        quest.addParticipant(aragorn);

        // No assertions needed as it only prints output
        quest.start();
    }
}
