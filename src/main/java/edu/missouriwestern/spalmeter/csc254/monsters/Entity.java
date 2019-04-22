package edu.missouriwestern.spalmeter.csc254.monsters;

/**
 * Entity is intended to be an abstract class, although it is not in its current form
 * <p>
 * The following recommendations are for all entities:
 * - strength:  values should be 0.00 through 9.99
 * any value over 2.0 is likely to be an instant kill.
 * 1.0 would be a full strength human with a sword.
 * Something like a plant would have a strength of 0.0
 * A bunny might have a strength of .05 unless it is a Monty Python bunny
 * A T-Rex might have a strength of 5.5
 * - aggressiveness:  Must be between 0 and 1.0
 * 1.0 would mean attacks at every opportunity.
 * 0.7 would attack 70% of the time and not attack 30%
 * 0 would be for something like a plant.
 * - health:  Health also represents stamina
 * Value should be > 0.0 through 1.00
 * Anything below .10 is considered unconscious
 * 0 is dead.
 * 1.0 is full health (100%)
 * <p>
 * Symbols are taken from unicode or just txt.
 * For an alien you could use 👽
 * A good source is https://emojipedia.org
 * Using emoji will mess up printing because they are not standard width.
 * - stamina:   Stamina  is greater than 0.
 * Stamina is roughly approximated by size.  A good start is
 * 1 KG = .01 point of stamina
 * .80 would be about 180 pound human.
 * 1. would be about a 250 pound human (maybe a warrior)
 */
public abstract class Entity implements Comparable<Entity> {

    String symbol = "❇️";// https://emojipedia.org  sparkle
    static private int nextID = 10001;
    static double strength = 0.0; // 1. is normal human strength
    static double aggressiveness = 0.0;  //1.0 is human in combat situation.  Must not be > 1.0
    protected String attackMessage = "attacks generically";
    protected String passiveMessage = "stares into space";
    //individual characteristics
    private int id;
    private double health;
    private double stamina = 0.0;


    public Entity() {
        id = nextID;
        nextID++;
    }

    public int getId(){
        return id;
    }

    public void setHealth(double health) {
        this.health = health;
        if (health > 1.0)
            this.health = 1.0;
        if (health < 0.)
            this.health = 0;
    }

    public void setStamina(double stamina) {
        this.stamina = (stamina > 0.10) ? stamina : 0.10;
    }
    public String getSymbol(){
        return symbol;
    }


    public double getHealth() {
        return health;
    }

    public void subtractHealth(double delta) {
        double delta2 = Math.abs(delta);  //prevents adding negative health;
        health -= delta2;
    }

    public void subtractStamina(double delta) {
        double delta2 = Math.abs(delta);
        stamina = (stamina - delta2 > 0.10) ? (stamina - delta) : 0.10;
    }

    public String getAttackMessage() {
        return attackMessage;
    }

    public String getPassiveMessage() {
        return passiveMessage;
    }

    public double getAggressiveness() {
        return aggressiveness;
    }

    public double getStamina() {
        return stamina;
    }

    private int round(double x) {
        return (int) Math.round(x * 100);
    }

    public String toString() {
        return String.format("%8s %s %6d (%3d%%/%3d/%3d)", symbol, getName(), id,
                round(getHealth()), round(stamina), round(aggressiveness));
    }

    public boolean isDead() {
        return health <= 0.0;
    }

    public double getStrength() {
        return strength;
    }

    public String getName() {
        String fullName = String.format("%s", getClass());
        int lastPeriod = fullName.lastIndexOf(".");
        String shortName = fullName.substring(lastPeriod + 1);

        return shortName;
    }

    //equals and hasCode were generated automatically, using only the id field.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity that = (Entity) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }


    public int compareTo(Entity other) {
        return this.id - other.id;
    }
}

