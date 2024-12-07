public class Warrior extends Character {

    /**
     * Constructor for creating a Warrior character.
     *
     * @param name        the name of the Warrior
     * @param health      the health points of the Warrior
     * @param attackPower the attack power of the Warrior
     */
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character opponent) {
        opponent.takeDamage(attackPower * 2);
    }

    public void defend() {
        System.out.println(getName() + " braces for impact.");

    }
}