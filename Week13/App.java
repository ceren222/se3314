public class App {
    public static void main(String[] args) {
        Character frodo = new Character("Frodo Baggins", 50);
        Character aragorn = new Character("Aragorn", 87);
        MiddleEarthMap map = new MiddleEarthMap();
        Quest quest = new Quest("Destroy the One Ring", frodo, map);

        quest.addParticipant(aragorn);
        quest.start();
    }
}
