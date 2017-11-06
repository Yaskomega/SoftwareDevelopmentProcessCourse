package main.java;

public abstract class Card {
    // ********** VARIABLES **********

    // ********** CONSTRUCTORS **********

    // ********** GETTERS **********

    // ********** SETTERS **********

    // ********** METHODS **********

    /**
     * Method to apply the power of the card
     * @param game : the current game
     * @param player : the player that owns the card
     */
    public abstract void ApplyPower(Game game, Player player);

    /**
     * Method to get the Race of the card
     * @return the race of the card
     */
    public abstract Race getRace();
}
