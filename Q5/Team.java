import java.util.ArrayList;
import java.util.List;

public class Team {
    private int code;
    private List<Player> players;

    // Constructor
    public Team(int code) {
        this.code = code;
        this.players = new ArrayList<>();
    }

    // Operation from UML
    public void addPlayer(Player player) {
        players.add(player);
    }

    public String toString() {
        return "Team Code: " + code + ", Players: " + players;
    }
}
