package edu.missouriwestern.spalmeter.csc254.monsters;

public abstract class Animal extends Entity {

    public Animal() {
    super(); //uses super constructor to set ID
    symbol = "\uD83D\uDC3C";
    strength = 0.5; // 1 would be an attack from a large animal like a bear
    aggressiveness = 0.3;  //1.0 would be an angered T-Rex.  Must not be > 1.0
    attackMessage = "Attacks generically";
    passiveMessage = "sits back and looks into the sky";
    }
}
