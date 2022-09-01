public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 3;
        archer.agility = 6;
        archer.intelligence = 4;
        archer.name = "Azami";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        Character priest = new Character();

        priest.strength = 6;
        priest.agility = 2;
        priest.intelligence = 8;
        priest.name = "Maxi";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();

        Item GirdingPotion = new Item();

        GirdingPotion.price = 65;
        GirdingPotion.weight = 10.5;
        GirdingPotion.quantity = 5;
        GirdingPotion.description = "A potion that gives the taker extra 20 endurance.";
        GirdingPotion.canbetraded = false;

        Item FireProtectionPotion = new Item();

        FireProtectionPotion.price = 40;
        FireProtectionPotion.weight = 8.7;
        FireProtectionPotion.quantity = 6;
        FireProtectionPotion.description = "A potion that protects the taker from being burnt.";
        FireProtectionPotion.canbetraded = true;     
    
        Item ConcealingPotion = new Item();

        ConcealingPotion.price = 80;
        ConcealingPotion.weight = 6.3;
        ConcealingPotion.quantity = 4;
        ConcealingPotion.description = "A potion that makes the taker invisible for 1 minute.";
        ConcealingPotion.canbetraded = false;

        Pet Owl = new Pet();

        Owl.name = "Hedwig";
        Owl.trustlevel = 8;
        Owl.petlevel = 9;
        Owl.ishappy = true;
        Owl.sayMyName();
        Owl.sayMyTrustLvl();
        Owl.sayMyPetLvl();
        Owl.sayMyMood();

        Pet Rat = new Pet();

        Rat.name = "Scabbers";
        Rat.trustlevel = 1;
        Rat.petlevel = 6;
        Rat.ishappy = true;
        Rat.sayMyName();
        Rat.sayMyTrustLvl();
        Rat.sayMyPetLvl();
        Rat.sayMyMood();

        Pet Cat = new Pet();

        Cat.name = "Crookshanks";
        Cat.trustlevel = 6;
        Cat.petlevel = 7;
        Cat.ishappy = true;
        Cat.sayMyName();
        Cat.sayMyTrustLvl();
        Cat.sayMyPetLvl();
        Cat.sayMyMood();
    }
}
