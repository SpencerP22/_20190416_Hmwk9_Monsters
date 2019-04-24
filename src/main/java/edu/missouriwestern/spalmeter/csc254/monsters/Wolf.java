package edu.missouriwestern.spalmeter.csc254.monsters;

public class Wolf extends Animal implements Nocturnal{
    public Wolf() {
        this(1.0);
    }
    public Wolf(double health) {
        super();
        setHealth(health);
        setStamina(0.385);
        strength = 0.7;
        aggressiveness = 0.60;
        symbol = "\uD83D\uDC3A";
        changeMessages();
    }

    @Override
    public void changeMessages() {
        if(Attack.isDark())
            attackMessage = "Lashes out with its claws";
        else
            passiveMessage = "circles around and stares at its prey";
        }
    }

