public class App {
    public static void main(String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        Character aragorn = new Character("Aragorn", "Human", 88);
        Character legolas = new Character("Legolas", "Elf", 500);

        // Establish friendships between characters
        frodo.addFriend(aragorn);
        frodo.addFriend(legolas);

        // Print details of each character
        frodo.printDetails();
        aragorn.printDetails();
        legolas.printDetails();

        // Create quest instances
        Quest destroyRingQuest = new Quest("Destroy the One Ring");
        Quest protectMiddleEarthQuest = new Quest("Protect Middle-earth");

        // Attempt quest completion by characters
        frodo.completeQuest(destroyRingQuest);
        legolas.completeQuest(protectMiddleEarthQuest);
    }
}
