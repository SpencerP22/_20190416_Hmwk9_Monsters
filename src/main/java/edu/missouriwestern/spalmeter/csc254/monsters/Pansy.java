package edu.missouriwestern.spalmeter.csc254.monsters;

public class Pansy extends Plant {
    public Pansy() {
        this(0.3);
    }
    public Pansy(double health) {
        super();
        setHealth(health);
        setStamina(0.01);
        strength = 0.01;
        aggressiveness = 0;
        passiveMessage = "looks pretty!";
        symbol = "\uD83C\uDFF5";
    }
}
