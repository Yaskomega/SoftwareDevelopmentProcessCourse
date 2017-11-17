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
        List<Card> swap = game.getPlayer1().getKingdom();
        // Store the kingdom of the 1st player in
        game.getPlayer1().setKingdom(game.getPlayer2().getKingdom());
        game.getPlayer2().setKingdom(swap);
    }

    public Race getRace()
    {
        return Race.TROLL;
    }
}
