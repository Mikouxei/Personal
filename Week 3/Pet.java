public class Pet {
    String name;
    int trustlevel;
    int petlevel;
    boolean ishappy;

    public void sayMyName() {
        System.out.println("\nHello I am " + name + "!");
    }
    
    public void sayMyTrustLvl() {
        System.out.println("My Trust Level is " + trustlevel);
    }
    public void sayMyPetLvl() {
        System.out.println("My Pet Level is " + petlevel);
    }
    public void sayMyMood() {
        System.out.println(name + " is happy!");

    }
}