package edu.missouriwestern.spalmeter.csc254.monsters;


public class Ninja extends Warrior implements Nocturnal {

    public Ninja(double health) {
        super();
        setHealth(health);
        setStamina(1.0+Math.random());
        strength = 1.40;
        aggressiveness = 1.0;
        symbol = "\uD83D\uDC40";
        changeMessages();
    }

    @Override
    public void changeMessages() {
        if (Attack.isDark()) {
            double messageChance = Math.random();
            if (messageChance < 0.25)
                attackMessage = "swings his Ninja sword expertly.";
            else if (messageChance >= 0.25 && messageChance < 0.50)
                attackMessage = "shoots a poisoned dart from his blowgun";
            else if (messageChance >= 0.50 && messageChance < 0.75)
                attackMessage = "bashes with his nunchucks";
            else
                attackMessage = "flings a throwing star";
        } else
            passiveMessage = "fades into the shadows.";

    }
}
