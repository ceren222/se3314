import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String race;
    private int age;
    private List<Character> friends;

    public Character(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Age: " + age);
        System.out.println("Friends: " + friends.size());
        for (Character friend : friends) {
            System.out.println("- " + friend.getName());
        }
    }

    public void addFriend(Character friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            System.out.println(name + " is now friends with " + friend.getName());
        } else {
            System.out.println(name + " is already friends with " + friend.getName());
        }
    }

    public void completeQuest(Quest quest) {
        boolean success = quest.completeQuest(50, this);
        if (success) {
            System.out.println(name + " successfully completed the quest!");
        } else {
            System.out.println(name + " failed to complete the quest.");
        }
    }

    public String getName() {
        return name;
    }

    public boolean completeQuest(int points, boolean isRingBearer) {
        return isRingBearer;
    }

    public Object getRace() {
        return null;
    }
}
