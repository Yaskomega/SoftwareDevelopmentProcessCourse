package main.java;

public class Dryad extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //stole a card in front of your opponent and add it in front of you without activating its power
        game.getPlayer1().AddCardToKingdom(game.getPlayer2().getKingdom().remove(0));
    }

    public Race getRace()
    {
        return Race.DRYAD;
    }
}
