package edu.missouriwestern.spalmeter.csc254.monsters;

public class Warrior extends Human {

    public Warrior(double health) {
        super();
        setHealth(health);
        setStamina(1.0+Math.random());
        strength = 1.40;
        aggressiveness = 1.0;
        symbol = "\uD83D\uDC82";
        attackMessage = "Attacks skillfully with a sword";
    }
    public Warrior() {
        this(1.0);
    }
}
