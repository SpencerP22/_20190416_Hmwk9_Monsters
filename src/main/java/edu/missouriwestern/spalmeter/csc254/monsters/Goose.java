package edu.missouriwestern.spalmeter.csc254.monsters;

public class Goose extends Animal {
    public Goose() {
        this(0.5);
    }
    public Goose(double health) {
        super();
        setHealth(health/2);
        setStamina(0.05);
        strength = 0.1;
        aggressiveness = 0.99; //geese are rude and like to attack at every opportunity
        attackMessage = "Honks angrily";
        passiveMessage = "Peers into your soul with dark black eyes";
        symbol = "\uD83E\uDD86";
    }
}
