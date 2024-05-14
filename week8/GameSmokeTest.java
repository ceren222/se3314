import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameSmokeTest {

    private Game game;
    private Warrior warrior;
    private Mage mage;
    private Archer archer;

    @Before
    public void setUp() {
        game = new Game();
        warrior = new Warrior("Conan", 100, 15);
        mage = new Mage("Merlin", 80, 20);
        archer = new Archer("Legolas", 90, 18);

        game.addCharacter(warrior);
        game.addCharacter(mage);
        game.addCharacter(archer);
    }

    @org.testng.annotations.Test
    public void testGameStart() {

        game.StartGame();


        assertTrue(warrior.isDefeated() || mage.isDefeated() || archer.isDefeated());
    }

    @Test
    public void testWarriorSpecialAttack() {
        // Perform special attack of the warrior
        Character opponent = new Mage("Enemy Mage", 80, 20); // Create a test opponent
        warrior.special_Attack(opponent);


        assertTrue(opponent.getHealth() < 80); // Assuming warrior's special attack is powerful
    }

    @Test
    public void testMageSpecialAttack() {

        Character opponent = new Archer("Enemy Archer", 90, 18); // Create a test opponent
        mage.special_Attack(opponent);


        assertTrue(opponent.getHealth() < 90); // Assuming mage's special attack is powerful
    }

    @Test
    public void testArcherSpecialAttack() {

        Character opponent = new Warrior("Enemy Warrior", 100, 15); // Create a test opponent
        archer.special_Attack(opponent);


        assertTrue(opponent.getHealth() < 100); // Assuming archer's special attack is powerful
    }
}
