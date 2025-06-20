import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String breed;
    private String name;
    private List<Paw> paws;

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
        this.paws = new ArrayList<>();

        // Composition: create 4 paws for this dog
        for (int i = 1; i <= 4; i++) {
            paws.add(new Paw(i));
        }
    }

    public String toString() {
        return "Dog: " + breed + " " + name + ", Paws: " + paws;
    }
}
