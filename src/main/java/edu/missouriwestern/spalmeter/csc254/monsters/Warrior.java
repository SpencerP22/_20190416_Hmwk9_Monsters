package edu.missouriwestern.spalmeter.csc254.monsters;

public class Warrior extends Human {
    public Warrior() {
        this(1.0);
    }

    public Warrior(double health) {
        super();
        setHealth(health);
        setStamina(1.0+Math.random());
        strength = 1.40;
        aggressiveness = 1.0;
        attackMessage = "Attacks skillfully with a sword";
        symbol = "\uD83D\uDC82";
    }

}
