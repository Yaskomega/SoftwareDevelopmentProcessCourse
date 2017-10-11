package main.java;

import java.util.List;

public class Game {

    // ********** VARIABLES **********
    private List<Player> players; // The list of players
    private List<Card> deck; // The decks composed of cards to be drown

    // ********** CONSTRUCTORS **********
    public Game() {

    }

    public Game(List<Player> players) {
    }

    // ********** GETTERS **********
    public List<Player> getPlayers() {
        return players;
    }

    public List<Card> getDeck() {
        return deck;
    }

    // ********** SETTERS **********
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    // ********** METHODS **********

    /**
     * Method to know if the deck is empty or not
     * @return true if the deck is empty, else false
     */
    public boolean DeckIsEmpty(){
        // TO BE COMPLETED ...
        return true;
    }

    /**
     * Method to know if the game is over or not
     * @return true if the game is over, else false
     */
    public boolean GameOver(){
        // TO BE COMPLETED ...
        return true;
    }

    public String toString() {
        return "Game{}";
    }
}
