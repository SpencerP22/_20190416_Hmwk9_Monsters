import edu.missouriwestern.spalmeter.csc254.monsters.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Entity a = new Human();
        Entity b = new Human();
        Human  c = new Human();
        Human d = new Human(0.80);
        Warrior e = new Warrior(0.90);
        Warrior f = new Warrior();
        Entity g = new Warrior();
        Entity h = new Warrior();
        Entity x = new Ninja(1.0);
        Ninja y = new Ninja(0.9);
        Wolf wolf = new Wolf();
        Wolf secondWolf = new Wolf();
        Goose goose = new Goose();

        ArrayList<Entity> creatures = new ArrayList<Entity>();
        creatures.add(a);
        creatures.add(b);
        creatures.add(c);
        creatures.add(d);
        creatures.add(new Warrior());
        creatures.add(new Human());
        creatures.add(new Human(0.95));
        creatures.add(new Human(100.0));

        print(creatures);
        //Run a match between two humans
        runMatch(a,b);
        //Run a match between two warriors
        runMatch(e,f);
        //Run a match between a human and a warrior
        runMatch(c,g);
        //Run a match between a ninja and a warrior
        runMatch(x,h);
        //Run a match between a human and a wolf
        runMatch(d, wolf);
        //Run a match between a wolf and a goose
        runMatch(secondWolf,goose);


        System.out.println("\uD83C\uDF84\uD83C\uDF84\uD83C\uDF84");
    }
    //user enters two entities and simulates a match between the two
    public static void runMatch(Entity a, Entity b) {
        Entity matchWinner = match(a,b);
        if(matchWinner == null)
            System.out.println("It's a draw!");
        else
            System.out.println(matchWinner + " is the winner");
    }
    public static <T> void print(ArrayList<T> list){
        System.out.printf("\n------------------ %d items\n", list.size());
        for(T t : list){
            System.out.println(t);
        }
    }

    /**
     * This runs a set of rounds until at least one player is dead.
     *
     * After the rounds are completed the winner is printed
     *
     * In the postmortem both players are printed.
     *
     * @param a  One player
     * @param b  A second player
     * @return The Winner object, in all it's bloody glory
     */

    public static Entity match(Entity a, Entity b){
        int round = 1;
        while(round <= 10 && !a.isDead() && !b.isDead()){
            System.out.printf("\nRound %2d %s VS %s\n", round, a, b);
            Attack.round(a,b,round);
            round++;
        }

        //Find the winner, if any
        Entity winner = null;
        if(a.isDead() && !b.isDead())
            winner = b;
        else if(!a.isDead() && b.isDead())
            winner = a;

        System.out.println("Postmortem: ");
        System.out.printf("%s %s\n", a.isDead()?"\uD83D\uDC80":"\uD83D\uDE03", a);
        System.out.printf("%s %s\n", b.isDead()?"\uD83D\uDC80":"\uD83D\uDE03", b);

        return winner;
    }
}
