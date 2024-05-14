


public class Archer extends Character {
    /**
     * Constructor for creating an Archer character.
     *
     * @param name        the name of the Archer
     * @param health      the health points of the Archer
     * @param attackPower the attack power of the Archer
     */
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }

    public void defend() {
        System.out.println(getName() + " takes a defensive stance.");

    }
}