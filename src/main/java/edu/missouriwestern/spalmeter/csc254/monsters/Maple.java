package edu.missouriwestern.spalmeter.csc254.monsters;

public class Maple extends Plant {
    public Maple() {
        this(1.0);
    }
    public Maple(double health) {
        super();
        setHealth(health);
        setStamina(40);
        strength = 0.05;
        aggressiveness = 0.02;
        symbol = "\uD83C\uDF41";
        attackMessage = "A strong gust of wind whips the tree's branches around";
        passiveMessage = "The strong maple tree stands tall";
    }
}
