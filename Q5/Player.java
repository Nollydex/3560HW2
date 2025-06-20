public class Player {
    private String name;
    private boolean expert;

    // Fully parameterized constructor
    public Player(String name, boolean expert) {
        this.name = name;
        this.expert = expert;
    }

    public String toString() {
        return "Player: " + name + ", Expert: " + expert;
    }
}
