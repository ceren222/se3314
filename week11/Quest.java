public class Quest {
    private String description;

    public Quest(String description) {
        this.description = description;
    }

    public void completeQuest(Character character, int points) {
        boolean isRingBearer = character.getRace().equals("Hobbit"); // Assuming only Hobbits can be Ring Bearers
        boolean success = character.completeQuest(points, isRingBearer);
        if (success) {
            System.out.println(character.getName() + " successfully completed the quest: " + description);
        } else {
            System.out.println(character.getName() + " failed to complete the quest: " + description);
        }
    }

    public boolean completeQuest(int i, Character character) {
        return false;
    }
}
