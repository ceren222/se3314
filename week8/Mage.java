public class Mage extends Character {
    /**
     * Constructor for creating a Mage character.
     *
     * @param name        the name of the Mage
     * @param health      the health points of the Mage
     * @param attackPower the attack power of the Mage
     */
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character Opponent) {
        Opponent.takeDamage(attackPower + 50);
    }

    public void boost() {
        System.out.println(getName() + " enhances their magical powers!");

    }
}
