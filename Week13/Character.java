/**
 * Represents a character in the Lord of the Rings universe.
 */
public class Character {
    private String name;
    private int age;

    /**
     * Constructs a Character with the given name and age.
     * @param name The name of the character.
     * @param age The age of the character.
     * @throws IllegalArgumentException if name is null or empty, or if age is not positive.
     */
    public Character(String name, int age) {
        assert name != null && !name.isEmpty() : "Name cannot be null or empty";
        assert age > 0 : "Age must be positive";
        this.name = name;
        this.age = age;
    }

    /**
     * Returns the name of the character.
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character.
     * @param name The new name of the character.
     * @throws IllegalArgumentException if name is null or empty.
     */
    public void setName(String name) {
        assert name != null && !name.isEmpty() : "Name cannot be null or empty";
        this.name = name;
    }

    /**
     * Returns the age of the character.
     * @return The age of the character.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the character.
     * @param age The new age of the character.
     * @throws IllegalArgumentException if age is not positive.
     */
    public void setAge(int age) {
        assert age > 0 : "Age must be positive";
        this.age = age;
    }

    /**
     * Returns a string representation of the character.
     * @return A string representation of the character.
     */
    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}
