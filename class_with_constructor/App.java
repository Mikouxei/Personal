public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        knight.sayMyAttributes();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        mage.sayMyAttributes();

        // Creates a new object named "thief" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        thief.sayMyAttributes();

        // Creates a new object named "archer" from Character class
        Character archer = new Character(3, 6, 4, "Azami");
        // Calls the sayMyName method
        archer.sayMyName();
        archer.sayMyAttributes();

        // Creates a new object named "priest" from Character class
        Character priest = new Character(6, 2, 8, "Maxi");
        // Calls the sayMyName method
        priest.sayMyName();
        priest.sayMyAttributes();

    }
}
