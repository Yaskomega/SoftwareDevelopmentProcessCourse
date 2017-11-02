package main.java;

import java.util.ArrayList;
import java.util.List;

public class Troll extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //swap the cards in front of you with the cards in front of your opponent
        List<Card> swap = new ArrayList<Card>();
        // Store the kingdom of the 1st player in
        swap = game.getPlayers().get(0).getKingdom();
        game.getPlayers().get(0).setKingdom(game.getPlayers().get(1).getKingdom());
        game.getPlayers().get(1).setKingdom(swap);
    }

    public Race getRace()
    {
        return Race.TROLL;
    }
}
