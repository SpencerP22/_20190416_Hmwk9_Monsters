package edu.missouriwestern.spalmeter.csc254.monsters;

public class Human extends Entity{
    public Human (){
        this(1.0);
    }

    public Human(double health){
        super();
        setSymbol();
        setHealth(health);
        setStamina(0.80);
        strength = 1.0;
        aggressiveness = Math.random();
        attackMessage = "Swings a sword";
    }
    private void setSymbol(){

        symbol = (Math.random() > 0.5)? "\uD83D\uDC69" : "\uD83D\uDC68";
    }

}
