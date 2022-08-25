public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("\nHello I am " + name + "!");
    }

    public void sayMyAttributes() {
        System.out.println("My Strength is " + strength);
        System.out.println("My Agility is " + agility);
        System.out.println("My Intelligence is " + intelligence);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
