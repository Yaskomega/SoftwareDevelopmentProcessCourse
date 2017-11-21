package main.java;

public class Gnome extends Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********
    public void ApplyPower(Game game, Player player)
    {
        //draw 2 cards
        player.Draw(game.getDeck());
        player.Draw(game.getDeck());
    }
    public Race getRace()
    {
        return Race.GNOME;
    }
}
