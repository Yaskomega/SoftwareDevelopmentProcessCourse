package main.java;

public class Korrigan extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //draw 2 random cards within your opponent hand
        game.getPlayer1().Draw(game.getPlayer2().getHand());
        game.getPlayer1().Draw(game.getPlayer2().getHand());
    }

    public Race getRace()
    {
        return Race.KORRIGAN;
    }
}
