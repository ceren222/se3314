import java.util.ArrayList;

/**
 * Represents a quest in the Lord of the Rings universe.
 */
public class Quest {
    private String questName;
    private Character leader;
    private ArrayList<Character> participants;
    private MiddleEarthMap map;

    /**
     * Constructs a Quest with the given quest name, leader, and map.
     *
     * @param questName The name of the quest.
     * @param leader The leader of the quest.
     * @param map The map associated with the quest.
     * @throws IllegalArgumentException if questName, leader, or map is null.
     */
    public Quest(String questName, Character leader, MiddleEarthMap map) {
        assert questName != null && !questName.isEmpty() : "Quest name cannot be null or empty";
        assert leader != null : "Leader cannot be null";
        assert map != null : "Map cannot be null";

        this.questName = questName;
        this.leader = leader;
        this.map = map;
        this.participants = new ArrayList<>();
    }

    /**
     * Returns the name of the quest.
     *
     * @return The name of the quest.
     */
    public String getQuestName() {
        return questName;
    }

    /**
     * Sets the name of the quest.
     *
     * @param questName The new name of the quest.
     * @throws IllegalArgumentException if questName is null or empty.
     */
    public void setQuestName(String questName) {
        assert questName != null && !questName.isEmpty() : "Quest name cannot be null or empty";
        this.questName = questName;
    }

    /**
     * Returns the leader of the quest.
     *
     * @return The leader of the quest.
     */
    public Character getLeader() {
        return leader;
    }

    /**
     * Sets the leader of the quest.
     *
     * @param leader The new leader of the quest.
     * @throws IllegalArgumentException if leader is null.
     */
    public void setLeader(Character leader) {
        assert leader != null : "Leader cannot be null";
        this.leader = leader;
    }

    /**
     * Returns the list of participants in the quest.
     *
     * @return The list of participants in the quest.
     */
    public ArrayList<Character> getParticipants() {
        return participants;
    }

    /**
     * Returns the map associated with the quest.
     *
     * @return The map associated with the quest.
     */
    public MiddleEarthMap getMap() {
        return map;
    }

    /**
     * Adds a participant to the quest.
     *
     * @param character The character to add as a participant.
     * @throws IllegalArgumentException if character is null.
     */
    public void addParticipant(Character character) {
        assert character != null : "Participant cannot be null";
        participants.add(character);
    }

    /**
     * Starts the quest and displays information about it.
     */
    public void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader);
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant);
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) {
            System.out.println(location);
        }
    }
}
