package edu.missouriwestern.spalmeter.csc254.monsters;

public class Cactus extends Plant implements Nocturnal{
    public Cactus() {
        this(1.0);
    }
    public Cactus(double health) {
        setHealth(health);
        setStamina(2.5);
        strength = 0.2;
        aggressiveness = 0.8;
        symbol = "\uD83C\uDF35";
        changeMessages();
    }

    @Override
    public void changeMessages() {
        if(Attack.isDark())
            attackMessage = "Hidden in the dark of night, the cactus's needles sting";
        else
            passiveMessage = "The cactus stands tall in the sunlight";
    }
}
